public class Code {
    private String originalCode;
    public String newCode, myCode;
    //aditional instance variables
    
    public Code(String code) {
        originalCode = code;
        myCode = code;
        //possibly additional statements
    }
    
    public String getCode() {
        return originalCode;
    }
    
    //precondition: p1 >=0, p1< p2, p2 <= myCode.length()
    //replaces the characters in the code starting at position p1 
    //until position p2-1 inclusive with an X
    public void hide(int p1, int p2) {
        String newCode;
        newCode = myCode.substring(0, p1);
        for (int i = p1; i < p2; i++) {
            newCode += "X";
        }
        newCode += myCode.substring(p2);
        myCode = newCode;
        System.out.println(newCode);
    }
    
    //precondition: p1 >= 0, p1 <p2, p2 <= myCode.length()
    //restores to their original values the characters in the code starting at 
    //position p1 until position p2-1 inclusive
    public void recover(int p1, int p2) {
        String nextCode;
        nextCode = myCode.substring(0, p1) + originalCode.substring(p1, p2) + myCode.substring(p2);
        System.out.println(nextCode);
    }
    
}
    