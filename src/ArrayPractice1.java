public class ArrayPractice1 {
    public static void main(String[] args) {

        //Array Question 1:
        int intArray[] = new int[] {5, 10, 15, 20, 25};
        int sum = 0, holder;

        for(int i = 0; i<5; i++) {
            holder = intArray[i];
            sum += holder;
        }
        System.out.println("The sum of the values in the array are: " + sum);

    }
}
