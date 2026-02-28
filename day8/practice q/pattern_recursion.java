
public class pattern_recursion {

    static void pattern_recursion(int n) {
        if (n > 0) {
            pattern_recursion(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // pattern_rec(3)
    // pattern_rec(2)+ 3 times star and new line
    // pattern_rec(1)+ 2 times star and new line + 3 times star and new line
    // pattern_rec(0)+ 1 times star and new line + 2 times star and new line + 3
    // times star and new line

    public static void main(String[] args) {
        pattern_recursion(5);
    }
}
