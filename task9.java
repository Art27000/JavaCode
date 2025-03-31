public class task9 {
    public static void main(String[] args) {
        int mas[][] = new int[7][4];
        int temp = -1000;
        int max_value = -1000;
        int index[] = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            temp = 1;
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int)(Math.random()*10-5);
                temp *= mas[i][j];
                System.out.print(mas[i][j] + "\t");
            }
            index[i] = temp;
            System.out.print(temp + " is temp");
            System.out.println();
        }
        for (int i = 1; i < index.length; i++) {
            if(index[i] > max_value) {
                max_value = index[i];
            }
        }
        for (int i = 0; i < index.length; i++) {
            if (index[i] == max_value){
                System.out.println("This is max values row index: " + (int)(i+1));
                break;
            }
        }

    }
}
