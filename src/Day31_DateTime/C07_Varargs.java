package Day31_DateTime;

public class C07_Varargs {

    public static void main(String[] args) {

        islemYap(2,3,4,5,3,5,43,4,24,4);
        islemYap(1,2,3);
        islemYap(2,3);

    }
    public static void islemYap(int sayi1 , int sayi2, int... kalanlar){

        System.out.println(kalanlar.length);

    }
}
