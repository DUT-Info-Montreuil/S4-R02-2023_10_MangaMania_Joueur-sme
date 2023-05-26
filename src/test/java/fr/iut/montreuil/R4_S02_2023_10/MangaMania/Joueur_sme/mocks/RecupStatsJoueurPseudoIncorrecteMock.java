package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.mocks;

import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.entities.dto.StatistiqueJoueurDTO;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.modeles.InterfaceServiceJoueur;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utils.exceptions.*;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utils.exceptions.enums.LanguesEnum;

import java.util.ArrayList;

public class RecupStatsJoueurPseudoIncorrecteMock implements InterfaceServiceJoueur {


    @Override
    public JoueurDTO ajouterJoueur(String nom, String pseudo, int anneeNaiss, LanguesEnum langue, String listeInteret) throws JoueurDejaExistantException, NomInvalideException, AnneeDeNaissanceException, PseudonymeInvalideException, LangueInvalideException {
        return null;
    }

    @Override
    public ArrayList<StatistiqueJoueurDTO> recupStatsJoueur(String pseudo) throws PseudoIntrouvableException, JoueurAucunStatsException {
        ArrayList<JoueurDTO> listJoueurs = new ArrayList<>();
        ArrayList<StatistiqueJoueurDTO> listStat = new ArrayList<>();
        JoueurDTO j1 = new JoueurDTO("daniel","dani94",2002,LanguesEnum.FRANCAIS,"Anime");
        listJoueurs.add(j1);
        for (JoueurDTO joueur : listJoueurs) {
            if(pseudo != joueur.getPseudo()){
                throw new PseudoIntrouvableException();
            }
            try{
                return new ArrayList<StatistiqueJoueurDTO>();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return listStat;
    }

    @Override
    public StatistiqueJoueurDTO miseAjourStatsJoueur(String pseudo, int score, int duree, int nbQuestions) throws DonneeInvalideException, PseudoIntrouvableException {
        return null;
    }

    @Override
    public ArrayList<JoueurDTO> listerJoueurs() {
        return null;
    }
}
