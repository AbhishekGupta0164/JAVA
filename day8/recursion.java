public class recursion {

    // fctorial(n) = n* n-1* ....1
    // fact 0 =1
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // static int iterative_factorial(int n) {
    // if (n == 0 || n == 1) {
    // return 1;
    // } else {
    // int product = 1;
    // for (int i = 1; i <= n; i++) {
    // product = product * i;
    // }
    // return product;
    // }
    // }

    public static void main(String[] args) {

        int n = 6;
        System.out.println("the factorial of n is: " + factorial(n));
        // System.out.println("the factorial of n is: " + iterative_factorial(n));

    }

}
