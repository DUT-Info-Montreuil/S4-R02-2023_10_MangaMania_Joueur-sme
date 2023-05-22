package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.mocks;

import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.exceptions.*;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.modeles.InterfaceServiceJoueur;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utiles.exceptions.enums.LanguesEnum;

import java.util.ArrayList;

public class AjouterJoueurChoixLangueCorrecteMock implements InterfaceServiceJoueur {


    @Override
    public JoueurDTO ajouterJoueur(String nom, String pseudo, int anneeNaiss, LanguesEnum langue, String listeInteret) throws JoueurDejaExistantException {
        try {
            return new JoueurDTO("John Doe", "johndoe", 2003, LanguesEnum.FRANCAIS, "Anime");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<JoueurDTO> listerJoueurs() {
        return null;
    }
}