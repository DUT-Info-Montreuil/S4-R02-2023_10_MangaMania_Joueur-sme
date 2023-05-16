package fr.iut.montreuil.R4_S02_2023_10.MangaMania.Joueur_sme.utiles.exceptions.enums;

public enum LanguesEnum {
        FRANCAIS(1),
        ENGLISH(2),
        DEUTSCH(3),
        ESPANA(4),
        ITALIA(5);

        private final int choix;

        LanguesEnum(int choix) {
                this.choix = choix;
        }

        public int getChoix() {
                return choix;
        }
}

