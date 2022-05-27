package com.project.Project.repository;

import com.project.Project.model.RestaurantInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantInfoRepository extends JpaRepository<RestaurantInfo, Long> {
}