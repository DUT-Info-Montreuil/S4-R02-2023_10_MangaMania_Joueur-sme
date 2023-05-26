package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.mocks;

import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.entities.dto.StatistiqueJoueurDTO;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.modeles.InterfaceServiceJoueur;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utils.exceptions.*;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utils.exceptions.enums.LanguesEnum;

import java.util.ArrayList;

public class MiseAJourStatsJoueurDonneeIncrrecteMock implements InterfaceServiceJoueur {
    @Override
    public JoueurDTO ajouterJoueur(String nom, String pseudo, int anneeNaiss, LanguesEnum langue, String listeInteret) throws JoueurDejaExistantException, NomInvalideException, AnneeDeNaissanceException, PseudonymeInvalideException, LangueInvalideException {
        return null;
    }

    @Override
    public ArrayList<StatistiqueJoueurDTO> recupStatsJoueur(String pseudo) throws PseudoIntrouvableException, JoueurAucunStatsException {
        return null;
    }

    @Override
    public StatistiqueJoueurDTO miseAjourStatsJoueur(String pseudo, int score, int duree, int nbQuestions) throws DonneeInvalideException, PseudoIntrouvableException {
        StatistiqueJoueurDTO statJoueur = new StatistiqueJoueurDTO(score, duree,nbQuestions);
        if (score < 0 || score > nbQuestions || duree < 0 || nbQuestions < 0) {
            throw new DonneeInvalideException();
        }try {
            return new StatistiqueJoueurDTO(score,duree,nbQuestions);
        }catch (Exception e){
            e.printStackTrace();
        }
        return statJoueur;
    }

    @Override
    public ArrayList<JoueurDTO> listerJoueurs() {
        return null;
    }
}
