package com.mryzhan.repository;


import com.mryzhan.entity.Project;
import com.mryzhan.entity.User;
import com.mryzhan.enums.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project,Long> {

    Project findByProjectCode(String code);
    List<Project> findAllByAssignedManager(User manager);

    List<Project> findAllByAssignedManagerId(Long managerId);

    List<Project> findAllByProjectStatusIsNot(Status status);

}
