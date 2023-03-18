package com.example.demo.iservice;

import java.util.List;

import com.example.demo.module.Student;

public interface Interservice {

	Student savestudentS(Student stu);

	Student getStudentbyid(int s_id);


	Student getstudentbyname(int s_id);

	Student getstuname(String name);

	List<Student> savedata(List<Student> ss);

	List<Student> getdata();

	String delete(int s_id);

	Student updateid(Student s);

}
