package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.exceptions;

public class JoueurDejaExistantException extends Exception{
    public JoueurDejaExistantException() {
        super("Il existe déjà un joueur avec ce pseudonyme");
    }

    public JoueurDejaExistantException(String message) {
        super(message);
    }
}
