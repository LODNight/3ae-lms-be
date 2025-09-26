package com.lms._ae.modules.student.services.Impl;

import com.lms._ae.Exception.ResourceNotFoundException;
import com.lms._ae.modules.student.entities.Student;
import com.lms._ae.modules.student.mapper.StudentMapper;
import com.lms._ae.modules.student.payload.student.DtoRequestStudent;
import com.lms._ae.modules.student.payload.student.DtoStudent;
import com.lms._ae.modules.student.payload.student.ResponseStudent;
import com.lms._ae.modules.student.repositories.StudentRepository;
import com.lms._ae.modules.student.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    @Autowired
    private final StudentRepository studentRepository;

    @Autowired
    private final StudentMapper studentMapper;

    @Override
    public DtoStudent createStudent(DtoRequestStudent requestStudent) {
        Student newStudent = studentRepository.save(studentMapper.toEntity(requestStudent));
        return studentMapper.toDto(newStudent);
    }

    @Override
    public DtoStudent getStudentById(Long id) {
        Student foundStudent = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student","id",id));

        return studentMapper.toDto(foundStudent);
    }

    @Override
    public ResponseStudent getAllStudent(Integer pageNumber, Integer pagSize, String sortBy, String sortOrder) {

        Sort sortByAndOrder = sortOrder.equalsIgnoreCase("asc")
                ? Sort.by(sortBy).ascending()
                : Sort.by(sortBy).descending();
        Pageable pageable = PageRequest.of(pageNumber, pagSize, sortByAndOrder);
        Page<Student> studentPageItem = studentRepository.findAll(pageable);

        List<Student> studentList = studentPageItem.getContent();
        List<DtoStudent> dtoStudentList = studentMapper.toDtoList(studentList);

        ResponseStudent responseStudent = new ResponseStudent();
        responseStudent.setContent(dtoStudentList);
        responseStudent.setPageNumber(studentPageItem.getNumber());
        responseStudent.setPageSize(studentPageItem.getSize());
        responseStudent.setTotalElements(studentPageItem.getTotalElements());
        responseStudent.setTotalPages(studentPageItem.getTotalPages());
        responseStudent.setLastPage(studentPageItem.isLast());

        return responseStudent;
    }

    @Override
    public DtoStudent updateStudent(Long Id, DtoStudent dtoStudent) {
        Student student = studentRepository.findById(Id)
                .orElseThrow(() -> new ResourceNotFoundException("Student","id",Id));

        studentMapper.updateStudentFromDto(dtoStudent, student);

        Student updatedStudent = studentRepository.save(student);
        return studentMapper.toDto(updatedStudent);
    }

    @Override
    public String deleteStudentById(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student","id",id));

        studentRepository.deleteById(id);

        return "Deleted student with id: "+id + " successfully!";
    }
}
