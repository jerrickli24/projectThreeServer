import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    
    private ArrayList<Card> cards;
    
    public Deck() {
        cards = new ArrayList<>();
        reset();
    }
    
    public void reset() {
        cards.clear();
        
        // make all 52 cards
        // suits are C, D, H, S
        // values are 2-14 (11=Jack, 12=Queen, 13=King, 14=Ace)
        
    }
    
    public void shuffle() {
        // use Collections.shuffle
    }
    
    public Card dealCard() {
        // remove and return the first card in the deck
        return null;
    }
    
    public int size() {
        return cards.size();
    }
}