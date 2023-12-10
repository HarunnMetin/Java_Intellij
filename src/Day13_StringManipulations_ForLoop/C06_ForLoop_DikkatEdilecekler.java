package Day13_StringManipulations_ForLoop;

public class C06_ForLoop_DikkatEdilecekler {

    public static void main(String[] args) {

        //kullanicinin verdigi baslangic ve bitis degerleridahil olarak bu sayilarin arasinda aranan sayiya
        //tam bolunebilen bir sayi varsa aranan sayi ile tam bolunebilen sayi var yazdirin.

        int baslangic = 201;
        int bitis = 237;

        int arananSayi =43;

        for (int i = 201; i <=237 ; i++) {
            if (i % 43 == 0) {
                System.out.println("Aranan sayi ile tam bolunebilen sayi var");
                break;

            }
        }
    }
}
