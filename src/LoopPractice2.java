import java.util.Scanner;
public class LoopPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nums, sum = 0;

        do {
            System.out.print("Please enter a positive number: ");
            nums = input.nextInt();
            if (nums > 0) {
                sum += nums;
            }
        }
        while (nums > 0);

        System.out.println("The final sum of all positive number inputs is: " + sum);
    }
}
