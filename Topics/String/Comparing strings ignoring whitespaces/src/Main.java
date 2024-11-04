import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String text=scanner.nextLine();
        String text2=scanner.nextLine();


        String text1=text.replace(" ","").trim();
        String text3=text2.replace(" ","").trim();

        System.out.println(text1.equals(text3));
        scanner.close();
    }
}