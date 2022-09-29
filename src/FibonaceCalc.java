public class FibonaceCalc {
    public static void main(String[] args) {

        fibonace();

    }

    public static void fibonace(){
        int num1 = 1;
        int num2 = 1;
        int num3 = num1+num2;
        System.out.print(num1+" "+num2+" ");
        while(num3 <= 100){
            System.out.print(num3+" ");
            num1 = num2;

            num2 = num3;

            num3 = num1+num2;

        }

    }


}
