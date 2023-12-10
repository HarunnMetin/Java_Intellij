package Day26_ForEachLoop_Constructor;

public class C05_Runner {

    public static void main(String[] args) {

        C04 obje = new C04();
        obje.hız = 54;
        System.out.println(obje.hız);
        System.out.println(obje.sayi);
        System.out.println(obje.kapasite);
        obje.ogrenciIsmi = "Java";
        System.out.println(obje.ogrenciIsmi);
        obje.method1();
    }
}

