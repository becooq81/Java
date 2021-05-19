public class BiasedCoin
{
    private double bias = Math.random();

    public final int HEADS = 0;
    public final int TAILS = 1;
    
    private int face;
    
    //sets up the coin by flipping it initially
    public BiasedCoin () {
        bias = 0.5;
        flip();
    }
    
    public BiasedCoin(double bi) {
        if ((bi<=1) && (bi >= 0)) {
            bias = bi;
        }
        else {
            bias = 0.5;
        }
        flip();
    }
    
    //flips the coin by randomly choosing a face
    public void flip () {
        double ran = Math.random();
        if (ran<bias) {
            face = 0;
        }
        else {
            face = 1;
        }
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
