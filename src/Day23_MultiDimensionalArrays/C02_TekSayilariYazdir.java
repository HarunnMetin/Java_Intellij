package Day23_MultiDimensionalArrays;

public class C02_TekSayilariYazdir {

    public static void main(String[] args) {

        int[][] arr = {{3,6,8},{2,5,9},{1,3},{12,23,34}};
        //verilen arraydaki tek sayilari aralarinda bir bosluk birakarak yan yana yazdirin
        //en sona da toplam sayi yazdirildi deiye aciklama yazdirin

        int sayac =0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] % 2 == 1){

                    System.out.print(arr[i][j] +" ");
                    sayac++;
                }
            }
        }
        System.out.println("\ntoplam " +sayac +" adet sayi yazdirildi");

    }
}
