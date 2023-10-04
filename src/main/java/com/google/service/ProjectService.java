package com.google.service;

import com.google.dto.ProjectDTO;

public interface ProjectService extends CrudService<ProjectDTO,String> {
    void completed(ProjectDTO projectDTO);
}
