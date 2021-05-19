
import java.util.Scanner;
public class ParseInts {
    public static void main(String[] args) {
        int val, sum=0;
        System.out.println("Enter a line of text");
        String line;
        Scanner scan = new Scanner(System.in);
        Scanner scanLine = new Scanner(scan.nextLine());
        
        while (scanLine.hasNext()) {
            try {
                val = Integer.parseInt(scanLine.next());
                sum += val;
            }
            catch (NumberFormatException numFormat) {
            }
        }
        System.out.println("The sum of the integers on this line is " + sum);            
    }
}