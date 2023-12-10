package Day26_ForEachLoop_Constructor;

public class C07_Runner {

    public static void main(String[] args) {

        C04 obj;

        new C04();

        System.out.println(new C04().sayi);

        C04 obj2 = new C04();

        obj2.ogrenciIsmi = "Deniz";
        System.out.println(obj2.ogrenciIsmi);
    }
}
