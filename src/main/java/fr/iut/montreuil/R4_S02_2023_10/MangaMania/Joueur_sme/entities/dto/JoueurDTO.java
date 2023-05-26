package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.entities.dto;

import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utils.exceptions.enums.LanguesEnum;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utils.exceptions.AnneeDeNaissanceException;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utils.exceptions.LangueInvalideException;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utils.exceptions.NomInvalideException;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utils.exceptions.PseudonymeInvalideException;

import java.util.ArrayList;

public class JoueurDTO {
    private ArrayList<JoueurDTO> listeJoueurs;
    private String nom;
    private String pseudo;
    private int anneeDeNaissance;
    private LanguesEnum langue;
    private String centreDInteretListe;
    private ArrayList<StatistiqueJoueurDTO> statistiqueJoueurDTO;

    public JoueurDTO(String nom, String pseudo, int anneeDeNaissance, LanguesEnum langue, String centreDInteretListe){
        this.nom = nom;
        this.pseudo = pseudo;
        this.anneeDeNaissance = anneeDeNaissance;
        this.langue = langue;
        this.centreDInteretListe = centreDInteretListe;
        this.statistiqueJoueurDTO = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) throws NomInvalideException {
        this.nom = nom;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) throws PseudonymeInvalideException {
        this.pseudo = pseudo;
    }

    public int getAnneeDeNaissance() {
        return anneeDeNaissance;
    }

    public void setAnneeDeNaissance(int anneeDeNaissance) throws AnneeDeNaissanceException {
        this.anneeDeNaissance = anneeDeNaissance;
    }

    public LanguesEnum getLangue() {
        return langue;
    }

    public void setLangue(LanguesEnum langue) throws LangueInvalideException {
        this.langue = langue;
    }

    public ArrayList<StatistiqueJoueurDTO> getStatistiqueJoueurDTO() {
        return statistiqueJoueurDTO;
    }

    public void setStatistiqueJoueurDTO(ArrayList<StatistiqueJoueurDTO> statistiqueJoueurDTO) {
        this.statistiqueJoueurDTO = statistiqueJoueurDTO;
    }

    public String getCentreDInteretListe() {
        return centreDInteretListe;
    }

    public void setCentreDInteretListe(String centreDInteretListe) {
        this.centreDInteretListe = centreDInteretListe;
    }

    @Override
    public String toString() {
        return  "nom=' " + nom + '\'' +
                ", pseudo='" + pseudo + '\'' +
                ", anneeDeNaissance=" + anneeDeNaissance +
                ", langue=" + langue +
                ", centreDInteretListe='" + centreDInteretListe + '\'';
    }

}
