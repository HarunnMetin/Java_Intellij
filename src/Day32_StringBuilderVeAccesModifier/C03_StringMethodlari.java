package Day32_StringBuilderVeAccesModifier;

public class C03_StringMethodlari {

    public static void main(String[] args) {

        String str = "Java Candir";

        StringBuilder sb1 = new  StringBuilder();

        sb1 = new StringBuilder(str);
        System.out.println(sb1);

        System.out.println(sb1.substring(0, 4));
        System.out.println(sb1);

        System.out.println(sb1.toString().contains("J"));
        System.out.println(sb1);
    }
}
