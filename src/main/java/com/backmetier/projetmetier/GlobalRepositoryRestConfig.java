package com.backmetier.projetmetier;

import com.backmetier.projetmetier.entiter.*;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
//import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
@RequiredArgsConstructor
public class GlobalRepositoryRestConfig extends RepositoryRestConfigurerAdapter {
    private final GeneralConfiguration generalConfiguration;
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration repositoryRestConfiguration){
        generalConfiguration.configureCORSRegistry(repositoryRestConfiguration.getCorsRegistry());
        repositoryRestConfiguration.setReturnBodyOnCreate(true);
        repositoryRestConfiguration.setReturnBodyOnUpdate(true);
        repositoryRestConfiguration.exposeIdsFor(Login.class,Photo.class,Commentaire.class,User.class,Utilisateur.class);
        repositoryRestConfiguration.getCorsRegistry()
                .addMapping("/**")
                .allowedOrigins("*")
                .allowedHeaders("*")
                .allowedMethods("OPTIONS","HEAD","GET","PUT","POST","DELETE","PATCH");
    }
}
