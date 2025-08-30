package com.lms._ae.modules.student.mapper;

import com.lms._ae.modules.student.entities.Student;
import com.lms._ae.modules.student.payload.student.DtoRequestStudent;
import com.lms._ae.modules.student.payload.student.DtoStudent;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    Student toEntity(DtoRequestStudent requestStudent);

    DtoStudent toDto(Student student);
    List<DtoStudent> toDtoList(List<Student> students);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateStudentFromDto(DtoStudent dtoStudent, @MappingTarget Student student);
}
