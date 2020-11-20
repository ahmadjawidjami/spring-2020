package hu.cs.se.adjava.projectmanagement.controller;

import hu.cs.se.adjava.projectmanagement.dto.DepartmentDTO;
import hu.cs.se.adjava.projectmanagement.model.Department;
import hu.cs.se.adjava.projectmanagement.service.DepartmentService;
import hu.cs.se.adjava.projectmanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/department/all")
    public ResponseEntity<List<DepartmentDTO>> getAllDepartments() {

        List<Department> departments = departmentService.getAll();

        List<DepartmentDTO> departmentDTOList = departmentService.convertToDTO(departments);

        return new ResponseEntity<>(departmentDTOList, HttpStatus.OK);
    }

    @PostMapping(value = "/department/add")
    public ResponseEntity<DepartmentDTO> addDepartment(@RequestBody Department department) {

        department.setManager(employeeService.getEmployeeById(12));

       Department savedDepartment = departmentService.saveDepartment(department);

       DepartmentDTO departmentDTO = departmentService.convertToDTO(savedDepartment);

       return new ResponseEntity<>(departmentDTO, HttpStatus.CREATED);
    }
}
