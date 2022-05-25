package com.project.Project.repository;

import com.project.Project.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMenuRepository extends JpaRepository<Menu, Long> {
}