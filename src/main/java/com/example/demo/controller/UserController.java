package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.iservice.Interservice;
import com.example.demo.module.Student;

@RestController
public class UserController {
@Autowired
Interservice ser;

@PostMapping("/add")
public Student savestudent(@RequestBody Student stu) {
	return ser.savestudentS(stu);
}

@PostMapping("/adddata")
public List<Student> savestudentdata(@RequestBody List<Student> ss ){
	return ser.savedata(ss);
}
@GetMapping("/get/{s_id}")
public Student getbyid(@PathVariable("s_id") int s_id){
	return  ser.getStudentbyid(s_id);
}


//@GetMapping("/getbyname/{s_id}")
//public Student getbyname(@PathVariable("s_id") int s_id) {
//	return ser.getstudentbyname(s_id); 
//}
	
@GetMapping("/getname/{name}")
public Student getname(@PathVariable("name") String name) {
	return ser.getstuname(name); }

@GetMapping("/getalldata")
public List<Student> getalldata()
{
	return ser.getdata();
	
}

@DeleteMapping("/delete/{s_id}")
public String deletedata(@PathVariable int s_id) {
	return ser.delete(s_id);
	
}

@PutMapping("/update")
public Student updatedata(@RequestBody Student s) {
	return ser.updateid(s);
}
}