package data.jpa.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import data.jpa.spring.entity.User;

public interface UserRepository extends JpaRepository <User, Long> {

}
