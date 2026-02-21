
public class hello {
    public static void main(String[] args) {

        // question 1 sum of all the elements in an array
        float[] marks = { 45.5f, 67.8f, 89.0f, 78.5f, 92.3f };
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);

        // question 2 check if a value is present in an array or not
        // float[] marks = { 45.5f, 67.8f, 89.0f, 78.5f, 92.3f };
        // float num = 89.0f;
        // boolean isPresent = false;
        // for (float element : marks) {
        // if (num == element) {
        // isPresent = true;
        // break;
        // }
        // }
        // if (isPresent) {
        // System.out.println("The value is present in the array");
        // } else {
        // System.out.println("The value is not present in the array");
        // }

        // question 3 calculate the average marks from an array containing marks of all
        // students in physics using for each loop
        // float[] marks = { 45, 67, 89, 78, 92 };
        // float sum = 0;
        // for (float element : marks) {
        // sum = sum + element;
        // }
        // float avg = sum / marks.length;
        // System.out.println("The value of average is " + avg);

        // question 4 add two matrices
        // int[][] mat1 = { { 1, 2, 3 },
        // { 4, 5, 6 } };
        // int[][] mat2 = { { 7, 8, 9 },
        // { 10, 11, 12 } };
        // int[][] result = { { 0, 0, 0 },
        // { 0, 0, 0 } };
        // for (int i = 0; i < mat1.length; i++) { // row number of times
        // for (int j = 0; j < mat1[i].length; j++) { // column number of time
        // result[i][j] = mat1[i][j] + mat2[i][j];
        // System.out.print(result[i][j] + " ");
        // System.out.format("Setting value for i=%d and j=%d\n", i, j);
        // }
        // System.out.println(" ");
        // System.out.println(result[i][0] + " " + result[i][1] + " " + result[i][2]);
        // }

        // question 5 swap two arrays
        // int[] arr1 = { 1, 2, 3, 4, 5 };
        // int[] arr2 = { 6, 7, 8, 9, 10 };
        // System.out.println("Array before swapping");
        // System.out.println("arr1= " + Arrays.toString(arr1));
        // System.out.println("arr2= " + Arrays.toString(arr2));

        // int[] temp = arr1;
        // arr1 = arr2;
        // arr2 = temp;
        // System.out.println("Array after swapping ");
        // System.out.println("arr1= " + Arrays.toString(arr1));
        // System.out.println("arr2= " + Arrays.toString(arr2));
        // // indsteed of array to string we can also use for loop to print the array
        // for (int i = 0; i < arr1.length; i++) {
        // System.out.println(arr1[i] + "");
        // }
        // System.out.println();

        // question 6 swap one array elements
        // int[] arr = { 1, 2, 3, 4, 5 };
        // int l = arr.length;
        // int n = Math.floorDiv(l, 2);
        // int temp;
        // System.out.println("Array before swapping: " +
        // java.util.Arrays.toString(arr));

        // for (int i = 0; i < n; i++) {
        // // Swap a[i] and a[l-1-i]
        // // a b temp
        // // |4|5| |
        // temp = arr[i];
        // arr[i] = arr[l - 1 - i];
        // arr[l - 1 - i] = temp;
        // }
        // for (int element : arr) {
        // System.out.print(element + " ");
        // }

        // question 7 max element in an array
        // int[] arr = { 203, 2, 43, 53, -5 };
        // int max = 0;
        // for (int element : arr) {
        // if (element > max) {
        // max = element;
        // }
        // }
        // // System.out.println(Integer.MIN_VALUE);
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println("The value of max element in array is: " + max);

        // question 8 array is sorted or not
        // int[] arr = { 1, 2, 3, 47, 5 };
        // boolean isSorted = true;
        // for (int i = 0; i < arr.length - 1; i++) {
        // if (arr[i] > arr[i + 1]) {
        // isSorted = false;
        // break;
        // }
        // }
        // if (isSorted) {
        // System.out.println("The array is sorted");
        // } else {
        // System.out.println("The array is not sorted");
        // }

    }
}
