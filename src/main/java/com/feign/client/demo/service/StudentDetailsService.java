package com.feign.client.demo.service;

import com.feign.client.demo.feigninterface.StudentFeign;
import com.feign.client.demo.model.StudentDetails;
import com.feign.client.demo.model.StudentInfo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentDetailsService")
@AllArgsConstructor
@Slf4j
public class StudentDetailsService {
    private final StudentFeign studentFeign;

   public List<StudentInfo> getStudentInfo(){
        StudentDetails students = studentFeign.getStudents();
        log.info("StudentDetails received: Status code : {}",students.getStatus());
       return  students.getResponse();
    }

    public StudentInfo addStudentDetails(StudentInfo studentInfo){
      return  studentFeign.addStudent(studentInfo);
    }
}
