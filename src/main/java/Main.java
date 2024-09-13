import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        System.out.println("Numbers A: ");
        double a = scanner.nextInt();
        System.out.println("Numbers B: ");
        double b = scanner.nextInt();
        System.out.println("The sum of " + a + " and " + b + " is " + addition(a,b));

    }

    public static int addition(double a, double b) {
        try {
            if (a < 0 && b < 0) {
                throw new IllegalArgumentException("These");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        return a + b;
    }

    public static int minus(double a, double b) {
        return a - b;
    }
}
