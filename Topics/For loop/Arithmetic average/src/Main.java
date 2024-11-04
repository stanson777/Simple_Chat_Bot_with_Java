import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int start=scanner.nextInt();
        int end=scanner.nextInt();
        int counter=0;
        int sum=0;
        for(int i=start;i<=end;i++){
            if(i%3==0){
                counter++;
                sum+=i;
            }
        }
        double average=(double) sum/counter;
        System.out.println(average);

    }
}