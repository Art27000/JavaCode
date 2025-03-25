import java.util.Scanner;
import java.util.Random;

public class task13 {
    public static void main(String[] args){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int m = 0; int n = 0;
        System.out.println("Введите m: ");
        if (sc.hasNextInt()){
            m = sc.nextInt();
            System.out.println("Введите n: ");
            n = sc.nextInt();
        }
        int matrix[][] = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = random.nextInt(100);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            int minIndex = 0;
            int maxIndex = 0;

            for (int j = 0; j < m; j++) {
                if (matrix[i][j] < matrix[i][minIndex]) {
                    minIndex = j;
                }
                if (matrix[i][j] > matrix[i][maxIndex]) {
                    maxIndex = j;
                }
            }

            if (minIndex != 0) {
                int temp = matrix[i][0];
                matrix[i][0] = matrix[i][minIndex];
                matrix[i][minIndex] = temp;
            }

            if (maxIndex != m - 1) {
                int temp = matrix[i][m - 1];
                matrix[i][m - 1] = matrix[i][maxIndex];
                matrix[i][maxIndex] = temp;
            }
        }

        System.out.println("Измененная матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
