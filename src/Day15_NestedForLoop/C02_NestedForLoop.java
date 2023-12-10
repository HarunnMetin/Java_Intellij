package Day15_NestedForLoop;

import java.util.Scanner;

public class C02_NestedForLoop {

    public static void main(String[] args) {
        /*
        kullanicidan iki rakam alin ilk rakam satir ikinci rakam sutun olmak uzere assagidaki sekli cizdirin

        *  *  *  *
        *  *  *  *
        *  *  *  *
        *  *  *  *

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen iki rakami giriniz");
        int ilkRakam = scanner.nextInt();
        int ikinciRakam = scanner.nextInt();

        for (int i = 1; i <=ilkRakam ; i++) {
            for (int j = 1; j <=ikinciRakam ; j++) {
                System.out.print("*" + "  ");
            }
            System.out.println("");
        }
    }
}
