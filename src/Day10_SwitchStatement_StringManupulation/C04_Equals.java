package Day10_SwitchStatement_StringManupulation;

public class C04_Equals {

    public static void main(String[] args) {

        String str1 ="Mehmet";
        String str2 ="MEHMET";

        String str3 ="Mehmet";
        String str4 ="MEHmet";

        System.out.println(str1 == str2);
        System.out.println(str3 == str4.toLowerCase());
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str4.toUpperCase()));
    }
}
