package Day13_StringManipulations_ForLoop;

public class C05_ForLoop {

    public static void main(String[] args) {

        //kullanicinin verdigi input degerinden baslayip ardisik 10 tam sayi yazdirin.

        int input = 20;
        for (int i = 20; i <input +10 ; i++) {
            System.out.print(i + " ");

        }
        System.out.println( "");
        //kullanicinin verdigi sayidan baslayin 100'e kadar 5'er 5'er arttirarak yazdirin.

        int input2 = 43;

        for (int i = input2; i <100 ; i+=5) {
            System.out.print(i + ",");
        }
        System.out.println( "");

        //100'den baslayip 1' e kadar geri geri gidin 7'nin kati olan sayilari yazdirin.

        for (int i = 100; i >=1 ; i--) {
            if (i%7==0){
                System.out.print(i +",");
            }
        }

    }
}
