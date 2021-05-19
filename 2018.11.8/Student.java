import java.util.Scanner;
public class Student{
    String name;
    int test1, test2;
    
    public Student (String name) {
        this.name = name;
        
    }
    
    public void printName() {
        System.out.println(name);
    }
    
    public void inputGrades() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in the student's test grades.");
        test1 = scan.nextInt();
        while ((test1 < 0) || (test1>100)) {
            System.out.println("The test grade should be at least zero and at most 100.");
            test1 = scan.nextInt();
        }
        test2 = scan.nextInt();
        while ((test2 < 0) || (test2 > 100)) {
            System.out.println("The test grade should be at least zero and at most 100.");
            test2 = scan.nextInt();
        }
    }
    
    public double getAverage () {
        double average = (test1 + test2) / 2.0; 
        return average;
    }
    
    public String getName() {
        return name;
    }
    
    public String toString() {
        return "Name: " + name + "Test1: " + test1 + " Test2: " + test2;
    }
}