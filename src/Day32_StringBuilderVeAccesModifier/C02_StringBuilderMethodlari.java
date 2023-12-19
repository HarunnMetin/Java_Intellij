package Day32_StringBuilderVeAccesModifier;

public class C02_StringBuilderMethodlari {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java daha da guzellesiyor");
        sb1.append(" gun gectikce");
        System.out.println(sb1);
        sb1.reverse();
        System.out.println(sb1);
        sb1.reverse();
        System.out.println(sb1);


        //sondaki harfi silelim

        sb1.deleteCharAt(sb1.length()-1);
        System.out.println(sb1);

        sb1.delete(16,19);
        System.out.println(sb1);

        sb1.insert(sb1.length()-1 ,"r");
        System.out.println(sb1);

        String str = "Java da bundan memnun";
        sb1.insert(9 ,str ,4,7);
        System.out.println(sb1);
    }
}
