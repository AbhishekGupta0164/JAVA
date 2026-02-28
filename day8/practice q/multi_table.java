
public class multi_table {
    static void multiplication(int n) {
        // int x = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }

    public static void main(String[] args) {
        // queston 1 print multiplication table of number n
        multiplication(4);
    }

}
