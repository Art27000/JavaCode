public class task8 {
    public static void main(String[] args) {
        //1-st task
        int mas[];
        mas = new int[50];
        int temp = 1;
        for (int j = 0; j < mas.length; j++) {
            for (int i = temp; i < 100; i++){
                if(i%2 == 1){
                    temp = i;
                    break;
                }
            }
            mas[j] = temp;
            temp++;
            System.out.print(mas[j] + " ");
        }
        System.out.println("");
        for (int i = mas.length-1; i > -1 ; i--) {
            System.out.print(mas[i] + " ");
        }
    }
}
