package com.demo.apiexamples;

import com.demo.apiexamples.data.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class ApiExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiExamplesApplication.class, args);
		//int i=null;

		//List<Integer> nums= Arrays.asList(1,12,15,20,29);
		List<Employee> employesList=new ArrayList<>();
		int[] numList={23,5,6,15};
		Arrays.stream(numList).map(num->num*2).forEach(System.out::println);

		employesList.add(new Employee(6,"sandhya","hyd",20,"female","IT",2011,200000));
		employesList.add(new Employee(7,"saikrishna","hyd",40,"male","Admin",2019,150000));
		employesList.add(new Employee(8,"Jaya","hyd",20,"female","DB",2022,550000));

		//Write a program that groups a list of people by their age and counts how many people are in each age group
		Map<Integer,Long> groupedby=employesList.stream().collect(Collectors.groupingBy(Employee::getAge,Collectors.counting()));
		System.out.println(groupedby);

		//List of employees
		employesList.stream().forEach(System.out::println);

		employesList.stream().filter(Employee->Employee.getSalary()>150000).forEach(System.out::println);

		employesList.stream().filter(Employee->Employee.getDepartment().equals("IT")).map(Employee::getName).forEach(System.out::println);

		//EMployee with max salary
		String maxSalryEmp=employesList.stream()
				.max(Comparator.comparing(Employee::getSalary))
				.map(Employee::getName).get();

		System.out.println(maxSalryEmp);

		String minSalEmp=employesList.stream()
				         .min(Comparator.comparing(Employee::getSalary))
							.map(Employee::getName).get();
		System.out.println(minSalEmp);

		//Get the unique department
		String depNames=employesList.stream()
				.map(Employee::getDepartment)
				.distinct()
				.collect(Collectors.joining(","));

		System.out.println(depNames);














	}

}
