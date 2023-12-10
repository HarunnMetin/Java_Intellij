package Day13_StringManipulations_ForLoop;

public class C04_ReplaceFirst {

    public static void main(String[] args) {

        String str = "Java Candir, kendisini cok seviyoruz12345.";

        //sadece ilk a yi buyuk A yapin.

        str = str.replaceFirst("a","A");
        System.out.println(str);

        //İLK SPACEYİ İKİ SPACE HALİNE GETİRİN.

        str = str.replaceFirst(" ", "   ");
        System.out.println(str);

        //ilk sayiyi space haline donusturun.

        System.out.println(str.replaceFirst("\\d"," "));

        //ilk ozel karakteri yildiz olarak degistirin.

        System.out.println(str.replaceFirst("\\W","*"));
    }
}
