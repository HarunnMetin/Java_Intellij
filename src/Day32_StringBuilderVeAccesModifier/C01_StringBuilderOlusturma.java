package Day32_StringBuilderVeAccesModifier;

public class C01_StringBuilderOlusturma {

    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder();
        //bos bir strin builder olusturur

        System.out.println(sb1);
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        StringBuilder sb2 = new StringBuilder("Java Candir");
        System.out.println(sb2);
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        StringBuilder sb3 = new  StringBuilder(9);
        System.out.println(sb3);
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());

        sb3.append("Java Candir");
        System.out.println(sb3);
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());

        sb3.trimToSize();
        System.out.println(sb3);
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());
    }
}
