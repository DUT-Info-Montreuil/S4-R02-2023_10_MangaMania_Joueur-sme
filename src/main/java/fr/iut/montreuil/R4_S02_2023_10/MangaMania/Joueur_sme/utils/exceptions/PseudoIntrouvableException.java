package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utils.exceptions;

public class PseudoIntrouvableException extends Exception {
    public PseudoIntrouvableException() {
        super("Le pseudo est introuvable.");
    }

    public PseudoIntrouvableException(String message) {
        super(message);
    }
}
