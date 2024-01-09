package Day45_Maps;

import Day44_Maps.MethodDeposu;

import java.util.Map;
import java.util.Set;

public class C06_EntrySetUpdate {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

        //Sinif ssubesi H olan ogrencilerin subesini T yapin

        Set<Map.Entry<Integer,String>> sinifSubesiSeti = ogrenciMap.entrySet();
        System.out.println(ogrenciMap);

        for (Map.Entry<Integer,String> eachEntryValue: sinifSubesiSeti) {

            String eachValue = eachEntryValue.getValue();
            String[] eachArr = eachValue.split("-");
            //"Ali-Can-11-H-MF

            if (eachArr[3].equalsIgnoreCase("H")){

                eachArr[3] = "#";

            }
            String yeniArr = eachArr[0]+"-"+eachArr[1]+"-"+eachArr[2]+"-"+eachArr[3]+"-"+eachArr[4];

            eachEntryValue.setValue(yeniArr);

        }
        System.out.println(ogrenciMap);
    }
}
