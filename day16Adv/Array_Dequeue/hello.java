
import java.util.ArrayDeque;

public class hello {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(4);
        ad1.add(5);
        ad1.addFirst(42);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

    }
}
