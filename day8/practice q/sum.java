// question 3 - to print sum of n natural number using recursion

// sum(n) =1+2+3+....+n
// sum(n) =1+2+3+....+n-1+n 
// sum(n) = sum(n-1) +n

// sum(3) = 3 + sum(2)
// sum(3) = 3+2+sum(1)
// sum(3) = 3+2+1
public class sum {
    static int sumRec(int n) {
        // base condition
        if (n == 1) {
            return 1;
        }
        return n + sumRec(n - 1);
    }

    public static void main(String[] args) {
        int c = sumRec(5);
        System.out.println("the sum of n natural number is: " + sumRec(c));
    }
}
