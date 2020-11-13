package hu.cs.se.adjava.projectmanagement.service;

import hu.cs.se.adjava.projectmanagement.model.Department;
import hu.cs.se.adjava.projectmanagement.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department getById(Integer id) {
        return departmentRepository.getOne(id);
    }

    @Override
    public List<Department> getAll() {
        return departmentRepository.findAll();
    }
}
