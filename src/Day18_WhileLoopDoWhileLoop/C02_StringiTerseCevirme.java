package Day18_WhileLoopDoWhileLoop;

public class C02_StringiTerseCevirme {

    public static void main(String[] args) {

        //While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
        //donduren bir method olusturun.

        System.out.println(metinTerseCevirme("harun"));

    }


    public static String metinTerseCevirme(String metin){

        String tersMetin = "";

        int index = metin.length()-1;

        while (index >= 0){
            tersMetin += metin.charAt(index);
            index--;
        }
        return tersMetin;

    }
}
