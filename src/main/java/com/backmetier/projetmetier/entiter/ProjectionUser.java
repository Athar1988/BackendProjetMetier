package com.backmetier.projetmetier.entiter;


import org.springframework.data.rest.core.config.Projection;
//http://localhost:8085/utilisateurs?projection=email
@Projection(name="email", types=Utilisateur.class)
public interface ProjectionUser {
    public String getEmail();
}
