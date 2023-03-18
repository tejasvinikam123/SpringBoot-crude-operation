package com.example.demo.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.homerepository.HomeRepository;
import com.example.demo.iservice.Interservice;
import com.example.demo.module.Student;

@Service
public class Serviceimpl implements Interservice {

	@Autowired
	HomeRepository hr;
	
	@Override
	public Student savestudentS(Student stu) {
		
		return hr.save(stu);
	}

	@Override
	public Student getStudentbyid(int s_id) {
		
		return hr.findById(s_id).orElse(null);
	}

	@Override
	public Student getstudentbyname(int s_id) {
		
		return hr.findById(s_id).orElse(null);
	}

	@Override
	public Student getstuname(String name) {
	
		return hr.findByName(name);
	}

	@Override
	public List<Student> savedata(List<Student> ss) {
		
		return hr.saveAll(ss);
	}

	@Override
	public List<Student> getdata() {
		
		return hr.findAll();
	}

	@Override
	public String delete(int s_id) {
		
		hr.deleteById(s_id);
		return "deleted succefully:"+s_id;
	}

	@Override
	public Student updateid(Student s) {
		Student existingstu=hr.findById(s.getS_id()).orElse(null);
		existingstu.setName(s.getName());
		existingstu.setAddress(s.getAddress());
		return hr.save(existingstu);
	}

}
