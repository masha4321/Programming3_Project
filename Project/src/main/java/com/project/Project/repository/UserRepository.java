package com.project.Project.repository;

import com.project.Project.entity.UserEO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEO, Long> {
}