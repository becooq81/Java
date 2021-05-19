public class CardGame
{
    public static void main(String[] args) {
        int suit, face;
        for (int i=0; i<20; i++) {
            suit = (int) (Math.random()*4);
            face = (int) (Math.random()*4) + 10;
            
            Card card = new Card(suit, face);
            
            System.out.println("The suit of the card is: " + card.getSuit());
            System.out.println("The face of the card is: " + card.getFace());
            System.out.println(card);
        }
    }
}
