import java.util.Scanner;

public class TakingAPath {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("apple or chocolate");
        String answer = obj.nextLine().toLowerCase();
        if (obj.equals("apple")){
            System.out.println("you chose apple");
        }
        else if (obj.equals("chocolate")) {
            System.out.println("you chose chocolate ");
        }
        else {
            System.out.println("you chose neither");
        }
    }
}
