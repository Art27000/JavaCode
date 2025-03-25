import java.util.Scanner;
public class task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] used = new boolean[100];
        int count = 0;

        while (count < 15) {
            int a = (int) (Math.random() * 8) + 2;
            int b = (int) (Math.random() * 8) + 2;
            int index = a * 10 + b;
            int index2 = b * 10 + a;

            if (!used[index]) {
                used[index2] = true;
                used[index] = true;
                System.out.println(a + " * " + b);
                count++;
            }
        }
    }
}
