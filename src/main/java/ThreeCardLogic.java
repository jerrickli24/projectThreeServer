import java.util.ArrayList;
import java.util.Collections;

public class ThreeCardLogic {
    
    // this method returns what type of hand it is
    // 0 = high card, 1 = pair, 2 = flush, 3 = straight, 4 = three of a kind, 5 = straight flush
    public static int evalHand(ArrayList<Card> hand) {
        
        // need to check for each hand type
        // start with the best hands first
        
        // check if all same suit (flush)
        
        // check if sequential values (straight)
        // don't forget about ace-2-3!
        
        // check if all same value (three of a kind)
        
        // check if two cards match (pair)
        
        // if none of those, its high card
        
        return -1;
    }
    
    // calculates how much you win from pair plus bet
    public static int evalPPWinnings(ArrayList<Card> hand, int bet) {
        
        // if bet is 0 they didn't make the bet
        if(bet == 0) return 0;
        
        // get what type of hand it is
        
        // pay out based on hand value:
        // straight flush = 40 to 1
        // three of a kind = 30 to 1  
        // straight = 6 to 1
        // flush = 3 to 1
        // pair = 1 to 1
        // anything else = lose the bet
        
        return 0;
    }
    
    // compares dealer hand vs player hand
    // returns 2 if player wins, 1 if dealer wins, 0 if tie
    public static int compareHands(ArrayList<Card> dealer, ArrayList<Card> player) {
        
        // first compare hand types
        
        // if they're the same type, compare high cards
        
        return -1;
    }
    
    // dealer needs queen high or better to play
    public static boolean isDealerQualified(ArrayList<Card> hand) {
        
        // check if any card is 12 or higher (Q, K, or A)
        
        return false;
    }
}