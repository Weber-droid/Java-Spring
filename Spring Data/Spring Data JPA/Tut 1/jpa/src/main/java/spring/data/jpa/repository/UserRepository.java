package spring.data.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.data.jpa.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
