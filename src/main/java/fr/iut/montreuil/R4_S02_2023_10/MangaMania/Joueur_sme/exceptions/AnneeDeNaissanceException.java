package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.exceptions;

public class AnneeDeNaissanceException extends Exception {
    public AnneeDeNaissanceException() {
        super("L'année de naissance est invalide.");
    }

    public AnneeDeNaissanceException(String message) {
        super(message);
    }
}
