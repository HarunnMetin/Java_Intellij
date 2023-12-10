package Day26_ForEachLoop_Constructor;

public class C09_Runner {

    public static void main(String[] args) {

        C08_Car car1 = new C08_Car();

        System.out.println(car1.marka);
        System.out.println(car1.model);

        System.out.print(car1);

        car1.marka = "Lamborghini";
        car1.model = "Avendator";
        car1.fiyat = 1120000;
        car1.yil = 2020;
        car1.renk = "SARI-YESİL";

        System.out.println(car1);
        System.out.println("******************");

        C08_Car car2 = new C08_Car();
        System.out.println(car2);

        car2.renk = "SIYAH-BEYAZ";
        car2.model = "Bugatti";
        car2.marka = "Chiron";
        car2.yil = 2023;
        car2.fiyat = 2500000;

        System.out.println(car2);
    }



}
