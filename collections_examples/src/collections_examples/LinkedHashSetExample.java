package collections_examples;

import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String args[]) {
        // LinkedHashSet of String Type
        LinkedHashSet<House> lhset = new LinkedHashSet<House>();

        // Adding elements to the LinkedHashSet
        lhset.add(new House(200.00, "200"));
        lhset.add(new House(400.00, "400"));
        lhset.add(new House(100.00, "100"));
        lhset.add(new House(500.00, "500"));
        lhset.add(new House(900.00, "900"));
        lhset.add(new House(50.00, "50"));
        System.out.println(lhset);

        // LinkedHashSet of Integer Type
        LinkedHashSet<Integer> lhset2 = new LinkedHashSet<Integer>();

        // Adding elements
        lhset2.add(99);
        lhset2.add(7);
        lhset2.add(0);
        lhset2.add(67);
        lhset2.add(89);
        lhset2.add(66);
        System.out.println(lhset2);
   }
}
