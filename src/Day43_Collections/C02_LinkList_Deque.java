package Day43_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkList_Deque {

    public static void main(String[] args) {

        Deque<String> isimler = new LinkedList<>();

        isimler.add("cemil");
        isimler.addFirst("hayri");
        isimler.addLast("last");
        isimler.add("nuh");
        isimler.addLast("hayri");
        isimler.add("eyub");
        isimler.add("kaan");

        System.out.println(isimler.hashCode());
        System.out.println(isimler.pollFirst());
        System.out.println(isimler.pop());
        System.out.println(isimler.offerFirst("bugra"));
        System.out.println(isimler.peekFirst());
        System.out.println(isimler.element());
        System.out.println("silmeden once isimler listesi :" +isimler);
        System.out.println(isimler.size());
        isimler.clear();
        System.out.println(isimler.hashCode());
        System.out.println("***********************************");
        isimler.add("hatice");
        System.out.println(isimler.hashCode());

        //System.out.println(isimler.removeLast());

        //System.out.println(isimler.removeLastOccurrence("hayri"));
        //isimler.removeFirst();
        //isimler.removeAll(isimler);
        System.out.println(isimler);
    }
}
