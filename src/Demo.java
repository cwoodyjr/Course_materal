import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("lets enter a couple of numbers:");
        System.out.print("Enter the first number: ");
        double inputtedNum1 = reader.nextDouble();
        System.out.print("Enter the second number: ");
        double inputtedNum2 = reader.nextDouble();
        double c = 0;

        displayMenu();

        int answer = reader.nextInt();
        if (answer==1){
            c = sumMethod(inputtedNum1,inputtedNum2);
            display(c);

        } else if (answer==2) {
            c = subtractMethod(inputtedNum1,inputtedNum2);
            display(c);

        } else if (answer==3) {
            c = multiplyMethod(inputtedNum1,inputtedNum2);
            display(c);
        }else {
            System.out.println("invalid option!");
        }

    }
    public static void displayMenu(){
        System.out.println("What would you like to do? 1, 2 or 3: ");
        System.out.println("1. add numbers");
        System.out.println("2. subtract numbers");
        System.out.println("3. multiply numbers");

    }
    public static double sumMethod(double a, double b){
        return (a+b);
    }

    public static double subtractMethod(double a, double b){
        return(a-b);
    }
    public static double multiplyMethod(double a, double b){
        return(a*b);
    }
    public static void display(double sum){
        System.out.println("The answer is: "+sum);
    }
}
