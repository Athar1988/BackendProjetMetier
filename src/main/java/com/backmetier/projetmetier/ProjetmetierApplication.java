package com.backmetier.projetmetier;

import com.backmetier.projetmetier.entiter.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.backmetier.projetmetier.DAO.CommentaireRepositroy;
import com.backmetier.projetmetier.DAO.LoginRepository;
import com.backmetier.projetmetier.DAO.PhotoRepository;
import com.backmetier.projetmetier.DAO.UtlisateurRepository;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
public class ProjetmetierApplication  implements CommandLineRunner {
    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;
    @Autowired
    private UtlisateurRepository utilisateurRep;
    @Autowired
    private LoginRepository loginRep;
    @Autowired
    private PhotoRepository photoRep;
    @Autowired
    private CommentaireRepositroy commentaireRep;

    public static void main(String[] args) {
        SpringApplication.run(ProjetmetierApplication.class, args);
    }
  /* private void run(ApplicationArguments args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Utilisateur.class,
                Commentaire.class,User.class,Login.class,Photo.class);
    }*/
    @Override
    public void run(String... args) throws Exception {
        utilisateurRep.save(new Utilisateur(null,"Ali", "ben salah",
                "ali@bensalah.com", new Date(),
                "sfax", "55385529","couture", "rrr",
                "farfoura88",3, null, null));

        utilisateurRep.save(new Utilisateur(null,"Salma", "ben Ali",
                "salma@benali.com", new Date(),
                "sfax", "56987425","electricien","rrr",
                "farfoura88",3.75, null, null));

        utilisateurRep.save(new Utilisateur(null,"Mohamed", "Gribi",
                "med@ghribi.com", new Date(),
                "sfax", "25697415","maçon","rrr",
                "farfoura88",2, null, null));

      /*  List<Utilisateur> l1=utilisateurRep.findByMetierEquals("couture");
        l1.forEach(u-> System.out.println(u.toString()));
        System.out.println("**************");

        utilisateurRep.findAll().forEach(
                u-> System.out.println(u.toString())
        );*/
    }
}
