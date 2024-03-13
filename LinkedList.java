import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("sajay");
        a.add("java");
        a.add("chandigarh university");
        a.add("programming");

        int index = a.indexOf("java");
        System.out.println("index of java - " + index);

        a.remove(index);

        List<String> b = new ArrayList<>();
        b.add("object-oriented");
        b.add("programming");
        a.addAll(b);
        System.out.println("final list " + a);
    }
}
