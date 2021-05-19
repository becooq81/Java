//finds the length of the longest run of heads in 100 flips of a coin

public class Runs 
{
    public static void main(String[] args) {
        final int FLIPS = 100; // number of coin flips
        
        int currentRun = 0; // length of the current run of HEADS
        int maxRun = 0; // length of the maximum run so far 
        
        // Create a coin object
        BiasedCoin coin1 = new BiasedCoin();
        //Flip the coin FLIPS times
        for (int i = 0; i < FLIPS; i++)
        {
            //Flip the coin & print the result
            coin1.flip();
            if (coin1.getFace() == coin1.HEADS) {
                currentRun++;
            }
            else {
                if (currentRun>maxRun){
                    maxRun=currentRun;
                }
                currentRun=0;
            }
            // Update the run information 
        }
        System.out.println("The maximum number of runs is " + maxRun);
        
    }
}
