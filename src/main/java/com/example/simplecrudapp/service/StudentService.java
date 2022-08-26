package com.example.simplecrudapp.service;

import com.example.simplecrudapp.entity.Student;
import com.example.simplecrudapp.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentService {

    private StudentRepository repository;

    public Optional<Student> getStudent(Long id){
        return repository.findById(id);
    }

    public List<Student> getStudents(){
        return repository.findAll();
    }

    public Student save(Student student){
        return repository.save(student);
    }

    public Student update(Student student){
        return repository.save(student);
    }

    public void deleteStudent(Long id){
        repository.deleteById(id);
    }

}
