import java.lang.Throwable;
public class ThrowsHeader {

    public static int Divide(int i) throws Exception{         
        
        int k = i/0;
        return k;
        
    }
    public static void main(String[] args) {
        Integer a = new Integer(5);
        try{
            Divide(5);
            
        }
        catch (Exception e) {
            System.out.println("denominator cannot be 0");
        }
    }
}