package com.ProjetIntegre.BackEnd.Enteties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    private String Nom;


    private String Prenom;

    private String Email;

    private String Login;

    private Float MotPasse;
}
