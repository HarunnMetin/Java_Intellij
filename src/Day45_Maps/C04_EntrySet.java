package Day45_Maps;

import Day44_Maps.MethodDeposu;

import java.util.Map;
import java.util.Set;

public class C04_EntrySet {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

        /*
        {
        101=Ali-Can-11-H-MF,
        102=Veli-Cem-11-H-MF,
        103=Ali-Cem-11-K-TM,
        104=Ayse-Can-10-10-H-MF,
        105=Sevgi-Cem-11-M-TM,
        106=Sevgi-Can-10-K-MF,
        107=Sevgi-Can-11-K-TM,
        108=Sevgi-Can-9-K-MF,
        109=Sevgi-Can-9-K-TM
        }
         */

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti = ogrenciMap.entrySet();

        //sinif arttirma sorusunu Entryile yapalim

        for (Map.Entry<Integer,String> eachEntry : ogrenciEntrySeti) {
            System.out.println(eachEntry);

            String eachEntryValue = eachEntry.getValue();
            String[] valueArr = eachEntryValue.split("-");

            switch (valueArr[2]){
                case "9":
                    valueArr[2] = "10";
                    break;
                case "10":
                    valueArr[2] = "11";
                    break;
                case "11":
                    valueArr[2] = "12";
                    break;
                case "12" :
                    valueArr[2] = "Mezun";
                    break;
                default:

            }
            String yeniValue = valueArr[0] +"-"+ valueArr[1] + "-" + valueArr[2] +"-"+ valueArr[3]+"-"+valueArr[4];

            eachEntry.setValue(yeniValue);
        }
        System.out.println(ogrenciMap);
    }
}
