import java.util.Scanner;

public class six_two{
    public static void main(String[] args) {
        System.out.print("Type in a number in the range -25 to 25 inclusive. ");
        System.out.println("If you want to stop typing in numbers, please enter -1.");
        Scanner scan = new Scanner(System.in);
        
        int number = scan.nextInt();
        
        int numbers[] = new int[51];
        while (number != -50) {
            numbers[number+25]++;
            number = scan.nextInt();
        }
        
        for (int i =0; i<numbers.length; i++) {
            if (numbers[i] != 0) {
                System.out.println((i-25) + " was entered " + numbers[i] + " times.");
            }
        }
    }
}