package io.archmod.ppmtool.services;

import io.archmod.ppmtool.domain.Project;
import io.archmod.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdate(Project project) {
        // logic

        return projectRepository.save(project);
    }
}
