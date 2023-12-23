package Day32_StringBuilderVeAccesModifier;

public class C06_Runner {

    public static void main(String[] args) {

        C05 obj = new C05();

        obj.protectedSayi = 45;
        System.out.println(obj.protectedSayi);
        System.out.println(obj.publicSayi);
        obj.defaultSayi = 41;
        System.out.println(obj.defaultSayi);

    }
}
