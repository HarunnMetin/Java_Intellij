package Day23_MultiDimensionalArrays;

public class C01_TumElementleriniTopla {

    public static void main(String[] args) {

        int[] arrTek = {3,7,1,9};
        //bu array'in tum elementlerini toplayin

        int toplam = 0;
        for (int i = 0; i < arrTek.length; i++) {

            toplam += arrTek[i];
        }
        System.out.println(toplam);

        toplam = 0;
        int[][] sayilar = {{1,2,3},{3,2},{1,1,1},{3,5},{3}};

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j <sayilar[i].length ; j++) {
                toplam += sayilar[i][j];
            }
        }
        System.out.println(toplam);


    }
}
