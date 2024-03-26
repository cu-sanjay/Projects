// Playing with List
// More Functions in Exp6.java

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("Sanjay");
        a.add("Java");
        a.add("Programming");
        a.add("Chandigarh University");

        int index = a.indexOf("Java");
        System.out.println("Index of java : " + index);

        a.remove(index);

        List<String> b = new ArrayList<>();
        b.add("Object Oriented");
        b.add("Programming");
        a.addAll(b);
        System.out.println("Final list : " + a);
    }
}
