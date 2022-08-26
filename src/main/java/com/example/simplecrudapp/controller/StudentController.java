package com.example.simplecrudapp.controller;

import com.example.simplecrudapp.SimpleCrudAppApplication;
import com.example.simplecrudapp.entity.Student;
import com.example.simplecrudapp.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
//@AllArgsConstructor
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;
    private static final Logger LOG = Logger.getLogger(SimpleCrudAppApplication.class.getName());

    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        return service.save(student);
    }

    @GetMapping
    public List<Student> getStudents(){
        LOG.log(Level.INFO, "Index API is calling");
        return service.getStudents();
    }

    @GetMapping("/{student_id}")
    public Student getStudent(@PathVariable("student_id") Long id){
        return service.getStudent(id).orElseThrow(IllegalArgumentException::new);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student){
        return service.update(student);
    }

    @DeleteMapping("/{student_id}")
    public void deleteStudent(@PathVariable("student_id") Long id){
        service.deleteStudent(id);
    }
}
