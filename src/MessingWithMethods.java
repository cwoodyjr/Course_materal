public class MessingWithMethods {
    public static void main(String[] args) {
        double length = 3;
        double volume = cubeVolume(length);
        System.out.println(volume);
    }
    public static double cubeVolume(double a){
        return (a*a*a);

    }

}
