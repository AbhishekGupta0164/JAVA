
public class loop_array {
    public static void main(String[] args) {
        // float[] marks = { 100.0f, 90.0f, 80.0f, 70.0f, 60.0f };

        // String[] students = { "Alice", "Bob", "Charlie", "David", "Eve" };
        // System.out.println(students.length);
        // System.out.println(students[0]);

        int[] marks = { 100, 90, 80, 70, 60 };

        // printing using naive way
        // System.out.println("Printing using naive way:");
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);

        // printing array using loop
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // reversing an array
        // System.out.println("Reversing an array:");
        // for (int i = marks.length - 1; i >= 0; i--) {
        // System.out.println(marks[i]);
        // }

        // printing array for each loop
        // System.out.println("Printing array using for each loop:");
        // for (int element : marks) {
        // System.out.println(element);
        // }

    }

}
