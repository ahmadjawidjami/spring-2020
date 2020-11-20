package hu.cs.se.adjava.projectmanagement.service;

import hu.cs.se.adjava.projectmanagement.dto.DepartmentDTO;
import hu.cs.se.adjava.projectmanagement.dto.ProjectDTO;
import hu.cs.se.adjava.projectmanagement.model.Department;
import hu.cs.se.adjava.projectmanagement.model.Project;
import hu.cs.se.adjava.projectmanagement.repository.ProjectRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public List<Project> getAll() {
        return projectRepository.findAll();
    }

    @Override
    public List<ProjectDTO> convertToDTO(List<Project> projects) {
        List<ProjectDTO> projectDTOList = new ArrayList<>();

        for (Project project : projects) {
            ProjectDTO projectDTO = modelMapper.map(project, ProjectDTO.class);
            projectDTOList.add(projectDTO);

        }
        return projectDTOList;
    }

    @Override
    public ProjectDTO convertToDTO(Project project) {
        ProjectDTO projectDTO = modelMapper.map(project, ProjectDTO.class);

        return projectDTO;
    }
}
