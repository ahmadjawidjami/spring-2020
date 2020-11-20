package hu.cs.se.adjava.projectmanagement.service;

import hu.cs.se.adjava.projectmanagement.dto.ProjectDTO;
import hu.cs.se.adjava.projectmanagement.model.Project;

import java.util.List;

public interface ProjectService {

    Project saveProject(Project project);

    List<Project> getAll();

    List<ProjectDTO> convertToDTO(List<Project> projects);
    ProjectDTO convertToDTO(Project project);
}
