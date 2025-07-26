import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import enums.CardSuit;
import enums.CardType;

public class Main {
    public static void main(String[] args) {
        // Stores the cards on the seven columns
        List<PlayingCard> cardColumn1 = new ArrayList<PlayingCard>();
        List<PlayingCard> cardColumn2 = new ArrayList<PlayingCard>();
        List<PlayingCard> cardColumn3 = new ArrayList<PlayingCard>();
        List<PlayingCard> cardColumn4 = new ArrayList<PlayingCard>();
        List<PlayingCard> cardColumn5 = new ArrayList<PlayingCard>();
        List<PlayingCard> cardColumn6 = new ArrayList<PlayingCard>();
        List<PlayingCard> cardColumn7 = new ArrayList<PlayingCard>();

        // Stores the remaining card deck
        List<PlayingCard> cardDeckClosed = new ArrayList<PlayingCard>();
        List<PlayingCard> cardDeckOpened = new ArrayList<PlayingCard>();

        // Stores the card in the final suit decks
        List<PlayingCard> finalHeartsDeck = new ArrayList<PlayingCard>();
        List<PlayingCard> finalDiamondsDeck = new ArrayList<PlayingCard>();
        List<PlayingCard> finalSpadesDeck = new ArrayList<PlayingCard>();
        List<PlayingCard> finalClubsDeck = new ArrayList<PlayingCard>();

        List<PlayingCard> allCards = new ArrayList<PlayingCard>();// Add all cards to deck
        for (CardSuit suit : CardSuit.values()) {
            for (CardType type : CardType.values()) {
                allCards.add(new PlayingCard(suit, type, false));
            }
        }

        Random random = new Random();// Add cards to columns and remaining to deck
        for (int i = 0; i < 28; i++) {
            int randomNumber = random.nextInt(allCards.size());
            if (i == 0) {
                PlayingCard card = allCards.get(randomNumber);
                card.opened = card.faceUp = true;
                cardColumn1.add(card);

                allCards.remove(randomNumber);
            } else if (i > 0 && i < 3) {
                if (i == 2) {
                    PlayingCard card = allCards.get(randomNumber);
                    card.opened = card.faceUp = true;
                    cardColumn2.add(card);
                } else {
                    cardColumn2.add(allCards.get(randomNumber));
                }
                allCards.remove(randomNumber);
            } else if (i > 2 && i < 6) {
                if (i == 5) {
                    PlayingCard card = allCards.get(randomNumber);
                    card.opened = card.faceUp = true;
                    cardColumn3.add(card);
                } else {
                    cardColumn3.add(allCards.get(randomNumber));
                }
                allCards.remove(randomNumber);
            } else if (i > 5 && i < 10) {
                if (i == 9) {
                    PlayingCard card = allCards.get(randomNumber);
                    card.opened = card.faceUp = true;
                    cardColumn4.add(card);
                } else {
                    cardColumn4.add(allCards.get(randomNumber));
                }
                allCards.remove(randomNumber);
            } else if (i > 9 && i < 15) {
                if (i == 14) {
                    PlayingCard card = allCards.get(randomNumber);
                    card.opened = card.faceUp = true;
                    cardColumn5.add(card);
                } else {
                    cardColumn5.add(allCards.get(randomNumber));
                }
                allCards.remove(randomNumber);
            } else if (i > 14 && i < 21) {
                if (i == 20) {
                    PlayingCard card = allCards.get(randomNumber);
                    card.opened = card.faceUp = true;
                    cardColumn6.add(card);
                } else {
                    cardColumn6.add(allCards.get(randomNumber));
                }
                allCards.remove(randomNumber);
            } else {
                if (i == 27) {
                    PlayingCard card = allCards.get(randomNumber);
                    card.opened = card.faceUp = true;
                    cardColumn7.add(card);
                } else {
                    cardColumn7.add(allCards.get(randomNumber));
                }
                allCards.remove(randomNumber);
            }
        }

        cardDeckClosed = allCards;
        PlayingCard card = cardDeckClosed.removeLast();
        card.opened = card.faceUp = true;
        cardDeckOpened.add(card);

        // List of cards in the stack
        final List<PlayingCard> cards;
        // Callback when card is added to the stack
        //final CardAcceptCallback onCardsAdded;
        // The index of the list in the game
        final int columnIndex;


    }
}