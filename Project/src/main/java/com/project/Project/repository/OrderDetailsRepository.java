package com.project.Project.repository;

import com.project.Project.model.Order;
import com.project.Project.model.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Long> {
}