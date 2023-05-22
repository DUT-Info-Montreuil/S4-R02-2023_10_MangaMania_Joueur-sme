package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utils.exceptions;

public class JoueurNonStatsException extends Exception {
    public JoueurNonStatsException() {
        super("Ce joueur n'a pas encore joué");
    }

    public JoueurNonStatsException(String message) {
        super(message);
    }
}
