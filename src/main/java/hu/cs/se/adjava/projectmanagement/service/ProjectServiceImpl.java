package hu.cs.se.adjava.projectmanagement.service;

import hu.cs.se.adjava.projectmanagement.model.Project;
import hu.cs.se.adjava.projectmanagement.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectRepository projectRepository;
    @Override
    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }
}
