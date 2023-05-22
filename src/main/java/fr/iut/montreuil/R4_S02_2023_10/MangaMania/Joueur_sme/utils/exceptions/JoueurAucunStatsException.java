package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utils.exceptions;

public class JoueurAucunStatsException extends Exception {
    public JoueurAucunStatsException() {
        super("Ce joueur n'a pas encore joué");
    }

    public JoueurAucunStatsException(String message) {
        super(message);
    }
}
