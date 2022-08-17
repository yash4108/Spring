package com.mindgate.repository;

public class EmployeeRepository implements EmployeeRepositoryInterface {

	@Override
	public boolean addEmployee() {
		System.out.println("employee repository addEmployee()");
		return false;
	}

}
