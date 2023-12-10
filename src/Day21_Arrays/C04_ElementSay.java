package Day21_Arrays;

public class C04_ElementSay {

    public static void main(String[] args) {

        /*
        Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        kullanildigini yazdiran bir method olusturun.
         */

        int[] arr = {3,5,5,5,5,2,3,5,6,7,1,8};
        int arananSayi = 5;
        elemnaSay(arr,3);

        
    }
    public static void elemnaSay(int[] arr , int arananSayi){
        int sayac =0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arananSayi){
                sayac++;
            }

        }
        System.out.println("aranan " + arananSayi +" sayisi " +sayac+ " kadar vardır");

    }
}
