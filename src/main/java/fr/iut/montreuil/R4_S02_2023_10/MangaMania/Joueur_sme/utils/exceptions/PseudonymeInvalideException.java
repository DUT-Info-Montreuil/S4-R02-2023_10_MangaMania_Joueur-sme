package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utils.exceptions;

public class PseudonymeInvalideException extends Exception{

    public PseudonymeInvalideException() {
        super("Le pseudonyme est invalide.");
    }

    public PseudonymeInvalideException(String message) {
        super(message);
    }
}
