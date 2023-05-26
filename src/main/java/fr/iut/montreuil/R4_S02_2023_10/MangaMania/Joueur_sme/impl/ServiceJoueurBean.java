package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.impl;

import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.entities.dto.StatistiqueJoueurDTO;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utils.exceptions.*;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.modeles.InterfaceServiceJoueur;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utils.exceptions.enums.LanguesEnum;

import java.util.ArrayList;

public class ServiceJoueurBean implements InterfaceServiceJoueur {
    private ArrayList<JoueurDTO> listeJoueurs = new ArrayList<JoueurDTO>();
    @Override
    public JoueurDTO ajouterJoueur(String nom, String pseudo, int anneeNaiss, LanguesEnum langue, String listeInteret)
            throws JoueurDejaExistantException, NomInvalideException, AnneeDeNaissanceException, PseudonymeInvalideException, LangueInvalideException {
        if (nom == null || nom.isEmpty()) {
            throw new NomInvalideException("Le nom du joueur ne peut pas être vide.");
        }
        if (!Character.isLetter(nom.charAt(0))) {
            throw new NomInvalideException("Le nom du joueur doit commencer par une lettre.");
        }
        if (nom.length() > 32) {
            throw new NomInvalideException("Le nom du joueur ne peut pas dépasser 32 caractères.");
        }

        if (pseudo == null || pseudo.isEmpty()) {
            throw new PseudonymeInvalideException("Le pseudo du joueur ne peut pas être vide.");
        }
        if (!Character.isLetter(pseudo.charAt(0))) {
            throw new PseudonymeInvalideException("Le pseudo du joueur doit commencer par une lettre.");
        }
        if (pseudo.length() > 32) {
            throw new PseudonymeInvalideException("Le pseudo du joueur ne peut pas dépasser 32 caractères.");
        }

        if (anneeNaiss < 1980 || anneeNaiss > 2012) {
            throw new AnneeDeNaissanceException();
        }
        if (langue ==null) {
            throw new LangueInvalideException();
        }

        for (JoueurDTO joueur : listeJoueurs) {
            if (joueur.getPseudo().equals(pseudo)) {
                throw new JoueurDejaExistantException("Un joueur avec le même pseudonyme existe déjà.");
            }
        }
            JoueurDTO nouveauJoueur = new JoueurDTO(nom, pseudo, anneeNaiss, langue, listeInteret);
            listeJoueurs.add(nouveauJoueur);
            return nouveauJoueur;
    }

    @Override
    public ArrayList<StatistiqueJoueurDTO> recupStatsJoueur(String pseudo) throws PseudoIntrouvableException, JoueurAucunStatsException {
        JoueurDTO joueur = null;

        for (JoueurDTO joueurRecherche : listeJoueurs) {
            if (joueur.getPseudo().equals(pseudo)) {
                joueur =  joueurRecherche;
            }else{
                throw new PseudoIntrouvableException("le pseudo n'est pas present dans la liste des joueurs");
            }
        }
        if (joueur.getStatistiqueJoueurDTO().size() == 0) {
            throw new JoueurAucunStatsException("Le joueur n'a pas de stats et donc n'a pas encore joué");
        }

        return joueur.getStatistiqueJoueurDTO();
    }

    @Override
    public StatistiqueJoueurDTO miseAjourStatsJoueur(String pseudo, int score, int duree, int nbQuestions) throws DonneeInvalideException, PseudoIntrouvableException {
        JoueurDTO joueur = null;

        for (JoueurDTO joueurRecherche : listeJoueurs) {
            if (joueur.getPseudo().equals(pseudo)) {
                joueur =  joueurRecherche;
            }else{
                throw new PseudoIntrouvableException("le pseudo n'est pas present dans la liste des joueurs");
            }
        }

        if (score < 0)
            throw new DonneeInvalideException("inférieur à 0");
        if (duree < 0)
            throw new DonneeInvalideException("inférieur à 0");
        if (nbQuestions < 0)
            throw new DonneeInvalideException("inférieur à 0");
        if (score > nbQuestions)
            throw new DonneeInvalideException("score supérieur au nb de question (or, 1 point par bonne reponse)");

        joueur.getStatistiqueJoueurDTO().add(new StatistiqueJoueurDTO(score, duree, nbQuestions));

        return new StatistiqueJoueurDTO(score, duree, nbQuestions);
    }


    @Override
    public ArrayList<JoueurDTO> listerJoueurs() {
        return listeJoueurs;
    }

}
