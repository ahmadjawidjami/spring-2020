package hu.cs.se.adjava.projectmanagement.controller;

import hu.cs.se.adjava.projectmanagement.model.Department;
import hu.cs.se.adjava.projectmanagement.model.Project;
import hu.cs.se.adjava.projectmanagement.service.DepartmentService;
import hu.cs.se.adjava.projectmanagement.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/project/all")
    public ResponseEntity<List<Project>> getAllProjects() {
        return new ResponseEntity<>(projectService.getAll(), HttpStatus.OK);
    }

    @PostMapping(path = "/project/add")
    public ResponseEntity<Project> addProject(@RequestBody Project project) {

        Department department = departmentService.getById(1);
        project.setDepartment(department);
        Project savedProject = projectService.saveProject(project);

        return new ResponseEntity<>(project, HttpStatus.ACCEPTED);
    }
}
