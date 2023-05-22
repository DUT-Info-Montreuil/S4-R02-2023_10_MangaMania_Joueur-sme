package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.entities.dto;

public class StatistiqueJoueurDTO {
    private int score;
    private int duree;
    private int nbQuestions;

    public StatistiqueJoueurDTO(int score, int duree, int nbQuestions) {
        this.score = score;
        this.duree = duree;
        this.nbQuestions = nbQuestions;
    }

    public int getScore() {
        return score;
    }

    public StatistiqueJoueurDTO setScore(int score) {
        this.score = score;
        return this;
    }

    public int getDuree() {
        return duree;
    }

    public StatistiqueJoueurDTO setDuree(int duree) {
        this.duree = duree;
        return this;
    }

    public int getNbQuestions() {
        return nbQuestions;
    }

    public StatistiqueJoueurDTO setNbQuestions(int nbQuestions) {
        this.nbQuestions = nbQuestions;
        return this;
    }
}


