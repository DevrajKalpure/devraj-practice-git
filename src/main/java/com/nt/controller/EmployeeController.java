package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeService;

@Controller("empController")
public class EmployeeController{
	@Autowired
	private IEmployeeService empservice;
	
	public List<Employee> processEmployeeByDesgs(String desg1,String desg2,String desg3)throws Exception {
		
		List<Employee> list=empservice.fetchEmployeeByDesg(desg1, desg2, desg2);

		return list;
	}
     
	//List<Employee> list=empservice.fetchEmployeeByDesg(desg1, desg2, desg2);
	//return list;
}