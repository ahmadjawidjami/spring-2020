package hu.cs.se.adjava.projectmanagement.service;

import hu.cs.se.adjava.projectmanagement.model.Department;

public interface DepartmentService {

    Department saveDepartment(Department department);

    Department getById(Integer id);
}
