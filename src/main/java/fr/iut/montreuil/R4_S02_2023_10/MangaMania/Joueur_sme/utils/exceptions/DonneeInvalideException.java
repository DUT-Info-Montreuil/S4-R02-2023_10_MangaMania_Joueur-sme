package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utils.exceptions;

public class DonneeInvalideException extends Exception {
    public DonneeInvalideException() {
        super("La donnee est invalide.");
    }

    public DonneeInvalideException(String message) {
        super(message);
    }
}
