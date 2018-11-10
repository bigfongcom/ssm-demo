package com.bigfong.ssmshop.service.impl;

import com.bigfong.ssmshop.domain.Employee;
import com.bigfong.ssmshop.mapper.EmployeeMapper;
import com.bigfong.ssmshop.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
	private EmployeeMapper employeeMapper;



	@Transactional(readOnly=true)
	public List<Employee> listAll() {
		return employeeMapper.listAll();
	}

}
