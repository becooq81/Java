import java.util.Scanner;

public class six_one{
    public static void main(String[] args) {
        System.out.print("Type in a number in the range 0 to 50 inclusive. ");
        System.out.println("If you want to stop typing in numbers, please enter -1.");
        Scanner scan = new Scanner(System.in);
        
        int number = scan.nextInt();
        
        int numbers[] = new int[51];
        while (number != -1) {
            numbers[number]++;
            number = scan.nextInt();
        }
        
        for (int i =0; i<numbers.length; i++) {
            if (numbers[i] != 0) {
                System.out.println(i + " was entered " + numbers[i] + " times.");
            }
        }
    }
}