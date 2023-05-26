package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.impl;


import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.entities.dto.StatistiqueJoueurDTO;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.mocks.*;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utils.exceptions.*;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.modeles.InterfaceServiceJoueur;
import fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utils.exceptions.enums.LanguesEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ServiceJoueurBeanTest {
    InterfaceServiceJoueur serviceJoueurBeanTest;


    @BeforeEach
    public void init(){
//        serviceJoueurBeanTest = new ServiceJoueurBean();  //Commentaire a retirer lors du test avec la vraie classe "service".
    }
    @Test
    public void testJoueurPrenomCorrecte(){
            JoueurDTO joueurAttendu = new JoueurDTO("John Doe", "johndoe", 2003, LanguesEnum.FRANCAIS, "Anime");
            //serviceJoueurBeanTest = new AjouterJoueurPrenomCorrecteMock();
        JoueurDTO joueurResultat = null;
        try {
            joueurResultat = serviceJoueurBeanTest.ajouterJoueur("John Doe", "johndoe", 2003, LanguesEnum.FRANCAIS, "Anime");
        } catch (JoueurDejaExistantException e) {
            e.printStackTrace();
        } catch (NomInvalideException e) {
            e.printStackTrace();
        } catch (AnneeDeNaissanceException e) {
            e.printStackTrace();
        } catch (PseudonymeInvalideException e) {
            e.printStackTrace();
        } catch (LangueInvalideException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(joueurAttendu.getNom(),joueurResultat.getNom());


    }
    @Test
    public void testJoueurPrenomIncorrecte() {
        //serviceJoueurBeanTest = new AjouterJoueurPrenomIncorrectMock();

        Assertions.assertThrows(NomInvalideException.class, () -> {
            serviceJoueurBeanTest.ajouterJoueur("", "johndoe", 2004, LanguesEnum.FRANCAIS, "Anime");
        });


    }

    @Test
    public void testJoueurAnneeCorrecte(){
            JoueurDTO joueurAttendu = new JoueurDTO("John Doe", "johndoe", 2003, LanguesEnum.FRANCAIS, "Anime");
            //serviceJoueurBeanTest = new AjouterJoueurAnneeCorrecteMock();
        JoueurDTO joueurResultat = null;
        try {
            joueurResultat = serviceJoueurBeanTest.ajouterJoueur("John Doe", "johndoe", 2003, LanguesEnum.FRANCAIS, "Anime");
        } catch (JoueurDejaExistantException e) {
            e.printStackTrace();
        } catch (NomInvalideException e) {
            e.printStackTrace();
        } catch (AnneeDeNaissanceException e) {
            e.printStackTrace();
        } catch (PseudonymeInvalideException e) {
            e.printStackTrace();
        } catch (LangueInvalideException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(joueurAttendu.getAnneeDeNaissance(),joueurResultat.getAnneeDeNaissance());


    }




    @Test
    public void testJoueurAnneeIncorrecte() {
        //serviceJoueurBeanTest = new AjouterJoueurAnneeIncorrecteMock();

        Assertions.assertThrows(AnneeDeNaissanceException.class, () -> {
            serviceJoueurBeanTest.ajouterJoueur("John Doe", "johndoe", 2024, LanguesEnum.FRANCAIS, "Anime");
        });


    }

    @Test
    public void testJoueurPseudoCorrecte(){
            JoueurDTO joueurAttendu = new JoueurDTO("John Doe", "johndoe", 2003, LanguesEnum.FRANCAIS, "Anime");
            //serviceJoueurBeanTest = new AjouterJoueurPseudoCorrecteMock();
        JoueurDTO joueurResultat = null;
        try {
            joueurResultat = serviceJoueurBeanTest.ajouterJoueur("John Doe", "johndoe", 2003, LanguesEnum.FRANCAIS, "Anime");
        } catch (JoueurDejaExistantException e) {
            e.printStackTrace();
        } catch (NomInvalideException e) {
            e.printStackTrace();
        } catch (AnneeDeNaissanceException e) {
            e.printStackTrace();
        } catch (PseudonymeInvalideException e) {
            e.printStackTrace();
        } catch (LangueInvalideException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(joueurAttendu.getPseudo(),joueurResultat.getPseudo());


    }


    @Test
    public void testJoueurPseudoIncorrecte() {
        //serviceJoueurBeanTest = new AjouterJoueurPseudoIncorrectMock();
        Assertions.assertThrows(JoueurDejaExistantException.class, () -> {
            serviceJoueurBeanTest.ajouterJoueur("John Doe", "johndoe", 2004, LanguesEnum.FRANCAIS, "Anime");

            serviceJoueurBeanTest.ajouterJoueur("John Doe", "johndoe", 2004, LanguesEnum.FRANCAIS, "Anime");
        });


    }

    @Test
    public void testJoueurChoixLangueCorrecte(){
        try {
            JoueurDTO joueurAttendu = new JoueurDTO("John Doe", "johndoe", 2003, LanguesEnum.FRANCAIS, "Anime");
            //serviceJoueurBeanTest = new AjouterJoueurChoixLangueCorrecteMock();
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


    @Test
    public void testRecupStatJoueurPseudoCorrect() {
        serviceJoueurBeanTest = new RecupStatsJoueurPseudoCorrecteMock();

        StatistiqueJoueurDTO stat = new StatistiqueJoueurDTO( 1, 1, 1);
        ArrayList <StatistiqueJoueurDTO> listStatAttendu = new ArrayList<>();
        listStatAttendu.add(stat);
        ArrayList<StatistiqueJoueurDTO> listStatResultat;

        try {
            serviceJoueurBeanTest.miseAjourStatsJoueur("johndoe", 1, 1, 1);
            listStatResultat = serviceJoueurBeanTest.recupStatsJoueur("johndoe");
        } catch (PseudoIntrouvableException | JoueurAucunStatsException | DonneeInvalideException e) {
            throw new RuntimeException(e);
        }
        Assertions.assertEquals(listStatAttendu.get(0).getNbQuestions(), listStatResultat.get(0).getNbQuestions());

/*        On suppose ici que si les nombres de questions sont les memes, alors la mise a jour a été prise en compte.
        --> Je voulais au debut verifier l'égalité entre la premiere valeure des 2 listes, mais comme il s'agit de 2
        objet (contenant plusieurs attributs: "duree", "score", etc...) le AssertEquals faisait une comparaison de
        leurs adresse.
        Autre solution:
                Assertions.assertEquals(listStatAttendu.size(), listStatResultat.size());
                -> si .size() renvoie 1 des deux cotés, alors on suppose que la mise à jour a été prise en compte.

*/


    }

    @Test
    public void testRecupStatJoueurPseudoIncorrect(){
        serviceJoueurBeanTest = new RecupStatsJoueurPseudoIncorrecteMock();
        Assertions.assertThrows(PseudoIntrouvableException.class, () -> {
            serviceJoueurBeanTest.recupStatsJoueur("johndoe");
        });
    }

    @Test
    public void testMiseAJourStatsJoueurDonneeIncorrect(){
        serviceJoueurBeanTest = new MiseAJourStatsJoueurDonneeIncrrecteMock();
        Assertions.assertThrows(DonneeInvalideException.class, () -> {
            serviceJoueurBeanTest.miseAjourStatsJoueur("johndoe", 7, -1, 5);
        });
    }


    @Test
    public void testMiseAJourStatsJoueurDonneeCorrect(){
        serviceJoueurBeanTest = new MiseAJourStatsJoueurDonneCorrecteMock();
//        JoueurDTO j1 = new JoueurDTO("John Doe", "johndoe", 2003, LanguesEnum.FRANCAIS, "Anime");
        StatistiqueJoueurDTO statAttendu = new StatistiqueJoueurDTO(2,2,2);
        StatistiqueJoueurDTO statResultat = null;
        try {
            statResultat = serviceJoueurBeanTest.miseAjourStatsJoueur("Geovany",2,2,2);
        } catch (DonneeInvalideException | PseudoIntrouvableException e) {
            throw new RuntimeException(e);
        }
        Assertions.assertEquals(statAttendu.getDuree(),statResultat.getDuree());
        Assertions.assertEquals(statAttendu.getNbQuestions(),statResultat.getNbQuestions());
        Assertions.assertEquals(statAttendu.getScore(),statResultat.getScore());

    }


    @Test void testRecupStatsJoueurStatsIntrouvableMock(){
        serviceJoueurBeanTest = new RecupStatsJoueurStatsIncorrecteMock();
        ArrayList<JoueurDTO> listJoueurs = new ArrayList<JoueurDTO>();

        Assertions.assertThrows(JoueurAucunStatsException.class, () -> {
            serviceJoueurBeanTest.recupStatsJoueur("johndoe");
        });
    }
}
