package Day15_NestedForLoop;

public class C06_KendiSubstringimiz {

    public static void main(String[] args) {

        String str = "Java Candir";
        int baslangic = 3;
        int bitis = 7;

        /*
        verilen string baslangic ve bitis degerlerini dikkate alarak
        1- bitis degeri baslangic degerinden kucukse hata mesaji yazdirin
        2- baslangic ve bitis degerleri indek degerleri ile uyusmuyorsa hata mesaji
        3- degerler uygunsa baslangic index'inden bitis(haric) index'ine kadar
         */

        if (bitis<baslangic){
            System.out.println("HATA");
        }
        else if (baslangic<0 || bitis <0 || baslangic>=str.length() || bitis>=str.length()){
            System.out.println("INDEXLER HATALİ");
        }
        else {
            for (int i = baslangic; i <bitis ; i++) {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println("");
        System.out.println(str.substring(baslangic,bitis));
    }
}
