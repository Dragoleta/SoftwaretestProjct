/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import com.ifpe.tsproject.entidades.Card;
import com.ifpe.tsproject.repositorio.CardRepo;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author ALUNO
 */
public class CardTest {
        

    @Test
    public void cardIsCorrectlyAdded() {
        Card card = new Card("321", "Credit", "12345678914", "ArthurMoraes", "1234567891234", "02/45");
        CardRepo repo = new CardRepo();

        Boolean added = repo.addCard(card);
        assertTrue(added);
    }


    @Test
    public void CardNotAddedInvalidInfo() {
       
        Card card = new Card("321", "Credit", "12345678914", "ArthurMoraes", "1234567891234", "02/45");
        CardRepo repo = new CardRepo();
        card.setCardCvv("2132");
        card.setCardNumber("2");

        Boolean added = repo.addCard(card);
        assertFalse(added);
    }

    @Test
    public void CardNotAddedInvalidType() {
       Card card = new Card("321", "Credit", "12345678914", "ArthurMoraes", "1234567891234", "02/45");
       
        CardRepo repo = new CardRepo();
        card.setCardType("hdsihdia");

        Boolean added = repo.addCard(card);
        assertFalse(added);
    }
    
        @Test
    public void CardNotAddedInvalidCard() {
       Card card = new Card("321", "Credit", "12345678914", "LucasHenrique", "1234567891234", "02/45");
       
        CardRepo repo = new CardRepo();

        Boolean added = repo.addCard(card);
        assertFalse(added);
    }
    
    
}
