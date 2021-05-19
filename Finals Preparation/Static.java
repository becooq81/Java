public class Static {
    public int hi;
    public static int hello;
    public void hi(){
        Static s = new Static();
        s.hi = 3;
        System.out.println("hi: "+s.hi);
    }
    public static void hello(){
        hello = 3;
        System.out.println("hello: "+hello);
    }
    
    public static void main(String[] args) {
        Static s = new Static();
        s.hi();
        hello();
    }
}