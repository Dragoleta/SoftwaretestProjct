package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import softwaretest.entidades.Card;
import softwaretest.repositorio.CardRepo;

public class CardTest {

    Card card = new Card(321, "Credit", 546519249, "ArthurMoraes", 5648644, "02/45");

    @Test
    public void cardIsCorrectlyAdded(Card card) {

        CardRepo repo = new CardRepo();

        Boolean added = repo.addCard(card);
        assertTrue(added);
    }

    @Test
    public void cardIsCorrectlyAddedCorrectInfo(Card card) {
        CardRepo repo = new CardRepo();
        Boolean added = repo.addCard(card);
        assertTrue(added);
    }

    @Test
    public void CardNotAddedInvalidInfo(Card card) {
        CardRepo repo = new CardRepo();
        card.setCardCvv(213);
        card.setCardNumber(312434245);

        Boolean added = repo.addCard(card);
        assertFalse(added);
    }

    @Test
    public void CardNotAddedInvalidType(Card card) {
        CardRepo repo = new CardRepo();
        card.setCardType("Debit");

        Boolean added = repo.addCard(card);
        assertFalse(added);
    }

}