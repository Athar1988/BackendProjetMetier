package com.backmetier.projetmetier.DAO;

import com.backmetier.projetmetier.entiter.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
//Pour declarer un repository comme ´ etant une ´ API REST, il faut ajouter
//l’annotation @RepositoryRestResource
@RepositoryRestResource
@Repository
public interface UtlisateurRepository extends JpaRepository<Utilisateur,Long> {

      //signature méthode implémentée dans UtilisateurController(jpa+controller)
      List<Utilisateur> findByMetierContains(String nomMetier);


      //Methode personnalisé (jpa)
      //http://localhost:8085/utilisateurs/search/liste?nom=a
      @RestResource(path="/liste")
      List<Utilisateur> findByNomEquals(@Param("nom") String nomUser);


}
