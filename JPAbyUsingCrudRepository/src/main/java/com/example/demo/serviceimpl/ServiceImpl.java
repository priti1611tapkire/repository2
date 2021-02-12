package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.HomeRepository;
import com.example.demo.servicei.ServiceI;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	HomeRepository hr;

	@Override
	public void saveData(Student s) {
		// TODO Auto-generated method stub
		hr.save(s);
	}
	
}
