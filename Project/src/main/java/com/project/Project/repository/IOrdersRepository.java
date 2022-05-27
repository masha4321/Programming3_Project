package com.project.Project.repository;

import com.project.Project.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrdersRepository extends JpaRepository<Order, Long> {
}