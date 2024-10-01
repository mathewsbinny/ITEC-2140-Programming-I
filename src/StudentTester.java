public class StudentTester {

    public static void main(String[] args) {
        // Array of Student objects
        Student[] students = new Student[5];
        students[0] = new Student("Alice", 18);
        students[1] = new Student("Bob", 22);
        students[2] = new Student("Charlie", 19);
        students[3] = new Student("David", 25);
        students[4] = new Student("Eve", 21);

        // Print names of students older than 20
        System.out.println("Students older than 20:");
        for (Student student : students) {
            if (student.age > 20) {
                System.out.println(student.name);
            }
        }
    }
}
