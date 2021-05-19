public class five_two {
    public static void main(String[] args) {
        String s1 = "dog";
        String s2 = "DOG";
        s2 = s2.toLowerCase();
        //String s2 = new String("dog");
        String s3 = s1;
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));

        if (s1 == s2) {
            System.out.println ("I is true");
        }
        else {
            System.out.println("I is false");
        }
        if (s1 == s3) {
            System.out.println("II is true");
        }
        else {
            System.out.println("II is false");
        }
        if (s2 == s3) {
            System.out.println("III is true");
        }
        else {
            System.out.println("III is false");
        }
    }
}