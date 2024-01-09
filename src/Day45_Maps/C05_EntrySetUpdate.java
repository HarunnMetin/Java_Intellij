package Day45_Maps;

import Day44_Maps.MethodDeposu;

import java.util.Map;
import java.util.Set;

public class C05_EntrySetUpdate {

    public static void main(String[] args) {


        //ogrenci map'indeki soyisimleri buyuk harfolarak duzeltin

        Map<Integer,String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

        Set<Map.Entry<Integer,String>> ogreciEntrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> eachEntry : ogreciEntrySeti) {

            String eachValue = eachEntry.getValue();
            String[] valueArr = eachValue.split("-");

            valueArr[1] = valueArr[1].toUpperCase();

            String yeniValue = valueArr[0] +"-"+valueArr[1] +"-"+valueArr[2] +"-"+valueArr[3] +"-"+valueArr[4];
            eachEntry.setValue(yeniValue);

        }
        System.out.println(ogrenciMap);



    }
}
