package com.example.demo.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import com.example.demo.model.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
@Autowired
StudentService eser;
@PostMapping("add")
public StudentEntity add(@RequestBody StudentEntity ee) {
	return eser.saveinfo(ee);
}
@GetMapping("disp")
public List<StudentEntity> show(){
	return eser.showinfo();
}

@PutMapping("update")
public StudentEntity modify(@RequestBody StudentEntity ee) {
	return eser.changeinfo(ee);
}
@DeleteMapping("delete")
public String del(@RequestBody StudentEntity ee) {
	eser.deleteinfo(ee);
	return "Deleted successfully";
}
}