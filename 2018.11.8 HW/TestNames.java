import java.util.Scanner;
public class TestNames
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in a name. (first, middle, and last)");
        Name name1 = new Name(scan.next(), scan.next(), scan.next());
        System.out.println("Type in another name. (first, middle, and last)");
        Name name2 = new Name(scan.next(), scan.next(), scan.next());
        System.out.println(name1.firstMiddleLast() + "    " + name2.firstMiddleLast());
        System.out.println(name1.lastFirstMiddle() + "    " + name2.lastFirstMiddle());
        System.out.println(name1.initials() + "    " + name2.initials());
        System.out.println(name1.length() + "    " + name2.length());
        
        if (name1.equals(name2)) {
            System.out.println("The two names are the same");
        }
        else {
            System.out.println("The two names are different.");
        }
    }
}
