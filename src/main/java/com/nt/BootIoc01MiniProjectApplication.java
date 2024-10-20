package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.EmployeeController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootIoc01MiniProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIoc01MiniProjectApplication.class, args);

		EmployeeController controller = ctx.getBean("empController", EmployeeController.class);

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter desg1");
		String desg1 = scn.next();
		System.out.println("Enter desg2");
		String desg = scn.next();
		System.out.println("Enter desg3");
		String desg3 = scn.next();
		scn.close();
		try {
			List<Employee> list = controller.processEmployeeByDesgs(desg1, desg, desg3);
			list.forEach(emp -> {
				System.out.println(emp);
			});
		} catch (Exception e) {
			 e.printStackTrace();
			System.out.println("try again");
		}

	}

}
