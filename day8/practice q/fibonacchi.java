// to print nth number of fibonacci series
public class fibonacchi {
    static int fibo(int n) {
        /*
         * if (n == 1){
         * return 0;
         * } else if (n == 2) {
         * return 1;
         * }
         */
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        // fibonacci series = 0,1,1,2,3,5,8,13,21,34
        int result = fibo(5); // 3
        System.out.println("the nth number of fibonacci series is: " + result);
    }

}
