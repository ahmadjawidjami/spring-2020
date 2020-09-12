package hu.cs.se.adjava.projectmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.cs.se.adjava.projectmanagement.model.Employee;
import hu.cs.se.adjava.projectmanagement.repository.EmployeeRepository;

/**
 * EmployeeServiceImpl
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  private EmployeeRepository employeeRepository;

  @Override
  public Employee addEmployee(Employee employee) {

    return employeeRepository.save(employee);
  }

  @Override
  public List<Employee> getAllEmployees() {
    return employeeRepository.findAll();
  }

  @Override
  public Employee getEmployeeById(Integer id) {

    return employeeRepository.getOne(id);
  }

  @Override
  public void deleteEmployeeById(Integer id) {
    employeeRepository.deleteById(id);

  }

}