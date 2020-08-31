package hu.cs.se.adjava.projectmanagement.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import hu.cs.se.adjava.projectmanagement.model.Employee;

/**
 * EmployeeController
 */
@RestController
public class EmployeeController {

  @GetMapping("/employee/all")
  @ResponseBody
  public List<Employee> getEmployee() {

    Employee employee1 = new Employee(1, "firstName", "lastName", "gender", 20000.0);
    Employee employee2 = new Employee(2, "firstName2", "lastName2", "gender2", 20000.0);

    ArrayList<Employee> employees = new ArrayList<>();
    employees.add(employee1);
    employees.add(employee2);

    return employees;
  }

}