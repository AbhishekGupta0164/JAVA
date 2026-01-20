public class associativity {
    public static void main(String[] args) {

        /*
         * Precedence & Associativity
         * int a = 6 * 5 - 34 / 2;
         * // 30 - 34 / 2;
         * // 30 - 17;
         * // =13;
         * 
         * int b = 60 / 5 - 34 * 2;
         * // 12 -34 * 2;
         * // 12 - 68;
         * // -56;
         * 
         * System.out.println(a);
         * System.out.println(b);
         * 
         * // Precedence & Associativity
         * // Multiplication and division have higher precedence than addition and
         * // subtraction
         * // Left to right associativity for operators of same precedence
         */
        // Quick Quiz
        int x = 6;
        int y = 1;
        int k = x * y / 2;
        System.out.println(k);

        int a = 5;
        int b = 3;
        int c = 6;
        int m = (b * b - 4 * a * c) / (2 * a);
        System.out.println(m);

    }

}
