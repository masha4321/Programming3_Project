package com.project.Project.repository;

import com.project.Project.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrdersRepository extends JpaRepository<Orders, Long> {
}