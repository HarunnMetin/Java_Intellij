package Day46_NestedMaps;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class C03_NestedMaps {

    public static void main(String[] args) {

        List<Object> pool = new ArrayList<>();
        pool.add(22);
        pool.add(22+"34");
        pool.add("list");
        pool.add(3.4f);
        pool.add(3.7);
        pool.add(new int[6]);
        pool.add(new ArrayList<String>());

        System.out.println(pool);

        System.out.println((Integer)pool.get(0) * 2);

        System.out.println(((String)pool.get(2)).substring(3));
    }
}
