package hu.cs.se.adjava.projectmanagement.service;

import java.util.List;

import hu.cs.se.adjava.projectmanagement.dto.EmployeeDTO;
import hu.cs.se.adjava.projectmanagement.model.Employee;

/**
 * EmployeeService
 */
public interface EmployeeService {

  Employee addEmployee(Employee employee);

  List<Employee> getAllEmployees();

  Employee getEmployeeById(Integer id);

  void deleteEmployeeById(Integer id);

    List<EmployeeDTO> convertToDTO(List<Employee> employees);
    EmployeeDTO convertToDTO(Employee employee);
}