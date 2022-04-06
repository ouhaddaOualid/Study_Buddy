package com.ProjetIntegre.BackEnd.Enteties;

public class WebConferencePrograme {
    private Instructeur instructeur;
    private WebConference webConference;

    public WebConferencePrograme(Instructeur instructeur, WebConference webConference) {
        this.instructeur = instructeur;
        this.webConference = webConference;
    }

    public Instructeur getInstructeur() {
        return instructeur;
    }

    public void setInstructeur(Instructeur instructeur) {
        this.instructeur = instructeur;
    }

    public WebConference getWebConference() {
        return webConference;
    }

    public void setWebConference(WebConference webConference) {
        this.webConference = webConference;
    }
}
