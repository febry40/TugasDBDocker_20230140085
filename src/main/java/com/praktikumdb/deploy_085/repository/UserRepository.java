package com.praktikumdb.deploy_085.repository;


import com.praktikumdb.deploy_085.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
