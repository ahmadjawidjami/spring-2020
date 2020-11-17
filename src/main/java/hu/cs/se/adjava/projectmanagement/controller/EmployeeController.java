package hu.cs.se.adjava.projectmanagement.controller;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import hu.cs.se.adjava.projectmanagement.dto.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.cs.se.adjava.projectmanagement.model.Employee;
import hu.cs.se.adjava.projectmanagement.service.EmployeeService;

/**
 * EmployeeController
 */
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  @GetMapping("/employee/all")

  public ResponseEntity<List<EmployeeDTO>> getEmployees() {

    List<Employee> employees = employeeService.getAllEmployees();

    List<EmployeeDTO> employeeDTOList = employeeService.convertToDTO(employees);

    return new ResponseEntity<>(employeeDTOList, HttpStatus.OK);

  }

  @PostMapping("/employee/add")
  public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) throws FileNotFoundException {

    Employee savedEmployee = employeeService.addEmployee(employee);

    return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
  }

  @GetMapping("/employee/{id}")
  public ResponseEntity<Employee> getEmployee(@PathVariable("id") Integer id) {

    Employee employee = employeeService.getEmployeeById(id);

    return new ResponseEntity<>(employee, HttpStatus.OK);
  }

  @PutMapping("/employee/update")
  public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {

    Employee savedEmployee = employeeService.addEmployee(employee);

    return new ResponseEntity<>(savedEmployee, HttpStatus.OK);
  }

  @DeleteMapping("/employee/{id}/delete")
  public ResponseEntity<String> deleteEmployee(@PathVariable("id") Integer id) {

    employeeService.deleteEmployeeById(id);

    return new ResponseEntity<>("Employee " + id + " deleted", HttpStatus.OK);

  }

}