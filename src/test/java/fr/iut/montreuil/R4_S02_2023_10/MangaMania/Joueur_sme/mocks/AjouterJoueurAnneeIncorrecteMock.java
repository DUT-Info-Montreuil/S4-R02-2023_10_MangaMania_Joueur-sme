package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.mocks;

import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.entities.dto.StatistiqueJoueurDTO;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.modeles.InterfaceServiceJoueur;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utils.exceptions.enums.LanguesEnum;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utils.exceptions.*;

import java.util.ArrayList;

public class AjouterJoueurAnneeIncorrecteMock implements InterfaceServiceJoueur {

    @Override
    public JoueurDTO ajouterJoueur(String nom, String pseudo, int anneeNaiss, LanguesEnum langue, String listeInteret) throws NomInvalideException, AnneeDeNaissanceException, PseudonymeInvalideException, LangueInvalideException, JoueurDejaExistantException {
        if(anneeNaiss < 1980 || anneeNaiss > 2012){
            throw new AnneeDeNaissanceException();
        }
        try {
            return new JoueurDTO("John Doe", "johndoe", 2025, LanguesEnum.FRANCAIS, "Anime");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<StatistiqueJoueurDTO> recupStatsJoueur() throws PseudoIntrouvableException {
        return null;
    }

    @Override
    public ArrayList<StatistiqueJoueurDTO> miseAjourStatsJoueur() throws DonneeInvalideException {
        return null;
    }

    @Override
    public ArrayList<JoueurDTO> listerJoueurs() {
        return null;
    }
}
