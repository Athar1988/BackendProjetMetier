package com.backmetier.projetmetier.entiter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table
public class Utilisateur {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_utilisateur;
    private String nom;
    private String prenom;
    private String email;
    @Temporal(TemporalType.DATE)
    private Date datedenaissance;
    private String ville;
    private String numerotelephone;
    private String metier;
    private String photo;
    transient
    private String motdepasse;
    private double score ;

    @OneToMany(mappedBy = "album")
    private Collection<Photo> photos;
    @OneToMany(mappedBy = "commentaire")
    private Collection<Commentaire> Commentaires;
}
