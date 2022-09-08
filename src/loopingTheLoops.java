import java.util.Scanner;

public class loopingTheLoops {
    public static void main(String[] args) {
        for (int he = 0; he < 4; he++){
            System.out.println("hi");}

        System.out.print("username");
        Scanner reader = new Scanner(System.in);
        String username = reader.nextLine();
        while (username.isEmpty()) {
            System.out.println("enter username");
            username = reader.nextLine();
        }
        System.out.println("username");
//
//        Scanner obj = new Scanner(System.in);
//        String usernameone = obj.nextLine();
//        do {
//            System.out.println("username");
//            usernameone = obj.nextLine();
//        } while (usernameone.isEmpty());
//        System.out.println("username");
    }
}
