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

    public JoueurDTO(String nom, String pseudo, int anneeDeNaissance, LanguesEnum langue, String centreDInteretListe) throws NomInvalideException, AnneeDeNaissanceException, PseudonymeInvalideException, LangueInvalideException {
        try {
            setNom(nom);
        } catch (NomInvalideException e) {
            throw e;
        }
        try {
            setPseudo(pseudo);
        } catch (PseudonymeInvalideException e) {
            throw e;
        }
        try {
            setAnneeDeNaissance(anneeDeNaissance);
        } catch (AnneeDeNaissanceException e) {
            throw e;
        }
        try {
            setLangue(langue);
        } catch (LangueInvalideException e) {
            throw e;
        }
        this.centreDInteretListe = centreDInteretListe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) throws NomInvalideException {
        if (nom == null || nom.isEmpty()) {
            throw new NomInvalideException("Le nom du joueur ne peut pas être vide.");
        }
        if (!Character.isLetter(nom.charAt(0))) {
            throw new NomInvalideException("Le nom du joueur doit commencer par une lettre.");
        }
        if (nom.length() > 32) {
            throw new NomInvalideException("Le nom du joueur ne peut pas dépasser 32 caractères.");
        }
        this.nom = nom;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) throws PseudonymeInvalideException {
        if (pseudo == null || pseudo.isEmpty()) {
            throw new PseudonymeInvalideException("Le pseudo du joueur ne peut pas être vide.");
        }
        if (!Character.isLetter(pseudo.charAt(0))) {
            throw new PseudonymeInvalideException("Le pseudo du joueur doit commencer par une lettre.");
        }
        if (pseudo.length() > 32) {
            throw new PseudonymeInvalideException("Le pseudo du joueur ne peut pas dépasser 32 caractères.");
        }
        this.pseudo = pseudo;
    }

    public int getAnneeDeNaissance() {
        return anneeDeNaissance;
    }

    public void setAnneeDeNaissance(int anneeDeNaissance) throws AnneeDeNaissanceException {
        if (anneeDeNaissance < 1980 || anneeDeNaissance > 2012) {
            throw new AnneeDeNaissanceException();
        }
        this.anneeDeNaissance = anneeDeNaissance;
    }

    public LanguesEnum getLangue() {
        return langue;
    }

    public void setLangue(LanguesEnum langue) throws LangueInvalideException {
        int choixLangue = langue.getChoix();
        if (choixLangue < 1 || choixLangue > 5) {
            throw new IllegalArgumentException();
        }
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
