package com.ifpe.tsproject.repositorio;

import com.ifpe.tsproject.entidades.Card;
import com.ifpe.tsproject.negocio.CreditCardLogic;
import java.util.ArrayList;
import java.util.List;



public class CardRepo {

	private List<Card> card;

	public CardRepo() {
		this.card = new ArrayList<Card>();
	}

	public boolean addCard(Card u) {
		boolean verified = CreditCardLogic.CardVerify(u);
		boolean verifiedType = CreditCardLogic.CardTypeVerify(u);

		if (verified && verifiedType) {
			return this.card.add(u);
		}
		return false;

	}

}