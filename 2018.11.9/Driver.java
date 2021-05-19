public class Driver
{
    public static void main(String[] args) {
        Address school = new Address ("Taehaeran-ro", "Daechi-dong", "Los Angeles", 412);
        Address home = new Address("Samsung-ro", "Daechi-dong", "Washington", 152);
        Student stud1 = new Student ("Heejin", "Kang", home, school, 41, 26, 91);
        Student stud2 = new Student ("Bob", "Kang", home, school);
        
        stud2.setTestScore(1, 38);
        stud2.setTestScore(2, 85);
        stud2.setTestScore(3, 64);
        
        System.out.println("Bob's score for the first test was: " + stud2.getTestScore(1));
        System.out.println("Bob's score for the second test was: " + stud2.getTestScore(2));
        
        System.out.println("The average for Bob's test scores is: " + stud2.average());
        System.out.println("The average for Heejin's test score is: " + stud1.average());
    }
}
