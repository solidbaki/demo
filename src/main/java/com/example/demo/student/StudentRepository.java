package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // For Data Access
public interface StudentRepository extends JpaRepository<Student, Long> {

}
