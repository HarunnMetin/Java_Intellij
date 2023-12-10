package Day27_ParametreliConstructor_CobstructorCall;

public class C03_Araba {

    String marka = "marka belirtilmemis";
    String model= "model belirtilmemis";
    int yil = 1900;
    int fiyat;
    String renk = "renk belirtilmemis";

    C03_Araba(String mrk,int fiyat,String rnk,String mdl,int yil){

    }
    C03_Araba(){

    }


    public String toString() {
        return "C03_Araba{" +
                "\nmarka='" + marka + '\'' +
                "\nmodel='" + model + '\'' +
                "\nyil=" + yil +
                "\nfiyat=" + fiyat +
                "\nrenk='" + renk + '\'' +
                '}';
    }
}
