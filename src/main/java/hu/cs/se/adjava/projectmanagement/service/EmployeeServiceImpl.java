package hu.cs.se.adjava.projectmanagement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import hu.cs.se.adjava.projectmanagement.dto.EmployeeDTO;
import org.modelmapper.ModelMapper;
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

  @Autowired
  private ModelMapper modelMapper;



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

  @Override
  public List<EmployeeDTO> convertToDTO(List<Employee> employees) {


    List<EmployeeDTO> employeeDTOList = new ArrayList<>();

    for (Employee employee : employees) {
      EmployeeDTO employeeDTO = modelMapper.map(employee, EmployeeDTO.class);
      employeeDTO.setProjectsIds(employee.getProjects().stream().map(project -> project.getId()).collect(Collectors.toList()));
      employeeDTOList.add(employeeDTO);

    }
    return employeeDTOList;
  }

  @Override
  public Employee convertToDTO(Employee employee) {
    return null;
  }

}