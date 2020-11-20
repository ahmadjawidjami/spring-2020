package hu.cs.se.adjava.projectmanagement.service;

import hu.cs.se.adjava.projectmanagement.dto.DepartmentDTO;
import hu.cs.se.adjava.projectmanagement.model.Department;

import java.util.List;

public interface DepartmentService {

    Department saveDepartment(Department department);

    Department getById(Integer id);

    List<Department> getAll();

    List<DepartmentDTO> convertToDTO(List<Department> departments);
    DepartmentDTO convertToDTO(Department department);
}
