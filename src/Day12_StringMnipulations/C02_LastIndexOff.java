package Day12_StringMnipulations;

public class C02_LastIndexOff {

    public static void main(String[] args) {

        String str = "Javayi ogrenecegiz, baska yolu yok";

        //a harfinin ilk kullanim indexini yazdirin

        System.out.println(str.indexOf("a"));

        //a harfinin son kullanim indexini yazdirin

        System.out.println(str.lastIndexOf("a"));
    }
}
