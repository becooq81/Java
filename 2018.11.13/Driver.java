public class Driver
{
    public static void main(String[] args) {
        Code code = new Code("ABCdef123ghi456jklMNO");
        
        code.hide(2,7);
        code.recover(5,9);
        code.hide(3,14);
        code.hide(6,10);
        code.recover(5,6);
        code.recover(0,14);
    }
}
