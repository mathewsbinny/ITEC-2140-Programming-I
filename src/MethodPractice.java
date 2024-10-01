import java.util.Scanner;
public class MethodPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Method 1: Write an instance method called `calculateSquare` that takes an integer parameter and returns its square.
        System.out.print("Enter an integer to find it's square: ");
        int nums = input.nextInt();
        System.out.println(calculateSquare(nums));

        //Method 2:Create an instance method named `printName` that accepts a string parameter `name` and prints "Hello, [name]!".
        System.out.print("Greetings. What is your name? ");
        String name = input.next();
        System.out.println(printName(name));
    }

    //Method 1
    public static int calculateSquare(int param) {
        int numSquare = param * param;
        return numSquare;
    }

    public static String printName(String name) {

        return "Hello, " + name + "!";
    }

}
