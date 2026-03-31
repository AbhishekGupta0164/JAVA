import java.util.ArrayList;

// we are passing classes to already defined classes 
class Generic<T1> {
    int val;
    private T1 t1;

    public Generic(int val, T1 t1) {
        this.val = val;
        this.t1 = t1;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}

public class generics {
    public static void main(String[] args) {

        ArrayList<Integer> arraylist = new ArrayList<>();

        arraylist.add(42);
        arraylist.add(32);

        int a = arraylist.get(1);
        System.out.println(a);

        Generic<String> g1 = new Generic<>(23, "string is my statement ");

        String str = g1.getT1();
        System.out.println(str);
    }
}