public class Card
{  
    public final int heart = 0, diamond = 1, club = 2, spade = 3;
    public final int ace = 10, jack = 11, queen = 12, king = 13;
    
    private int suit, face;
    String theSuit, theFace;
    
    public Card(int su, int fa) {
        suit = su;
        face = fa;
    }
    
    public String getSuit() {
        if (suit == heart) {
            theSuit = "heart";
        }
        else if (suit == diamond) {
            theSuit = "diamond";
        }
        else if (suit == club) {
            theSuit = "club";
        }
        else if (suit == spade) {
            theSuit = "spade";
        }
        return theSuit;
    }
    
    public String getFace() {
        if (face == ace) {
            theFace = "ace";
        }
        else if (face == jack) {
            theFace = "jack"; 
        }
        else if (face == queen) {
            theFace = "queen";
        }
        else if (face == king) {
            theFace = "king";
        }
        return theFace;
    }
    
    public String toString() {
        return getSuit() + ", " + getFace();
    }
    
}
