package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.exceptions;

public class NomPseudoInvalideException extends Exception{
    public NomPseudoInvalideException() {
        super("Le nom est invalide.");
    }

    public NomPseudoInvalideException(String message) {
        super(message);
    }
}
