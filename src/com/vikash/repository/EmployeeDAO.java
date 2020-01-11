package com.vikash.repository;

import java.util.List;
import com.vikash.domain.Employee;
public interface EmployeeDAO {
	public void insert(Employee emp);
	public int remove(int emp);
}

