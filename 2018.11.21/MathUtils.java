public class MathUtils {
    //returns the factorial of the argument given 
    public static int factorial (int n) throws IllegalArgumentException
    {
        if (n<0) {
            throw new IllegalArgumentException("Cannot take a negative number.");
        }
        else if (n>16) {
            throw new IllegalArgumentException("The number is too big.");
        }
        int fac = 1;

        for (int i = n; i> 0; i--){
            fac *= i;
        }
        return fac;
    }
}
        