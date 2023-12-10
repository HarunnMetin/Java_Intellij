package Day15_NestedForLoop;

public class C05_NestedForLoop {

    public static void main(String[] args) {

        int satir = 5;
        int sutun = 7;

        //dikdortgen biciminde satir ve sutun numaralarini yazdirin

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=sutun ; j++) {
                System.out.print(i + "," + j + "  ");
            }
            System.out.println("");
        }

        //ucgen icin satir ve sutun numaralarini yazdiralim

        System.out.println("****************************");

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i +","+ j + "  ");
            }
            System.out.println("");
        }
    }
}
