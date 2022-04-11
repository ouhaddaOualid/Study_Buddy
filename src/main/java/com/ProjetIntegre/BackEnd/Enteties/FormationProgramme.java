package com.ProjetIntegre.BackEnd.Enteties;

import java.util.Date;
public class FormationProgramme {
    private Formation formation;
    private Instructeur instructeur;
    private Date datDispo;

    public FormationProgramme(com.ProjetIntegre.BackEnd.Enteties.Formation formation, com.ProjetIntegre.BackEnd.Enteties.Instructeur instructeur, Date datDispo) {
        this.formation = formation;
        this.instructeur = instructeur;
        this.datDispo = datDispo;
    }
}

