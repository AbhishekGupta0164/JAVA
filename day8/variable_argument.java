public class variable_argument {

    // static int sum(int a, int b) {
    // return a + b;
    // }

    // static int sum(int a, int b, int c) {
    // return a + b + c;
    // }

    // static int sum(int a, int b, int c, int d) {
    // return a + b + c + d;
    // }

    /*
     * instead of using these 3 diffrent methods we use varargs ( ... )
     * varargs = return all arguments into an arr
     */

    // static int sum(int x, int... arr){
    // int return x; // then it is compulsary to give value of x
    // for (int a : arr) {
    // result += a;
    // }
    // return x;
    // }

    static int sum(int... arr) {
        // //** available as int[] arr
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        // System.out.println("the sum of 5 is: " +sum(5,0));
        System.out.println("the sum of nothing is " + sum()); // return 0
        System.out.println("the sum of 3 and 5 is: " + sum(3, 5));
        System.out.println("the sum of 5,6,7 is: " + sum(5, 6, 7));
        System.out.println("the sum of 5,6,7 and 8 is: " + sum(5, 6, 7, 8));

    }
}
