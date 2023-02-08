package softwaretest.negocio;

import softwaretest.entidades.Card;

public class CreditCardLogic {

    public static boolean CardVerify(Card card) {

        if (321 != card.getCardCvv()) {
            return false;
        }
        if ("ArthurMoraes" != card.getOwnerName()) {
            return false;
        }
        if (5648644 != card.getUserCPF()) {
            return false;
        }
        if (546519249 != card.getCardNumber()) {
            return false;
        }
        if ("02/45" != card.getExpirationDate()) {
            return false;
        }

        return true;

    }

    public static boolean CardTypeVerify(Card cardC) {
        if (cardC.getCardType() != "Credit") {
            return false;
        }
        return true;

    }
}