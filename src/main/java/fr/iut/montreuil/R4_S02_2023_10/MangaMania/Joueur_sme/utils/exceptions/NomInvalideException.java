package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utils.exceptions;

public class NomInvalideException extends Exception{
    public NomInvalideException() {
        super("Le nom est invalide.");
    }

    public NomInvalideException(String message) {
        super(message);
    }
}
