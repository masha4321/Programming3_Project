package com.project.Project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.Project.entity.AddressEO;

@Repository
public interface AddressRepository extends CrudRepository<AddressEO, Long> {
}