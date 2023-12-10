package Day23_MultiDimensionalArrays;

public class C05_SonIndextekiElementlerinToplami {

    public static void main(String[] args) {

        /*
        Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
        toplaminini yazdiran bir method olusturun.
         */

        int[][] sayilar = {{1,3,5,3},{2,5,9},{3},{4,5,0},{12,4,15}};

        sonIndextekiElementiTopla(sayilar);
    }
    public static void sonIndextekiElementiTopla(int[][]arr){

        /*

        //burada yaptiğim benim kendi cozumumdur!!!!!!!

        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = arr[i].length-1; j <= arr[i].length-1; j++) {

                toplam+= arr[i][j];
            }
        }
        System.out.println(toplam);
         */

        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {

            toplam += arr[i][arr[i].length-1];
        }
        System.out.println(toplam);



    }
}
