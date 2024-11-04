import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
        int cupcakes=scanner.nextInt();
        boolean isWeekend=scanner.nextBoolean();
        if((cupcakes>=10 && cupcakes<=20)&& !isWeekend){
            System.out.println(true);
        }else if((cupcakes>=15 && cupcakes<=25)&& isWeekend){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}