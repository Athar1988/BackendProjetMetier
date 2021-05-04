package com.backmetier.projetmetier.entiter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Login  {
    @Id
    private String login;
    private String motdepasse;
    private boolean admin;
    private boolean user;
}
