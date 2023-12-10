package Day27_ParametreliConstructor_CobstructorCall;

public class C04_ArabaRunner {

    public static void main(String[] args) {

        C03_Araba araba1 = new C03_Araba();
        System.out.println(araba1);


        araba1.fiyat = 239239;
        araba1.marka = "Merso";
        araba1.yil = 2000;
        araba1.renk = "siyah";
        araba1.model = "E200";

        System.out.println(araba1);

        System.out.println("****************");

        C03_Araba araba2 = new C03_Araba("BMW",2324234,"KIRMIZI","A3",2010);
    }
}
