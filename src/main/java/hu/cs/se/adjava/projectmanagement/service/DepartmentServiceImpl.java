package hu.cs.se.adjava.projectmanagement.service;

import hu.cs.se.adjava.projectmanagement.dto.DepartmentDTO;
import hu.cs.se.adjava.projectmanagement.dto.EmployeeDTO;
import hu.cs.se.adjava.projectmanagement.model.Department;
import hu.cs.se.adjava.projectmanagement.model.Employee;
import hu.cs.se.adjava.projectmanagement.repository.DepartmentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private ModelMapper modelMapper;
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

    @Override
    public List<DepartmentDTO> convertToDTO(List<Department> departments) {
        List<DepartmentDTO> departmentDTOList = new ArrayList<>();

        for (Department department : departments) {
            DepartmentDTO departmentDTO = modelMapper.map(department, DepartmentDTO.class);
            departmentDTOList.add(departmentDTO);

        }

        return departmentDTOList;
    }

    @Override
    public DepartmentDTO convertToDTO(Department department) {

        DepartmentDTO departmentDTO = modelMapper.map(department, DepartmentDTO.class);

        return departmentDTO;
    }
}
