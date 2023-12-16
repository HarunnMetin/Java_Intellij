package Day29_PasByValue;

public class C01_StaticBloks {

    C01_StaticBloks(){

        System.out.println("parametresiz constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
        C01_StaticBloks obj = new C01_StaticBloks();
        System.out.println("obje olusturuldu");
    }
    static {
        System.out.println("statik blok calisti");

    }
    static {
        System.out.println("statik blok iki calisti");
    }

    {
        System.out.println("statik olmayan blok calisti");
    }
}
