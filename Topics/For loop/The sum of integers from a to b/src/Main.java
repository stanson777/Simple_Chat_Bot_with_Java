import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println(new Main().sum(a,b));

    }


    public int sum(int a, int b){
        if(a>b){
            return 0;
        }else{
            return a+sum(a+1,b);
        }
    }
}