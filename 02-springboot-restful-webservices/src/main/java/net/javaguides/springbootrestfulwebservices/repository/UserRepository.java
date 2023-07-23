package net.javaguides.springbootrestfulwebservices.repository;

import net.javaguides.springbootrestfulwebservices.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository is transactional by default (see simple jpa repository)
public interface UserRepository extends JpaRepository<User, Long> {
}
