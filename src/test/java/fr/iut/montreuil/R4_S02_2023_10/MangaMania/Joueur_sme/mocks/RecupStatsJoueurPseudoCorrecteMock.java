package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.mocks;

import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.entities.dto.StatistiqueJoueurDTO;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.modeles.InterfaceServiceJoueur;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utils.exceptions.*;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utils.exceptions.enums.LanguesEnum;

import java.util.ArrayList;

public class RecupStatsJoueurPseudoCorrecteMock implements InterfaceServiceJoueur {
    ArrayList<StatistiqueJoueurDTO> listStat = new ArrayList<StatistiqueJoueurDTO>();
    @Override
    public JoueurDTO ajouterJoueur(String nom, String pseudo, int anneeNaiss, LanguesEnum langue, String listeInteret) throws JoueurDejaExistantException, NomInvalideException, AnneeDeNaissanceException, PseudonymeInvalideException, LangueInvalideException {
        return null;
    }

    @Override
    public ArrayList<StatistiqueJoueurDTO> recupStatsJoueur(String pseudo) throws PseudoIntrouvableException, JoueurAucunStatsException {
        return listStat;
    }

    @Override
    public StatistiqueJoueurDTO miseAjourStatsJoueur(String pseudo, int score, int duree, int nbQuestions) throws DonneeInvalideException, PseudoIntrouvableException {
        StatistiqueJoueurDTO stat = new StatistiqueJoueurDTO(score,duree,nbQuestions);
        listStat.add(stat);
        return stat;
    }

    @Override
    public ArrayList<JoueurDTO> listerJoueurs() {
        return null;
    }
}
