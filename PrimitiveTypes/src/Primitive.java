public class Primitive {

    public static void main (String[] args) {
        byte b = 8;
        short s = 1000;
        int i = 145623;
        long l = (long) 50000 * 10 * (b + s + i);
        System.out.println(l);
    }

}
