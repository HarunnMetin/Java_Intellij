package Day34_Inheritance;

public class DRunner {

    public static void main(String[] args) {

        //Corolla class'indaki ozellikler

        Corolla corolla = new Corolla();
        System.out.println(corolla.uretimYeri);
        System.out.println(corolla.model);
        System.out.println(corolla.aku);
        System.out.println(corolla.sanziman);

        //Toyota cllas'indaki ozellikler

        System.out.println(corolla.marka);
        System.out.println(corolla.lastik);
        System.out.println(corolla.guvelik);
        System.out.println(corolla.fren);

        //Araba cllas'indaki ozellikler

        System.out.println(corolla.yakit);
        corolla.yakit = "benzin";
        System.out.println(corolla.yakit);
        System.out.println(corolla.yil);
        System.out.println(corolla.renk);
    }
}
