public class arrayintro {
    public static void main(String[] args) {
        // ṭhewe are three ways to declare an array in java
        // 1. data_type[] array_name = new data_type[size]; * declaration + allocation
        // int [] marks = new int[5];

        // 2. data_type array_name[] = new data_type[size]; * declaration + allocation
        // int marks[] = new int[5];
        // system.out.println(marks[3]);

        // both of the above are same and can be used interchangeably

        // 3. data_type[] array_name = {value1, value2, value};
        // * declaration + allocation + initialization
        // int[] marks = {100, 90, 80, 70, 60};
        // system.out.println(marks[0]);

        int[] marks = new int[5];
        marks[0] = 100;
        marks[1] = 90;
        marks[2] = 80;
        marks[3] = 70;
        marks[4] = 60;
        System.out.println(marks[0]);

    }

}
