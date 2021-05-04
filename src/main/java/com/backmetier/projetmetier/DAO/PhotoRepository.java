package com.backmetier.projetmetier.DAO;


import com.backmetier.projetmetier.entiter.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository  extends JpaRepository<Photo,Long> {
}
