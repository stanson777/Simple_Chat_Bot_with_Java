import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println(new Main().product(a,b));
    }

    public static int product(int a, int b){
        int product=1;

        for(int i=a;i<b;i++){
            product*=i;
        }

        return product;
    }
}