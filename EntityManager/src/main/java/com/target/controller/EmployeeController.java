package com.target.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.target.model.Employee;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController extends EntityController<Employee>{

}
