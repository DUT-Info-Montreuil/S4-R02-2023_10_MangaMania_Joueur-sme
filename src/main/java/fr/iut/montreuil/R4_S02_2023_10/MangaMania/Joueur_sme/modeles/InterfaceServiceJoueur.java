package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.modeles;

import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.entities.dto.StatistiqueJoueurDTO;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utils.exceptions.*;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utils.exceptions.enums.LanguesEnum;

import java.util.ArrayList;

public interface InterfaceServiceJoueur {
    public JoueurDTO ajouterJoueur(String nom, String pseudo, int anneeNaiss, LanguesEnum langue, String listeInteret) throws JoueurDejaExistantException, NomInvalideException, AnneeDeNaissanceException, PseudonymeInvalideException, LangueInvalideException;
    public ArrayList<StatistiqueJoueurDTO> recupStatsJoueur() throws PseudoIntrouvableException, JoueurNonStatsException;
    public ArrayList<StatistiqueJoueurDTO> miseAjourStatsJoueur() throws DonneeInvalideException, PseudoIntrouvableException;
    public ArrayList<JoueurDTO> listerJoueurs();

}
