package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.exceptions;

public class PseudonymeExisteException extends Exception{
    public PseudonymeExisteException() {
        super("Il existe déjà un joueur avec ce pseudonyme");
    }

    public PseudonymeExisteException(String message) {
        super(message);
    }
}
