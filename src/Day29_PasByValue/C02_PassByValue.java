package Day29_PasByValue;

public class C02_PassByValue {

    public static void main(String[] args) {

        int sayi = 10;

        System.out.println(sayi);

        method1(4);
        method2(5);
    }
    public static void method1(int sayi){

        System.out.println("method 1'deki sayi" + sayi);
        sayi = 20;
        System.out.println("degistirilen sayi method1 " +sayi);

    }
    public static void method2(int deger){

        System.out.println("method 2'deki deger " +deger);
    }
}
