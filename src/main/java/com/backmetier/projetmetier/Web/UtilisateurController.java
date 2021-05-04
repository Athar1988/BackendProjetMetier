package com.backmetier.projetmetier.Web;

import com.backmetier.projetmetier.DAO.UtlisateurRepository;
import com.backmetier.projetmetier.entiter.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@RestController
public class UtilisateurController {
    @Autowired
    private UtlisateurRepository utilisateurRep;
   // ca marche sans methode parceque findAll() est une methode prédéfinie avec @RepositoryRestResource
    //http://localhost:8085/utilisateurs
    //service web dans controller avec méthode prédéfinie
   /* @GetMapping("/utilisateurs")
    public List<Utilisateur>    Utilisateur(){
        return utilisateurRep.findAll();
    }
    /**********************************/


   // service web avec controller + @GetMapping
   // http://localhost:8085/utilisateurs/id/1
   @GetMapping(path = "/utilisateurs/id/{id_utilisateur}")
    public Utilisateur  UtilisateurId(@PathVariable("id_utilisateur") Long id){
        return utilisateurRep.findById(id).get();
    }
    /**********************************/


    // service web avec controller + @RequestMapping
    //http://localhost:8085/utilisateurs/1
    @RequestMapping(method=RequestMethod.GET, value = "/utilisateurs/{userId}")
    public Utilisateur findUserById(@PathVariable Long userId){
        return utilisateurRep.findById(userId).get();
    }
    /**********************************/

    //service web acev methode implementer du JPA (controller+ JPA)
    //http://localhost:8085/utilisateurs/metier/couture
    @GetMapping(path = "/utilisateurs/metier/{metier}")
    public List<Utilisateur>  UtilisateurSelonMetier(@PathVariable String metier){
        return utilisateurRep.findByMetierContains(metier);
    }


}
