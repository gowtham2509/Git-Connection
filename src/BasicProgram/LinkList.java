package BasicProgram;

import java.util.LinkedList;
import java.util.List;

public class LinkList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("D");
        ll.add(1, "E");
        System.out.println(ll);
        System.out.println( ll.getFirst());
        System.out.println( ll.getLast());
        System.out.println(ll.contains("A"));

    }
}
