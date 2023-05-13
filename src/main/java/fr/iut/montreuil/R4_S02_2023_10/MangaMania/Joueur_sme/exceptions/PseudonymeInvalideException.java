package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.exceptions;

public class PseudonymeExisteException extends Exception{

    public PseudonymeExisteException() {
        super("Le pseudonyme est invalide.");
    }

    public PseudonymeExisteException(String message) {
        super(message);
    }
}
