package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.mocks;

import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.exceptions.*;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.modeles.InterfaceServiceJoueur;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utiles.exceptions.enums.LanguesEnum;

import java.util.ArrayList;

public class AjouterJoueurPrenomIncorrectMock implements InterfaceServiceJoueur {


    @Override
    public JoueurDTO ajouterJoueur(String nom, String pseudo, int anneeNaiss, LanguesEnum langue, String listeInteret) throws JoueurDejaExistantException, NomInvalideException {
        if (nom.length()==0) {
            throw new NomInvalideException("La saisie du nom est vide...");
        }

        try {

            return new JoueurDTO("", "johndoe", 2003, LanguesEnum.FRANCAIS, "Anime");
        } catch (NomInvalideException e) {
            e.printStackTrace();
        } catch (AnneeDeNaissanceException e) {
            e.printStackTrace();
        } catch (PseudonymeInvalideException e) {
            e.printStackTrace();
        } catch (LangueInvalideException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<JoueurDTO> listerJoueurs() {
        return null;
    }
}