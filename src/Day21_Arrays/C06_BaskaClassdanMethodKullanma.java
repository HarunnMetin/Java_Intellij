package Day21_Arrays;

import Day19_Scope.C02_ClassLevelVariableler;

import java.util.Arrays;

public class C06_BaskaClassdanMethodKullanma {

    public static void main(String[] args) {

        int[] arr = {2,4,6,8};

        System.out.println(C03_PozitifElementleriTopla.pozitifElementleriTopla(arr));
        System.out.println("eski hali : " +Arrays.toString(arr));
        arr = C01_ArrayinElementleriniİtenenKadarArttirma.elementleriArttir(arr,7);

        System.out.println("eski array : " + Arrays.toString(arr));
        System.out.println(C03_PozitifElementleriTopla.pozitifElementleriTopla(arr));

        C04_ElementSay.elemnaSay(arr,2);

        int[] kullaniciArrayi = C05_ArrayOlusturMethodu.arrayOlusturma();
        System.out.println(Arrays.toString(kullaniciArrayi));


    }
}
