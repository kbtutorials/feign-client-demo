package com.feign.client.demo.api;

import com.feign.client.demo.model.StudentDetails;
import com.feign.client.demo.model.StudentInfo;
import com.feign.client.demo.service.StudentDetailsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class StudentApi {
    private final StudentDetailsService studentDetailsService;
    @GetMapping(value="/getStudentDetails")
    List<StudentInfo> getStudentDetails(){
       return studentDetailsService.getStudentInfo();
    }
    @PostMapping(value ="/addStudentDetails")
    StudentInfo addStudentDetails(@RequestBody StudentInfo studentInfo){
       return studentDetailsService.addStudentDetails(studentInfo);
    }
}
