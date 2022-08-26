package com.example.simplecrudapp.repository;

import com.example.simplecrudapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
