package com.lms._ae.modules.student.controller;

import com.lms._ae.modules.student.Config.AppConstant;
import com.lms._ae.modules.student.payload.student.DtoRequestStudent;
import com.lms._ae.modules.student.payload.student.DtoStudent;
import com.lms._ae.modules.student.payload.student.ResponseStudent;
import com.lms._ae.modules.student.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private final StudentService studentService;

    @PostMapping("/create")
    public ResponseEntity<?> createNewStudent(@Valid @RequestBody DtoRequestStudent requestStudent) {
        DtoStudent newStudent = studentService.createStudent(requestStudent);
        return ResponseEntity.ok(newStudent);
    }


    @GetMapping
    public ResponseEntity<ResponseStudent> getAllStudent(
            @RequestParam(name = "pageNumber", defaultValue = AppConstant.PAGE_NUMBER,required = false) Integer pageNumber,
            @RequestParam(name = "pageSize", defaultValue = AppConstant.PAGE_SIZE,required = false) Integer pagSize,
            @RequestParam(name = "sortBy", defaultValue = "lastName",required = false) String sortBy,
            @RequestParam(name = "sortOrder", defaultValue = AppConstant.SORT_DIR,required = false) String sortOrder
    ) {
        ResponseStudent student = studentService.getAllStudent(pageNumber, pagSize,sortBy , sortOrder );
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping("/{studentId}")
    public ResponseEntity<DtoStudent> getStudentById(@PathVariable Long studentId) {
        DtoStudent dtoStudent=  studentService.getStudentById(studentId);
        return ResponseEntity.ok(dtoStudent);
    }

    @PatchMapping("/{studentId}")
    public ResponseEntity<DtoStudent>  updateStudentById(@PathVariable Long studentId,
                                                         @RequestBody DtoStudent patchRequest) {
        DtoStudent updateStudent = studentService.updateStudent(studentId, patchRequest);
        return ResponseEntity.ok(updateStudent);
    }

    @DeleteMapping("/{studentId}")
    public ResponseEntity<String> deleteStudentById(@PathVariable Long studentId) {
        String deletedMessage = studentService.deleteStudentById(studentId);
        return ResponseEntity.ok(deletedMessage);
    }

}
