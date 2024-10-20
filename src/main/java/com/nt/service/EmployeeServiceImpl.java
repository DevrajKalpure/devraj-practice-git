package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;
@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDAO dao;
	
	@Override
	public List<Employee> fetchEmployeeByDesg(String desg1, String desg2, String desg3) throws Exception {
		
		desg1=desg1.toUpperCase();
		desg2=desg2.toUpperCase();
		desg3=desg3.toUpperCase();
		List<Employee> list=dao.getEmpsByDesgs(desg1, desg2, desg3);
		
		return list;
	}
	

}
