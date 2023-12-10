package Day26_ForEachLoop_Constructor;

public class C01_EnBuyukElementiBulma {

    public static void main(String[] args) {

        //arrayin elementlerinden en buyuk olani bulma

        int[] arr = {3,45,34,23,12,21,7,3,1,2,3,4,5,4,23,4,5,45,};

        int enBuyukElement = arr[0];

        for (int each: arr) {

            if (each >enBuyukElement){
                enBuyukElement = each;

            }
        }
        System.out.println(enBuyukElement);
    }
}
