package com.project.userdepartment.repositories;

import com.project.userdepartment.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
