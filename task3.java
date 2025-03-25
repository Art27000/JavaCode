public class task3 {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        b=(byte)i;
        System.out.println("Before(int): " + i + "\n" + "After(byte): " + b + "\n");
        i=(int)d;
        System.out.println("Before(double): " + d + "\n" + "After(int): " + i + "\n");
        b=(byte)d;
        System.out.println("Before(double): " + d + "\n" + "After(byte): " + b + "\n");
    }
}
