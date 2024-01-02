package Day38_AbstractClasses;

public class E_Doktor extends D_Personel{


    @Override
    public void standartMaas() {
        System.out.println("doktorlar icin maas : 120 bin tl");
    }

    @Override
    public void mesai() {
        System.out.println("mesai saatleri : 12");
    }

    @Override
    public void yillikIzin() {

        System.out.println("var");
    }

    @Override
    public void ozelSigorta() {
        System.out.println("yaptirabilir");
    }
}
