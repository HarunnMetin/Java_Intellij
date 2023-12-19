package Day31_DateTime;

public class C05_Varargs {

    public static void main(String[] args) {

        toplama(3,5);
        toplama(3,5,4);
        toplama(3,5,4,4,5,3);
        toplama(3,5,4,4,5);
        toplama(3,5,4,4,5,6,7,2,4,0);

    }

    public static void toplama(int... sayi){

        int toplam = 0;

        for (int i = 0; i < sayi.length; i++) {
            toplam += sayi[i];
        }

        System.out.println("verilen int sayinin toplami : " +toplam);

    }

}
