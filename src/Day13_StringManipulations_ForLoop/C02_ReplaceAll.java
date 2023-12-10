package Day13_StringManipulations_ForLoop;

public class C02_ReplaceAll {

    public static void main(String[] args) {

        String str = "1Ja4va 8C9a2n5d1i1r";
        str = str.replace("1", "");
        System.out.println(str);
        str = str.replaceAll("\\d" , "");
        System.out.println(str);

    }
}
