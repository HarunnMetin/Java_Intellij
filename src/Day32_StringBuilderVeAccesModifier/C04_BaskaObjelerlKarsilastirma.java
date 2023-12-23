package Day32_StringBuilderVeAccesModifier;

public class C04_BaskaObjelerlKarsilastirma {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str = "Java";

        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));

        System.out.println(sb1.compareTo(sb2));

        System.out.println(sb1.equals(str));
        System.out.println(sb1.equals(sb1));

    }
}
