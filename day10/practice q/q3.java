// create a class square to find area and parameter 
class square_q3 {

    int side;

    public int area() {
        return side * side;
    }

    public int parameter() {
        return 4 * side;

    }
}

public class q3 {
    public static void main(String[] args) {
        square_q3 sq = new square_q3();
        sq.side = 6;
        System.out.println("area of square is: " + sq.area());
        System.out.println("parameter of square is: " + sq.parameter());

    }

}
