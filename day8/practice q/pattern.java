// question 2 -  to print a pattern 
public class pattern {
    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern2(int m) {
        for (int x = 0; x < m - 1; x++) {
            for (int y = x; y < m; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1(8);
        pattern2(7);
    }

}
