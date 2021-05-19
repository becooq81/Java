import java.util.Scanner;
public class PlayGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GameBoard board = new GameBoard();
        
        char chip1 = 'O';
        char chip2 = 'X';
        
        Player player1 = new Player(chip1);
        Player player2 = new Player(chip2);
        
        while (true) {
            while (true) {
                System.out.println("Player1, where do you want to put the chip? Please type in the number of column. (1~7)");
                int col = scan.nextInt();
                boolean done = board.putChip(player1.getChip(), col-1);
                if (done== true) {
                    break;
                }
            }
            System.out.println(board);
            
            if (board.checkFour(player1.getChip())==true) {
                System.out.println("Player1, you connected four chips! You won! Congratulations!");
                break;
            }
            
            while (true) {
                System.out.println("Player2, where do you want to put the chip? Please type in the number of column. (1~7)");
                int column = scan.nextInt();
                boolean done = board.putChip(player2.getChip(), column-1);
                if (done== true) {
                    break;
                }
            }
            
            System.out.println(board);
            if (board.checkFour(player2.getChip())==true) {
                   System.out.println("Player2, you connected four chips! You won! Congratulations!");
                   break;
               }
            
            
            
            
        }
    }
}