public class ExceptionExample {
    /**
     * Method Divide
     *
     * @return The return value
     */
    public static int Divide() {
        try{
            int m = 0;
            int n = 5;
            int k = n/m;
            return k;
        }catch(Exception e){
            System.out.println("0 cannot be a denominator.");
        }
    }
    public static void main(String[] args) {
        int i = 0;
        int j = 5;
        
        if (i<0) {
            throw new ArithmeticException ("0 cannot be a denominator");
        }
        
        
    }
}