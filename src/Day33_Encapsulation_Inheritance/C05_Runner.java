package Day33_Encapsulation_Inheritance;

public class C05_Runner {

    public static void main(String[] args) {

        C04_Okul okul = new C04_Okul();

        System.out.println(okul.getOkulAdi());
        okul.setOkulAdi("java");
        System.out.println(okul.getOkulAdi());


        okul.okulAdresi = "wdcmeocmwmcwo";
        okul.okulAdi = "ADU";
        okul.ogrenciSayisi = 100;

        System.out.println(okul.getOkulAdi());
        System.out.println(okul.getOgrenciSayisi());
        System.out.println(okul.okulAdresi);

    }

}
