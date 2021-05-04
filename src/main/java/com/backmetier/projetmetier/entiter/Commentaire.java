package com.backmetier.projetmetier.entiter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_commentaire;
    private String corps_commentaire;
    private Date date_ajoute_com;
    @ManyToOne
    private Utilisateur commentaire;
}
