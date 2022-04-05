package Enteties;

public class WebConference {
    private int WebConferenceId;
    private String Nom;

    public WebConference(int webConferenceId, String nom) {
        WebConferenceId = webConferenceId;
        Nom = nom;
    }

    public int getWebConferenceId() {
        return WebConferenceId;
    }

    public String getNom() {
        return Nom;
    }

    public void setWebConferenceId(int webConferenceId) {
        WebConferenceId = webConferenceId;
    }

    public void setNom(String nom) {
        Nom = nom;
    }
}
