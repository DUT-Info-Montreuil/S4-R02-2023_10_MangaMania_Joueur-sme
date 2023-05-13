package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme;

import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.exceptions.*;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.modeles.LanguesEnum;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws AnneeDeNaissanceException, LangueInvalideException, PseudonymeInvalideException, NomInvalideException {
        JoueurDTO joueurDTO1 = new JoueurDTO();
        JoueurDTO joueurDTO2 = new JoueurDTO();
        JoueurDTO joueurDTO3 = new JoueurDTO();

        ArrayList<JoueurDTO> listeJoueurs = joueurDTO1.listerJoueurs();

        try {
            JoueurDTO joueur1 = joueurDTO1.ajouterJoueur("John Doe", "johndoe", 1990, LanguesEnum.FRANCAIS, "Anime");
            JoueurDTO joueur2 = joueurDTO2.ajouterJoueur("Marie", "johndoe45", 154, LanguesEnum.FRANCAIS, "Mangas, films");
            JoueurDTO joueur3 = joueurDTO3.ajouterJoueur("Jean", "johndoe445", 1990, LanguesEnum.ENGLISH, "Mangas, musique");


            for (JoueurDTO joueur : listeJoueurs) {
                if (joueur != null) {
                    System.out.println("Le joueur : " + joueur
                            .getPseudo() + " a été ajouté.");
                } else {
                    System.out.println("Erreur lors de l'ajout du joueur : " + joueur.getNom());
                }
            }

    } catch (JoueurDejaExistantException e) {
            System.out.println("Erreur lors de l'ajout du joueur : " + e.getMessage());
        }

        for(JoueurDTO joueur : listeJoueurs){
            System.out.println("Le joueur : " + joueur.getPseudo() + " est présent dans la liste");
        }

    }
}
