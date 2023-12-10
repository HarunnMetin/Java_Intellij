package Day15_NestedForLoop;

public class C01_NestedForLoop {

    public static void main(String[] args) {

        /*
        assagidaki kodu konsola yazdirin

        1  2  3  4
        2  4  6  8
        3  6  9  12
         */

        for (int i = 1; i <=4 ; i++) {
            System.out.print(i + "  ");
        }
        System.out.println("");
        for (int i = 2; i <=8 ; i+=2) {
            System.out.print(i+ "  ");
        }
        System.out.println("");
        for (int i = 3; i <=12 ; i+=3) {
            System.out.print(i+ "  ");
        }

        System.out.println("\n***********");

        for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <=4 ; j++) {
                System.out.print(i*j+"  ");
            }
            System.out.println("");
        }
    }
}
