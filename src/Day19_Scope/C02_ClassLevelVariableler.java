package Day19_Scope;

public class C02_ClassLevelVariableler {

    static  boolean bls ;
    boolean bli;

    static String strs ="Java";
    String stri;

    static int sayis;
    int sayii = 23;

    static char chrs = 'a';
    char chri;

    public static void main(String[] args) {

        System.out.println(bls);
        System.out.println(strs);
        System.out.println(sayis);
        System.out.println(chrs);

        C02_ClassLevelVariableler obj= new C02_ClassLevelVariableler();

        System.out.println(obj.bli);
        System.out.println(obj.stri);
        System.out.println(obj.sayii);
        System.out.println(obj.chri);
    }
}

