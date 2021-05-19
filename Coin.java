public class Coin
{
    public final int HEADS = 0;
    public final int TAILS = 1;
    
    private int face;
    
    //sets up the coin by flipping it initially
    public Coin () {
        flip();
    }
    
    //flips the coin by randomly choosing a face
    public void flip () {
        face = (int) (Math.random()*2);
    }
    
    //returns the current face of the coin as an integer
    public int getFace() {
        return face;
    }
    
    //returns the current face of the coin as a string
    public String toString() {
        String faceName;
        
        if (face==HEADS) 
            faceName = "Heads";
        else 
            faceName = "Tails";
        return faceName;
    }
}