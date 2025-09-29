import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        int age = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = in.nextInt();

        if (age >= 21) {
            System.out.println("You get a wrist band.");


        }
    }
}