package Day27_ParametreliConstructor_CobstructorCall;

public class C02_HastaneRunner {

    public static void main(String[] args) {

        C01_Hastane personel1 = new C01_Hastane();

        System.out.println(personel1.personelIsmi);
        System.out.println(personel1.personelTelefonu);
        System.out.println(personel1.hastaneAdi);
        System.out.println(personel1.hastaneTelefonu);

        personel1.personelTelefonu = "024204240";
        personel1.personelIsmi = "Ahmet";
        System.out.println(personel1.personelIsmi);

        C01_Hastane personel2 = new C01_Hastane();
        

    }
}
