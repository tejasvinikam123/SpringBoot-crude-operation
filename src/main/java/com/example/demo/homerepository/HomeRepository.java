package com.example.demo.homerepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.module.Student;

@Repository
public interface HomeRepository extends JpaRepository<Student, Integer> {

	
	public Student findByName(String name);

}
