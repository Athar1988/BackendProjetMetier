package com.backmetier.projetmetier.DAO;
import org.springframework.data.jpa.repository.Query;
import com.backmetier.projetmetier.entiter.Login;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoginRepository extends JpaRepository<Login,String> {

}