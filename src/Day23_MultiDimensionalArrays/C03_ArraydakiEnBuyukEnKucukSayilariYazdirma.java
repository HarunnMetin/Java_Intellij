package Day23_MultiDimensionalArrays;

public class C03_ArraydakiEnBuyukEnKucukSayilariYazdirma {

    public static void main(String[] args) {

        //verilen 2 katli bir arraydaki en buyuk  ve en kucuk sayiyi bulup yazdiran
        //bir method olusturun

        int[][] arr = {{9,6,8},{2,5,9},{5,3},{12,23,322}};
        enBuyukEnKucuk(arr);
    }

    public static void enBuyukEnKucuk(int[][] arr){

        int enKucukSayi = arr[0][0];
        int enBuyukSayi = arr[0][0];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] < enKucukSayi){
                    enKucukSayi = arr[i][j];
                }
                if (arr[i][j] > enBuyukSayi) {
                    enBuyukSayi = arr[i][j];
                }
            }
        }
        System.out.println("en buyuk sayi :" + enBuyukSayi + "\nen kucuk sayi :" + enKucukSayi);

    }
}
