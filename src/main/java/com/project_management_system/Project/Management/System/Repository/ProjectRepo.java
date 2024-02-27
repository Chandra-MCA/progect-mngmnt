package com.project_management_system.Project.Management.System.Repository;

import com.project_management_system.Project.Management.System.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProjectRepo extends JpaRepository<Project,Integer> {
}
