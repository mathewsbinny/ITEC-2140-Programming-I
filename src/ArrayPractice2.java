public class ArrayPractice2 {
    public static void main(String[] args) {

        //Array Question 2:
        int intArray2[] = new int[] {5, 10, 15, 20, 25};
        int max = 0, temp;

        for(int i = 0; i<5; i++) {
            temp = intArray2[i];
            if(max<temp) {
                max = temp;
            }
            else {
                max=max;
            }
        }
        System.out.println("The max value in the array is: " + max);
    }
}
