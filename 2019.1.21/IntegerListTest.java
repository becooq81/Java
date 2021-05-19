import java.util.Scanner;
public class IntegerListTest {
    static IntegerList list = new IntegerList(10);
    
    // Create a list, then repeatedly print the menu and do what the user asks until they quit
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        printMenu();
        int choice = scan.nextInt();
        while (choice != 0) {
            dispatch(choice);
            printMenu();
            choice = scan.nextInt();
        }
    }
    
    // Do what the menu item calls for
    public static void dispatch(int choice) {
        int loc;
        Scanner scan = new Scanner(System.in);
        switch(choice) {
            case 0:
                System.out.println("Bye!");
                break;
            case 1: 
                System.out.println("How big should the list be?");
                int size = scan.nextInt();
                list = new IntegerList(size);
                list.randomize();
                break;
            case 2:
                list.selectionSort();
                break;
            case 3:
                System.out.print("Enter the value to look for: " );
                loc = list.search(scan.nextInt());
                if (loc != -1) 
                    System.out.println("Found at location "  + loc);
                else 
                    System.out.println("Not in list");
                break;
            case 4:
                list.print();
                break;
            case 5:
                list.sortDecreasing();
                break;
            case 6:
                int oldVal = scan.nextInt();
                int newVal = scan.nextInt();
                list.replaceFirst(oldVal, newVal);
                break;
            case 7:
                oldVal = scan.nextInt();
                newVal = scan.nextInt();
                list.replaceAll(oldVal, newVal);
                break;
            case 8:
                int target = scan.nextInt();
                list.binarySearch(target);
                break;
            case 9: 
                list.insertionSort();
                break;
        }
    }
    
    // print the user's choices
    public static void printMenu() {
        System.out.println("\n  Menu    ");
        System.out.println("    ====    ");
        System.out.println("0: Quit");
        System.out.println("1: Create a new list (** do this first!! **)");
        System.out.println("2: Sort the list using selection sort");
        System.out.println("3: Find an element in the list using sequential search");
        System.out.println("4: Print the list");
        System.out.println("5: Sort the list in decreasing order using selection sort");
        System.out.println("6: Replace the first occurence of a value with a new value");
        System.out.println("7: Replace all occurrences of a value in the list with a new value");
        System.out.println("8: Find an element in the list using binary search");
        System.out.println("9: Sort the list using insertion sert");
        System.out.print("\nEnter your choice: " );
    }
    
    
}