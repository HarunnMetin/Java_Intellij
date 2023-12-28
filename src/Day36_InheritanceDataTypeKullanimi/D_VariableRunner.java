package Day36_InheritanceDataTypeKullanimi;

public class D_VariableRunner {

    public static void main(String[] args) {

        C_AvciKuslar avciKusKartal = new C_AvciKuslar();
        System.out.println(avciKusKartal.hareket);
        System.out.println(avciKusKartal.beslenme);
        System.out.println(avciKusKartal.pence);
        System.out.println(avciKusKartal.gaga);
        System.out.println(avciKusKartal.kanat);
        System.out.println(avciKusKartal.solunum);
        System.out.println(avciKusKartal.cogalma);
        System.out.println(avciKusKartal.omur);

        B_Kuslar bKusKartal = new C_AvciKuslar();

        System.out.println(bKusKartal.hareket);
        System.out.println(bKusKartal.beslenme);
        //System.out.println(bKusKartal.pence);// B veya E de olmadigi icin CTE verir
        System.out.println(bKusKartal.gaga);
        System.out.println(bKusKartal.kanat);
        System.out.println(bKusKartal.solunum);
        System.out.println(bKusKartal.cogalma);
        System.out.println(bKusKartal.omur);

        A_Hayvan aHayvanKartal = new A_Hayvan();

        System.out.println(aHayvanKartal.hareket);
        System.out.println(aHayvanKartal.beslenme);
        // System.out.println(aHayvanKartal.pence); //A da olmadigi icin CTE verir
        // System.out.println(aHayvanKartal.gaga); //A da olmadigi icin CTE verir
        // System.out.println(aHayvanKartal.kanat); //A da olmadigi icin CTE verir
        System.out.println(aHayvanKartal.solunum);
        System.out.println(aHayvanKartal.cogalma);
        System.out.println(aHayvanKartal.omur);
    }
}
