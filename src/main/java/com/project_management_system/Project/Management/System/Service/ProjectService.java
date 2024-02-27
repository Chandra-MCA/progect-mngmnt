package com.project_management_system.Project.Management.System.Service;

import com.project_management_system.Project.Management.System.Entity.Project;
import com.project_management_system.Project.Management.System.Repository.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepo projectRepo;
    public List<Project> getAllProject(){
        return projectRepo.findAll();
    }

    public Optional<Project> getProjectById(Integer id) {
        return projectRepo.findById(id);
    }

    public Project addProject(Project project) {
        return projectRepo.save(project);
    }

    public Project removeProject(Integer id) {
        Optional<Project> project=getProjectById(id);
        if(project.isPresent()) {
            projectRepo.delete(project.get());
            return project.get();
        }
        return null;
    }

}
