package com.project.Project.repository;

import com.project.Project.model.Address;
import com.project.Project.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}