package com.atguigu.ssm.service;

import com.atguigu.ssm.pojo.Employee;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ author  tanruikai
 * @ date  2022/7/19 16:25
 * @ version 1.0
 */
@Service
public interface EmployeeService {

    /**
     * select all users' info
     * @return
     */
    List<Employee> getAllEmployee();

    PageInfo<Employee> getEmployeePage(Integer pageNum);

}
