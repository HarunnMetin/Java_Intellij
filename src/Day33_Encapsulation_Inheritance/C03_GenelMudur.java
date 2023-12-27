package Day33_Encapsulation_Inheritance;

public class C03_GenelMudur {

    public static void main(String[] args) {


        C01_Pazarlama pazarlama = new C01_Pazarlama();
        System.out.println(pazarlama.getToplamSatis());

        pazarlama.setSatis(300);
        pazarlama.setSatis(100);
        pazarlama.setSatis(30*30);

        System.out.println(pazarlama.getToplamSatis());


    }
}
