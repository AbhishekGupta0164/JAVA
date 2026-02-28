public class method_over {
    static void type1() {
        System.out.println("good monkey bhai");
    }

    static void type2(int a) {
        System.out.println("good monkey " + a + " bhai");
    }

    static void type3(int x, int y) {
        System.out.println("good monkey " + x + " bhai " + y);
    }

    static void change(int a) {
        a = 89;
    }

    static void change2(int[] arr) {
        arr[0] = 73;
    }

    static void tellme() {
        System.out.println(" hi rana \n " + " how are you ?");

    }

    public static void main(String[] args) {
        // tellme();

        // case 1 changing the integer
        // int x = 45;
        // change(x);
        // System.out.println("the value of x " + x);

        // case 2 changing the array
        int[] marks = { 51, 51, 64, 68, 95, 54 };
        change2(marks);
        System.out.println("the value of arr[0] is: " + marks[0]);

        // method overloading
        type1();
        type2(45);
        type3(241, 4144); // arguments are actual
    }

}
