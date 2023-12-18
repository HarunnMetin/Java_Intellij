package Day30_ImmutableClasses;

public class C01_StringPool {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = "Ja" + "va";
        String a = "Ja";
        String b = "va";
        String str5 = a+b;
        String str6 = a.concat(b);

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);
        System.out.println(str1 == str5);
        System.out.println(str1 == str6);
        System.out.println(str1 == "Java");

        System.out.println("-----------------------");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equals(str5));
        System.out.println(str1.equals(str6));
    }
}
