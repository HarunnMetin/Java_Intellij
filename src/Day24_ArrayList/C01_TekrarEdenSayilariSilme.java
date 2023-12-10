package Day24_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_TekrarEdenSayilariSilme {

    public static void main(String[] args) {

        //verilen bir int arrayda tekrar eden elementleri silin arrayi
        //array'i unique degerlerden olusan haline donusturun

        int[] arr = {2,4,5,3,2,5,1,5,3,7};

        List<Integer> tekrarsizList = new ArrayList<>();
        System.out.println(tekrarsizList);

        for (int i = 0; i < arr.length; i++) {
            if (!tekrarsizList.contains(arr[i])){
                tekrarsizList.add(arr[i]);
            }
        }
        System.out.println(tekrarsizList);

        arr = new int[tekrarsizList.size()];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = tekrarsizList.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
