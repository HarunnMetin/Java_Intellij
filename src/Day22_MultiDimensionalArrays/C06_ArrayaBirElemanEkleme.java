package Day22_MultiDimensionalArrays;

import java.util.Arrays;

public class C06_ArrayaBirElemanEkleme {

    public static void main(String[] args) {

        //verilen bir arrayin uzunlugunu bir artirarak verilen bir elementi ekleyin.

        int[] arr = {3,7,8};
        int eklenecekSayi = 10;


        //1-uzunlugu eski arraydan bir fazla olan yeniArr olusturalim

        int[] yeniArr = new int[arr.length+1];

        //arr'daki varolan elementleri , ayni indexlerle yeniArr'ye kopyalayalim

        for (int i = 0; i < arr.length; i++) {
            yeniArr[i] = arr[i];
        }

        //eklenecek elementi yeniArr'nin son indexine atayalim

        yeniArr[yeniArr.length-1] =eklenecekSayi;
        System.out.println(Arrays.toString(yeniArr));

        arr = yeniArr;
        System.out.println(Arrays.toString(arr));


    }
}
