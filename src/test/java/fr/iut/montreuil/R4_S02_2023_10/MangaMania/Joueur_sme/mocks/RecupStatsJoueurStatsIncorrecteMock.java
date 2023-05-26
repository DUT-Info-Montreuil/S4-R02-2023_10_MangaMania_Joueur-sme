package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.mocks;

import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.entities.dto.StatistiqueJoueurDTO;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.modeles.InterfaceServiceJoueur;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utils.exceptions.*;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utils.exceptions.enums.LanguesEnum;

import java.util.ArrayList;

public class RecupStatsJoueurStatsIncorrecteMock implements InterfaceServiceJoueur {
    @Override
    public JoueurDTO ajouterJoueur(String nom, String pseudo, int anneeNaiss, LanguesEnum langue, String listeInteret) throws JoueurDejaExistantException, NomInvalideException, AnneeDeNaissanceException, PseudonymeInvalideException, LangueInvalideException {
        return null;
    }

    @Override
    public ArrayList<StatistiqueJoueurDTO> recupStatsJoueur(String pseudo) throws PseudoIntrouvableException, JoueurAucunStatsException {
        ArrayList<JoueurDTO> listJoueurs = new ArrayList<JoueurDTO>();
        ArrayList<StatistiqueJoueurDTO> listStat = new ArrayList<StatistiqueJoueurDTO>();

        JoueurDTO j1 = new JoueurDTO("John Doe", "johndoe", 2003, LanguesEnum.FRANCAIS, "Anime");
        j1.setStatistiqueJoueurDTO(new ArrayList<>());
        listJoueurs.add(j1);
        for (JoueurDTO joueur : listJoueurs) {
            if(pseudo == joueur.getPseudo()){
                if(joueur.getStatistiqueJoueurDTO().size()==0){
                    throw new JoueurAucunStatsException();
                }
                try{
                    return new ArrayList<StatistiqueJoueurDTO>();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
        return listStat ;

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
