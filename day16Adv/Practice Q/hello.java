import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class hello {
    public static void main(String[] args) {
        // Q1 -
        ArrayList<String> ar = new ArrayList<>();
        ar.add("s1");
        ar.add("Global");
        ar.add("abhi");
        ar.add("rana");
        ar.add("dubey");
        ar.add("baderiya");
        for (Object o : ar) {
            System.out.println(o);
        }

        // Q2 - create set in java, try to store duplicate element inside this set and
        // verify that only one instance is stored
        HashSet<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(9);
        s.add(7);

        // Q3
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

        // Q3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY));

    }
}