package com.example.dockerspringtask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dockerspringtask.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
