// Use throws keyword to throw an exception from a function
// if somone is using oury package so he knows that this function can throw an exception
// so he can handle it properly

class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius can not be negative";
    }

    @Override
    public String getMessage() {
        return "Radius can not be negative";
    }

}

public class hello {
    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        // fn made by me
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        // Abhi - uses divide function created by me
        try {
            // int c = divide(a = 6, b = 0);
            // System.out.println(c);
            double ar = area(6);
            System.out.println(ar);

        } catch (Exception e) {
            System.out.println("Exception");
        }

    }
}
