package com.backmetier.projetmetier.DAO;

import com.backmetier.projetmetier.entiter.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
// document pour la sécurité https://www.invivoo.com/securiser-application-spring-boot-spring-security/
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(" select u from User u " +
            " where u.username = ?1")
    Optional<User> findUserWithName(String username);
}