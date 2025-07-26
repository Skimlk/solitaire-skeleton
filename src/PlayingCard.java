import enums.CardSuit;
import enums.CardType;

public class PlayingCard {
    CardSuit suit;
    CardType type;
    boolean faceUp;
    boolean opened = false;

    public PlayingCard(CardSuit suit, CardType type, boolean faceUp) {
        this.suit = suit;
        this.type = type;
        this.faceUp = faceUp;
    }
}
