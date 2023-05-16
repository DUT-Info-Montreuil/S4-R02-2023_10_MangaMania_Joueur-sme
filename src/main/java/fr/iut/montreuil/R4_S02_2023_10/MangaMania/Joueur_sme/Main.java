package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme;

import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.exceptions.*;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.impl.ServiceJoueurBean;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utiles.exceptions.enums.LanguesEnum;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<JoueurDTO> listeJoueurs = new ArrayList<JoueurDTO>();
        ServiceJoueurBean serviceJoueurBean = new ServiceJoueurBean();
        try {

            JoueurDTO joueur1 = serviceJoueurBean.ajouterJoueur("JohnDoe", "johndoe", 1990, LanguesEnum.FRANCAIS, "Anime");
            JoueurDTO joueur2 = serviceJoueurBean.ajouterJoueur("Marie", "johndoe45", 1998, LanguesEnum.FRANCAIS, "Mangas, films");
            JoueurDTO joueur3 = serviceJoueurBean.ajouterJoueur("Jean", "johndoe45", 1990, LanguesEnum.ENGLISH, "Mangas, musique");

            listeJoueurs.add(joueur1);
            listeJoueurs.add(joueur2);
            listeJoueurs.add(joueur3);

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
