package net.javaguides.springboot.service;

import net.javaguides.springboot.controller.response.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDto> getAllEmployees();
}
