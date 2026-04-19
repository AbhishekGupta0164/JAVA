
import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(40);
        l2.add(80);
        l2.add(90);

        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        l1.add(3);
        l1.add(0, 1);
        l1.add(0, 90); // add element at idx 0
        l1.addAll(0, l2); // add all elements of l2 to list l1
        l1.set(2, 444);
        l1.addFirst(555);
        l1.addLast(439);
        System.out.println(l1.contains(900)); // check's whether the element exist in list or not
        System.out.println(l1.indexOf(7)); // idx of element

        // l1.clear(); // clear all elements from list

        for (int i = 0; i < l1.size(); i++) { // print all elements
            System.out.print(l1.get(i));
            System.out.print(" , ");
        }

    }
}
