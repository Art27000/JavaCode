public class task5 {
    public static void main(String[] args) {
        //1-st task
        int a = 1;
        while (a <= 10){
            int result = a%2;
            if(result == 1){
                System.out.println(a + "- нечетное");
            }
            else{
                System.out.println(a + "- четное");
            }
            a++;
        }
        //2-nd task
        int count = 1;
        int first = 1;
        do{
            int temp = first*2;
            first = temp;
            System.out.println(temp);
            count++;
        }
        while (count <= 10);
        //3-rd task
        int j = 0;
        for(int i = -20; i < 20; i++){
            if(i%2 == 0){
                j += i;
            }
        }
        System.out.println("Summa chetnih chisel ravna: "+j);
    }
}
