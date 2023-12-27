package Day34_Inheritance;

public class HRunner {

    public static void main(String[] args) {

        GAvciKuslar avciKuslar = new GAvciKuslar();
        //Avci kuslar class'indan aldigi ozellikler
        avciKuslar.omur();
        avciKuslar.beslenme();
        avciKuslar.pence();
        avciKuslar.gaga();
        //kuslar class'inan aldigi ozellikler
        avciKuslar.kanat();
        avciKuslar.solunum();
        avciKuslar.cogalma();
        //Hayvanlar class'indan aldigi ozellikler
        avciKuslar.omur();
    }
}
