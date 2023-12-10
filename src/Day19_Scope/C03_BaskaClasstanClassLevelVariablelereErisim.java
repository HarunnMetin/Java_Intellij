package Day19_Scope;

public class C03_BaskaClasstanClassLevelVariablelereErisim {
    public static void main(String[] args) {


        System.out.println(C02_ClassLevelVariableler.bls);
        System.out.println(C02_ClassLevelVariableler.chrs);
        System.out.println(C02_ClassLevelVariableler.sayis);

        C02_ClassLevelVariableler obj = new C02_ClassLevelVariableler();

        System.out.println(obj.sayii);
        System.out.println(obj.chri);
        System.out.println(obj.stri);
        System.out.println(obj.bli);

        System.out.println(obj.sayii);


    }
}
