public class four_seven
{
    public static void main(String[] args) {
        Rational rat1 = new Rational(4, 7);
        Rational rat2 = new Rational(5, 2);
        
        //add two fractions
        System.out.println("Adding two fractions (4/7, 5/2): " + rat1.add(rat2));
        
        //subtract two fractions
        System.out.println("Subtracting two fractions (4/7, 5/2): " + rat1.subtract(rat2));
        
        //multiply two fractions
        System.out.println("Multiplying two fractions (4/7, 5/2): " + rat1.multiply(rat2));
        
        //divide two fractions
        System.out.println("Dividing two fractions (4/7, 5/2): " + rat1.divide(rat2));
    }
}
