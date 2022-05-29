package com.project.Project.repository;

import com.project.Project.model.OrderDelivery;
import com.project.Project.model.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDeliveryRepository extends JpaRepository<OrderDelivery, Long> {

    List<OrderDetails> findByOrderDelivery(OrderDelivery order);

    void deleteByItem(OrderDetails orderDetails);
}