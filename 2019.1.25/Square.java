import java.util.Scanner;
public class Square {
    int[][] square;
    public int sum;
    Scanner scan = new Scanner(System.in);
    
    // create new square of given size
    public Square(int size) {
        this.square = new int[size][size];
    }
    
    // return the sum of the values in the given row
    public int sumRow (int row) {
        sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[row][i];
        }
        return sum;
    }
    
    // return the sum of the values in the given column
    public int sumCol(int col) {
        sum= 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[i][col];
        }
        return sum;
    }
    
    // return the sum of the values in the main diagonal
    public int sumMainDiag() {
        sum = 0;
        for (int i = 0; i < square.length; i ++) {
            sum += square[i][i];
        }
        return sum;
    }
    
    // return the sum of the values in the other ("reverse") diagonal
    public int sumOtherDiag() {
        sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[square.length-i][i];
        }
        return sum;
    }
    
    // return true if the square is magic (all rows, cols, and diags have same sum), false otherwise
    public boolean magic() {
        boolean bool = true;
        int temp = sumRow(0);
        for (int i = 0; i < square.length; i++) {
            if (sumRow(i) != temp || sumCol(i) != temp || sumMainDiag() != temp || sumOtherDiag() != temp) {
                bool = false;
                break;
            }
        }
        return bool;
    }
    
    // read info into square from the standard input
    public void readSquare() {
        for (int row = 0; row<square.length; row++) 
            for (int col = 0; col < square.length; col ++) 
                square[row][col] = scan.nextInt();
    }
    
    // print the contents of the square, neatly formatted
    public void printSquare() {
        for (int i = 0; i < square.length; i ++) {
            for (int j = 0; j < square.length; j++) {
                System.out.print(square[i][j] + "   ");
            }
            System.out.println();
        }
    }
    
}