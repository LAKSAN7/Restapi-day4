package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


import com.example.demo.model.StudentEntity;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo er;
	public StudentEntity saveinfo(StudentEntity ee) {
		return er.save(ee);//POST	
	}
	public List<StudentEntity>showinfo(){
		return er.findAll();//GET
	}
	public StudentEntity changeinfo(StudentEntity ee) {
		return er.saveAndFlush(ee);//put
	}
	public void deleteinfo(StudentEntity ee) {
		er.delete(ee);

}
}






