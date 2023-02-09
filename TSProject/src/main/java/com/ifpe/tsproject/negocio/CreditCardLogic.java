package com.ifpe.tsproject.negocio;

import com.ifpe.tsproject.entidades.Card;



public class CreditCardLogic {

    public static boolean CardVerify(Card card) {

        if (card.getCardCvv().length() != 3) {
            return false;
        }
        if (card.getUserCPF().length() != 11) {
            return false;
        }
        if (13 < card.getCardNumber().length() || card.getCardNumber().length() > 16) {
            return false;
        }
        if (card.getExpirationDate().isBlank()) {
            return false;
        }
        if (card.getOwnerName().equals("LucasHenrique")) {
            System.err.println("A gente não gosta de voce, foi mal!");
            return false;
        }

        return true;

    }

    public static boolean CardTypeVerify(Card cardC) {
        if ("Credit".equals(cardC.getCardType()) || "Debit".equals(cardC.getCardType())) {
            return true;
        }
        return false;

    }
}