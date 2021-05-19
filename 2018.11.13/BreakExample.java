public class BreakExample
{
    public static void main(String[] args) {
        //break; //It leaves the current loop.
        int i = 0;
        while (true) {
            //System.out.println(i);
            i++;
            for (int j = 0; j<5000; j +=10) {
                if (i*j>5000) {
                    continue; //goes back to top of the loop
                } 
            }
            if (i>500) {
                System.out.println("i>500, leaving loop.");
                break; //leave this loop
            }
        }
    }
}
