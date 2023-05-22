package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utils.exceptions;

public class LangueInvalideException extends Exception{

    public LangueInvalideException() {
        super("Le choix de langue est invalide.");
    }

    public LangueInvalideException(String message) {
        super(message);
    }
}
