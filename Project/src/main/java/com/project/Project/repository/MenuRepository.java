package com.project.Project.repository;

import com.project.Project.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Item, Long> {
}