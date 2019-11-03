package com.balindra.student.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balindra.student.dal.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
