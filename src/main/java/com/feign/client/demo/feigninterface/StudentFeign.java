package com.feign.client.demo.feigninterface;

import com.feign.client.demo.model.StudentDetails;
import com.feign.client.demo.model.StudentInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "studentFeign", url = "http://localhost:9012/mock")
public interface StudentFeign {
    @GetMapping(value = "/getStudents")
    StudentDetails getStudents();

    @PostMapping(value="/addStudent")
    StudentInfo addStudent(@RequestBody StudentInfo studentInfo);
}
