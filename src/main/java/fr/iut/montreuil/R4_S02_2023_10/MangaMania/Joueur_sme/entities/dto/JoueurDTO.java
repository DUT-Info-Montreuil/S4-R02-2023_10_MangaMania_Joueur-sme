package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.entities.dto;

import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.exceptions.*;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utiles.exceptions.enums.LanguesEnum;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.modeles.*;

import java.util.ArrayList;

public class JoueurDTO {
    private ArrayList<JoueurDTO> listeJoueurs;
    private String nom;
    private String pseudo;
    private int anneeDeNaissance;
    private LanguesEnum langue;
    private String centreDInteretListe;

    public JoueurDTO(String nom, String pseudo, int anneeDeNaissance, LanguesEnum langue, String centreDInteretListe){
        this.nom = nom;
        this.pseudo = pseudo;
        this.anneeDeNaissance = anneeDeNaissance;
        this.langue = langue;
        this.centreDInteretListe = centreDInteretListe;
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
