public class task4 {
    public static void main(String[] args) {
        //1-st task
        float n = 15.45f;
        int result =(int)(n - n%1);
        System.out.println("n is " + result);
        //2-nd task
        int q = 17;
        int w = 9;
        int count = q/w;
        int a = q%w;
        System.out.println("Result: "+count + ". Residue: " + a);
    }
}
