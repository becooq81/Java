
public class Grades
{
    public static void main(String[] args) {
        Student stud1 = new Student("Mathew");
        Student stud2 = new Student("Jo");
        
        stud1.inputGrades();
        stud2.inputGrades();
        
        System.out.print("The average for " + stud1.getName() + " is " + stud1.getAverage() + ".");
        System.out.print("The average for " + stud2.getName() + " is " + stud2.getAverage() + ".");
        
        System.out.println("Student 1: " + stud1);
        System.out.println("Student 2: " + stud2);
        
        System.out.println(stud1.toString());
        System.out.println(stud2.toString());
    }
}
