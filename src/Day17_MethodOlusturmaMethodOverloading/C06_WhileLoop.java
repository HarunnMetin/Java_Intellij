package Day17_MethodOlusturmaMethodOverloading;

public class C06_WhileLoop {

    public static void main(String[] args) {

        /*
        1'den 100'e kadar olan sayilarin (sinirlardahil)
        for loop ile hesaplayin
         */

        int toplam = 0;

        for (int i = 1; i <=2 ; i++) {
            toplam+=i;

        }
        System.out.print(toplam);

        System.out.println("");

        int toplama = 0;

        int i = 1;
        while (i<=100){
            toplama+=i;
            i++;
        }
        System.out.println("while == "+toplama);


    }
}
