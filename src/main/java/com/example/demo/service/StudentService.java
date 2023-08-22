package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.model.StudentEntity;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {
    @Autowired
	StudentRepo sr;
	@GetMapping("addstudent")
	public StudentEntity saveinfo(StudentEntity ss) {
		return sr.save(ss);
	}
	@GetMapping("showstudent")
	public List<StudentEntity> showinfo(){
		return sr.findAll();
	}
}
