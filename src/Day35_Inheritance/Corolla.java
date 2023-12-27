package Day35_Inheritance;

public class Corolla extends BToyota {

    Corolla(){
        System.out.println("Corolla parametresiz constructor calist");
    }

    Corolla(String str){


    }

    String uretimYeri = "Tokyo / Japonya";
    String model = "Corolla";
    String aku = "Inci aku";
    String sanziman = "JHJ";

    public static void main(String[] args) {

        Corolla corolla = new Corolla();

        Corolla corolla1 = new Corolla("kirmizi");
    }
}
