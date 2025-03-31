import static java.lang.Math.*;
public class task6 {
    public static void main(String[] args) {
        //task1
        int a = 15;
        int b = 17;
        double square = sqrt(pow(a,2) + pow(b,2));
        square = round(square);
        System.out.println("Square is: " + square);
        //task2
        int n = 1240506;
        int number = (int)log10(n) + 1;
        System.out.println(number);
    }
}
