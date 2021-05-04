package com.backmetier.projetmetier.DAO;

import com.backmetier.projetmetier.entiter.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentaireRepositroy extends JpaRepository<Commentaire,Long> {
        }
