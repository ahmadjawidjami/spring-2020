package hu.cs.se.adjava.projectmanagement.controller;

import hu.cs.se.adjava.projectmanagement.model.Department;
import hu.cs.se.adjava.projectmanagement.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping(value = "/department/add")
    public ResponseEntity<Department> addDepartment(@RequestBody Department department) {

       Department savedDepartment = departmentService.saveDepartment(department);

       return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
    }
}
