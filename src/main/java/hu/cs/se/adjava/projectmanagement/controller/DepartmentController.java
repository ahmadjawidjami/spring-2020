package hu.cs.se.adjava.projectmanagement.controller;

import hu.cs.se.adjava.projectmanagement.model.Department;
import hu.cs.se.adjava.projectmanagement.service.DepartmentService;
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

    @GetMapping("/department/all")
    public ResponseEntity<List<Department>> getAllDepartments() {

        return new ResponseEntity<>(departmentService.getAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/department/add")
    public ResponseEntity<Department> addDepartment(@RequestBody Department department) {

       Department savedDepartment = departmentService.saveDepartment(department);

       return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
    }
}
