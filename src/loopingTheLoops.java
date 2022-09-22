import java.util.Scanner;

public class loopingTheLoops {
    public static void main(String[] args) {
      //  for (int he = 0; he < 4; he++){
       //     System.out.println("hi");}

        //System.out.print("enter username");
        Scanner reader = new Scanner(System.in);
       // String username = reader.nextLine();
       // while (username.isEmpty()) {
        //    System.out.println("enter username");
        //    username = reader.nextLine();
       // }
        //System.out.println("username: "+username);
        String helloWorld = ("1. Hello");
        String mumbojumbo = ("2. mumbojumbo");
        String exit = ("x. Exit Prgramme");
        System.out.println(helloWorld+" "+mumbojumbo+" "+exit);
        System.out.print("please enter 1,2,x: ");
        String answer = reader.nextLine().toLowerCase();
        switch (answer) {
            case "1" -> {
                System.out.println("you ran the hello world programme");
                System.exit(0);
            }
            case "2" -> System.out.println("you ran the mumbojumbo programme");
            case "x" -> {
                System.out.println("are you sure you wish to exit?");
                System.out.println("Y or N");
                String closeAnswer = reader.nextLine().toLowerCase();
                if (closeAnswer.equals("y")) {
                    System.out.println("Exiting Programme");
                    System.exit(0);
                }
                if (closeAnswer.equals("n")){
                    System.out.println("please choose another option: ");
                    System.out.println("1, 2, X");
                    answer = reader.nextLine().toLowerCase();
                }
            }
            default -> System.out.println("invalid selection");
        }


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
