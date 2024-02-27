package com.project_management_system.Project.Management.System.Controller;

import com.project_management_system.Project.Management.System.Entity.Project;
import com.project_management_system.Project.Management.System.Service.ProjectService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Tag(name = "Project Related API's")
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    @GetMapping("/getAll")
    public List<Project> getAllProject(){
        return projectService.getAllProject();
    }
    @GetMapping("/getProject/{id}")
    public Optional<Project> getProjectById(@PathVariable Integer id){
        return projectService.getProjectById(id);
    }
    @PostMapping("/addProject")
    public Project addProject(@RequestBody Project project){
        return projectService.addProject(project);
    }
    @DeleteMapping("/removeProject/{id}")
    public Project removeProject(@PathVariable Integer id){
        return projectService.removeProject(id);
    }
}
