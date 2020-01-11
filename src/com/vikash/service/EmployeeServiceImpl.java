package com.vikash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikash.domain.Employee;
import com.vikash.repository.EmployeeDAO;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeServices {

	EmployeeDAO employeeDao ;
    public EmployeeDAO getEmployeeDao() {
        return employeeDao;
    }
    @Autowired
    public void setEmployeeDao(EmployeeDAO employeeDao) {
        this.employeeDao = employeeDao;
    }
    
	@Override
	public void insertEmployee(Employee emp) {
		employeeDao.insert(emp);
	}

	@Override
	public int removeEmployee(int empId) {
		return employeeDao.remove(empId);
	}

}
