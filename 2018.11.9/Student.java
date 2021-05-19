public class Student 
{
    private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    private int score1, score2, score3, testNumber, score;
    //sets up this Student object with the specified initial values.
    public Student(String first, String last, Address home, Address school, int sc1, int sc2, int sc3) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        score1 = sc1;
        score2 = sc2;
        score3 = sc3;
    }
    
    public Student(String first, String last, Address home, Address school) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        score1 = 0;
        score2 = 0;
        score3 = 0;
    }
    
    public void setTestScore(int testNum, int sc) {
        testNumber = testNum;
        if (testNumber == 1) {
            score1 = sc;
        }
        else if (testNumber ==2) {
            score2 = sc;
        }
        else if (testNumber == 3) {
            score3 = sc;
        }
    }
    
    public int getTestScore(int testNum) {
        if (testNum==1) {
            score = score1;
        }
        else if (testNum==2) {
            score = score2;
        }
        else if (testNum ==3) {
            score = score3;
        }
        return score;
    }
    
    public double average() {
        return (score1 + score2 + score3)/3.0;
    }
    
    
    //returns this Student object as a string.
    public String toString() {
        String result;
        
        result = firstName + " " + lastName + "\n";
        result += "Home Address: \n" + homeAddress + "\n";
        result += "School Address: \n" + schoolAddress + "\n";
        result += "1st test score: " + score1 + ", 2nd test score: " + score2 + ", 3rd test score: " + score3 + "\n";
        result += "test average: " + average();
        
        return result;
    }
}
    