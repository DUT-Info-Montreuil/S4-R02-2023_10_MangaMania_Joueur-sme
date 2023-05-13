package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.modeles;

import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.exceptions.JoueurDejaExistantException;

import java.util.ArrayList;
import java.util.List;

public interface InterfaceServiceJoueur {
    public JoueurDTO ajouterJoueur(String nom, String pseudo, int anneeNaiss, LanguesEnum langue, String listeInteret) throws JoueurDejaExistantException;
    public ArrayList<JoueurDTO> listerJoueurs();

}
