public class modParams
{
    public void modParams (int x, String s1, String s2) {
        x++;
        s1 = s1 + "BB";
        s2 = new String("memory");
    }
    public void print() {
        int k = 1;
        String s1 = "AA";
        String s2 = "space";
        modParams = (k, s1, s2);
        System.out.println(k+ " " + s1 + " " + s2);
    }
}
