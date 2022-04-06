package com.ProjetIntegre.BackEnd.Enteties;

import java.util.Date;

public class FormationProgramme {
    private Formation formation;
    private Instructeur instructeur ;
    private Date[] datDispo ;

    public FormationProgramme(Formation formation, Instructeur instructeur, Date[] datDispo) {
        this.formation = formation;
        this.instructeur = instructeur;
        this.datDispo = datDispo;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public Instructeur getInstructeur() {
        return instructeur;
    }

    public void setInstructeur(Instructeur instructeur) {
        this.instructeur = instructeur;
    }

    public Date[] getDatDispo() {
        return datDispo;
    }

    public void setDatDispo(Date[] datDispo) {
        this.datDispo = datDispo;
    }
}
