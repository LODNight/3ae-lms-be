package com.lms._ae.modules.student.services;

import com.lms._ae.modules.student.payload.student.DtoRequestStudent;
import com.lms._ae.modules.student.payload.student.DtoStudent;
import com.lms._ae.modules.student.payload.student.ResponseStudent;

public interface StudentService {

    DtoStudent createStudent(DtoRequestStudent requestStudent);

    DtoStudent getStudentById(Long id);

    ResponseStudent getAllStudent(Integer pageNumber, Integer pagSize, String sortBy, String sortOrder);

    DtoStudent updateStudent(Long Id, DtoStudent dtoStudent);

    String deleteStudentById(Long id);
}
