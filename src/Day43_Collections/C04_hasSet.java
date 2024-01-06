package Day43_Collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class C04_hasSet {

    public static void main(String[] args) {

        /*
        Bir HashSet ve TreeSet olusturun.
        Bir loop ile bu set’lere element
        ekleyip sureleri karsilastirin.

         */

        HashSet<Integer> hashSet = new HashSet<>();

        TreeSet<Integer> treeSet = new TreeSet<>();

        Random random= new Random();

        int hasBas = LocalTime.now().getNano();

        for (int i = 1; i <= 1000; i++) {
            hashSet.add(random.nextInt(1000));
        }
        int hasBit = LocalTime.now().getNano();

        System.out.println("hashSet suresi :" + (hasBit - hasBas));
        System.out.println(hashSet);

        int treeBas = LocalTime.now().getNano();

        for (int i = 1; i <= 1000; i++) {
            treeSet.add(random.nextInt(1000));
        }
        int treeBit = LocalTime.now().getNano();

        System.out.println("treeSet suresi :" + (treeBit - treeBas));
        System.out.println(treeSet);



    }
}
