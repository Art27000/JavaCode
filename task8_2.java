public class task8_2 {
    public static void main(String[] args) {
        int mas[] = new int[15];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(Math.random()*9);
            System.out.println(mas[i]);
        }
        byte temp = 0;
        for (int i = 0; i < mas.length; i++) {
            if(i%2 == 0){
                temp++;
            }
        }
        System.out.println("Количество четных элементов равно " +temp);
    }
}
