public class Demo {
    public static void main(String[] args) {
        double a = 4;
        double b = 6;
        double c = 0;
        //this is the method call
        //c = sumMethod(a,b);
        //display(c);
        //c = subtractMethod(a,b);
        //display(c);
        //c = multiplyMethod(a,b);
        //display(c);
        displayMenu();

    }
    public static void displayMenu(){
        System.out.println("1. calc menu");
        System.out.println("2. add numbers");
        System.out.println("3. subtract numbers");
        System.out.println("4. multiply numbers");
        System.out.print("please choose an option!");
    }
    public static double sumMethod(double n, double m){
        return (n+m);
    }
    public static void display(double sum){
        System.out.println("The Sum Is: "+sum);
    }
    public static double subtractMethod(double n, double m){
        return(n-m);
    }
    public static double multiplyMethod(double n, double m){
        return(n*m);
    }

}
