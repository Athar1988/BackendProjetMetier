package com.backmetier.projetmetier.Web;

import com.backmetier.projetmetier.DAO.UtlisateurRepository;
import com.backmetier.projetmetier.entiter.Utilisateur;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;
@CrossOrigin("*")
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

    //ajouter un produit
    @PostMapping(value = "/utilisateurs/AjouteUser")
    public void ajouterUtilisateur(@RequestBody Utilisateur product) {
        utilisateurRep.save(product);
    }

    @DeleteMapping(value = "/utilisateurs/supprimerUser/{id}")
    public void supprimeruserUtilisateur(@PathVariable(name="id")  Long userId) {
        utilisateurRep.deleteById(userId);
    }


    //Supprimer un produit
    @DeleteMapping(value ="/utilisateurs/supprimerUser")
    public void DeleteProduit(@RequestBody Utilisateur U){
        utilisateurRep.delete(U);
    }


    //Mettre à jour un produit
    @PutMapping(value ="/utilisateurs/misejour{id}")
    public Utilisateur UpdateProduit(@PathVariable(name="id") Long id, @RequestBody Utilisateur U){
        U.setId_utilisateur(id);
        return utilisateurRep.save(U);
    }
}
