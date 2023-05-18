package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.impl;


import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.exceptions.*;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.mocks.*;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.modeles.InterfaceServiceJoueur;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utiles.exceptions.enums.LanguesEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServiceJoueurBeanTest {
    InterfaceServiceJoueur serviceJoueurBeanTest;


    @Test
    public void testJoueurPrenomCorrecte(){
        try {
            JoueurDTO joueurAttendu = new JoueurDTO("John Doe", "johndoe", 2003, LanguesEnum.FRANCAIS, "Anime");
            serviceJoueurBeanTest = new AjouterJoueurPrenomCorrecteMock();
            JoueurDTO joueurResultat = serviceJoueurBeanTest.ajouterJoueur("John Doe", "johndoe", 2003, LanguesEnum.FRANCAIS, "Anime");
            Assertions.assertEquals(joueurAttendu.getNom(),joueurResultat.getNom());
        } catch (NomInvalideException e) {
            e.printStackTrace();
        } catch (AnneeDeNaissanceException e) {
            e.printStackTrace();
        } catch (PseudonymeInvalideException e) {
            e.printStackTrace();
        } catch (LangueInvalideException e) {
            e.printStackTrace();
        } catch (JoueurDejaExistantException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void testJoueurPrenomIncorrecte() {
        serviceJoueurBeanTest = new AjouterJoueurPrenomIncorrectMock();

        Assertions.assertThrows(NomInvalideException.class, () -> {
            serviceJoueurBeanTest.ajouterJoueur("", "johndoe", 2004, LanguesEnum.FRANCAIS, "Anime");
        });


    }

    @Test
    public void testJoueurAnneeCorrecte(){
        try {
            JoueurDTO joueurAttendu = new JoueurDTO("John Doe", "johndoe", 2003, LanguesEnum.FRANCAIS, "Anime");
            serviceJoueurBeanTest = new AjouterJoueurAnneeCorrecteMock();
            JoueurDTO joueurResultat = serviceJoueurBeanTest.ajouterJoueur("John Doe", "johndoe", 2003, LanguesEnum.FRANCAIS, "Anime");
            Assertions.assertEquals(joueurAttendu.getAnneeDeNaissance(),joueurResultat.getAnneeDeNaissance());
        } catch (NomInvalideException e) {
            e.printStackTrace();
        } catch (AnneeDeNaissanceException e) {
            e.printStackTrace();
        } catch (PseudonymeInvalideException e) {
            e.printStackTrace();
        } catch (LangueInvalideException e) {
            e.printStackTrace();
        } catch (JoueurDejaExistantException e) {
            e.printStackTrace();
        }

    }




    @Test
    public void testJoueurAnneeIncorrecte() {
        serviceJoueurBeanTest = new AjouterJoueurAnneeIncorrecteMock();

        Assertions.assertThrows(AnneeDeNaissanceException.class, () -> {
            serviceJoueurBeanTest.ajouterJoueur("John Doe", "johndoe", 2024, LanguesEnum.FRANCAIS, "Anime");
        });


    }

    @Test
    public void testJoueurPseudoCorrecte(){
        try {
            JoueurDTO joueurAttendu = new JoueurDTO("John Doe", "johndoe", 2003, LanguesEnum.FRANCAIS, "Anime");
            serviceJoueurBeanTest = new AjouterJoueurPseudoCorrecteMock();
            JoueurDTO joueurResultat = serviceJoueurBeanTest.ajouterJoueur("John Doe", "johndoe", 2003, LanguesEnum.FRANCAIS, "Anime");
            Assertions.assertEquals(joueurAttendu.getPseudo(),joueurResultat.getPseudo());
        } catch (NomInvalideException e) {
            e.printStackTrace();
        } catch (AnneeDeNaissanceException e) {
            e.printStackTrace();
        } catch (PseudonymeInvalideException e) {
            e.printStackTrace();
        } catch (LangueInvalideException e) {
            e.printStackTrace();
        } catch (JoueurDejaExistantException e) {
            e.printStackTrace();
        }

    }


    @Test
    public void testJoueurPseudoIncorrecte() {
        serviceJoueurBeanTest = new AjouterJoueurPseudoIncorrectMock();

        Assertions.assertThrows(JoueurDejaExistantException.class, () -> {
            serviceJoueurBeanTest.ajouterJoueur("John Doe", "johndoe", 2004, LanguesEnum.FRANCAIS, "Anime");
        });


    }

    @Test
    public void testJoueurChoixLangueCorrecte(){
        try {
            JoueurDTO joueurAttendu = new JoueurDTO("John Doe", "johndoe", 2003, LanguesEnum.FRANCAIS, "Anime");
            serviceJoueurBeanTest = new AjouterJoueurChoixLangueCorrecteMock();
            JoueurDTO joueurResultat = serviceJoueurBeanTest.ajouterJoueur("John Doe", "johndoe", 2003, LanguesEnum.FRANCAIS, "Anime");
            Assertions.assertEquals(joueurAttendu.getLangue(),joueurResultat.getLangue());
        } catch (NomInvalideException e) {
            e.printStackTrace();
        } catch (AnneeDeNaissanceException e) {
            e.printStackTrace();
        } catch (PseudonymeInvalideException e) {
            e.printStackTrace();
        } catch (LangueInvalideException e) {
            e.printStackTrace();
        } catch (JoueurDejaExistantException e) {
            e.printStackTrace();
        }

    }
}
