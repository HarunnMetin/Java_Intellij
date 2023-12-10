package Day18_WhileLoopDoWhileLoop;

public class C07_DoWhileLoop {

    public static void main(String[] args) {

        int bas = 10;
        int bit = 20;

        /*
        while loop ile baslangic degeri ile bitis degeri arasindaki sayilari toplayip yazdirin
        (sinirlar dahil)
         */

        int toplam = 0;
        while (bas<=bit){
            toplam+=bas;
            bas++;
        }
        System.out.println(toplam);

        //do while loop ile yapalim

        bas = 10;
        bit = 20;

        toplam = 0;

        do {
            toplam+=bas;
            bas++;
        }while (bas<=bit);
        System.out.println(toplam);
    }
}
