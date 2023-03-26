package net.javaguides.springbootrestfulwebservices.repository;


import net.javaguides.springbootrestfulwebservices.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}