package Day29_PasByValue;

public class C03_PassByValue {

    public static void main(String[] args) {

        int sayi = 11;

        /*
        verilen sayiyi asagidaki kriterlere gore degistiren bir method olusturun

        -eger sayi cift ise 2 katina ckarin
        -eger sayi tek ise 5 ekleyin
         */
        System.out.println("method call'dan once sayi " +sayi);
        sayi = sayi(sayi);
        System.out.println("methot call'dan sonra sayi " + sayi);


    }

    public static int sayi(int sayi){

        if (sayi % 2 == 0){
            return sayi*2;
        }
        else {
            return sayi + 5;
        }

    }
}
