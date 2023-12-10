package Day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_ArrayOlusturMethodu {

    public static void main(String[] args) {

        /*
        Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
        donduren bir method olusturun.
         */
        System.out.println((Arrays.toString(arrayOlusturma())));
    }
    public static int[] arrayOlusturma() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen arrayin boyutunu giriniz");
        int uzunluk = scanner.nextInt();
        int[] arr = new int[uzunluk];

        for (int i = 0; i < arr.length; i++) {
            scanner = new Scanner(System.in);

            System.out.println("lutfen arrayin icine element atamasi yapiniz");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}
