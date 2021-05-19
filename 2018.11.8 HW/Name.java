public class Name
{
    String firstName, middleName, lastName;
    String fullName;
    
    public Name(String first, String middle, String last) {
        firstName = first;
        middleName = middle;
        lastName = last;
        fullName = firstName + " " + middleName + " " + lastName;
    }
    
    public String getFirst() {
        return firstName;
    }
    
    public String getMiddle() {
        return middleName;
    }
    
    public String getLast() {
        return lastName;
    }
    
    public String firstMiddleLast() {
        return (firstName + " " + middleName + " " + lastName);
    }
    
    public String lastFirstMiddle() {
        return (lastName + ", " + firstName + " " + middleName);
    }
    
    public boolean equals(Name otherName) {
        if (fullName.toLowerCase().equals(otherName.firstMiddleLast().toLowerCase()))
        {
            return true;   
        }
        else {
            return false;
        }
    }
    
    public String initials() {
        return (firstName.substring(0,1)+middleName.substring(0,1)+lastName.substring(0,1)).toUpperCase();
    }
    
    public int length() {
        return (firstName+middleName+lastName).length();
    }
}
