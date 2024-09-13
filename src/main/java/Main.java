import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static double a;
    static double b;
    public static void main(String[] args) {

        returnNumber();
    }


    public static double returnNumber() {
        System.out.println("Enter two numbers: ");
        System.out.println("Numbers A: ");
        try {
            a = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Please enter a number DUMBFUCK");
        }

        System.out.println("Numbers B: ");
        try {
            b = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Please enter a number DUMBFUCK");
        }
        System.out.println("The sum of " + a + " and " + b + " is " + addition(a,b));
        double c = a + b;
        return c;
    }

    public static double addition(double a, double b) {
        try {
            if (a < 0 && b < 0) {
                throw new IllegalArgumentException("These");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        return a + b;
    }

    public static double minus(double a, double b) {

        return a - b;
    }
}
