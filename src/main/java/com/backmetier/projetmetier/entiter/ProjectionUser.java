package com.backmetier.projetmetier.entiter;


import org.springframework.data.rest.core.config.Projection;
//http://localhost:8085/utilisateurs?projection=P1
@Projection(name="P1", types=Utilisateur.class)
public interface ProjectionUser {
    public String getNom();
}
