/*
  Hashing - Technique to convert key value pair to --> Indices 
 */

import java.util.HashSet;

public class hello {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(3);
        myHashSet.add(2);
        myHashSet.add(87);
        myHashSet.add(7);
        System.out.println(myHashSet);
    }
}
