import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String city=scanner.nextLine();

        scanner.close();
        System.out.println(checkBurgs(city));
    }
    public static boolean checkBurgs(String city){
        if(city.length()>=4 && city.substring(city.length()-4).equals("burg")){
            return true;
        }else{
            return false;
        }
    }
}