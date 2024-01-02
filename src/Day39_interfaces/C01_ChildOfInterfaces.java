package Day39_interfaces;

import Day36_InheritanceDataTypeKullanimi.A_Hayvan;

public class C01_ChildOfInterfaces extends A_Hayvan implements I02_Interfaces {


    @Override
    public int method11() {
        return 0;
    }

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    public static void main(String[] args) {

        System.out.println(sayi4);
        System.out.println(sayi1);
        System.out.println(sayi8);
        System.out.println(I02_Interfaces.sayi1);
        System.out.println(I02_Interfaces.sayi4);
        System.out.println(I02_Interfaces.sayi8);


    }
}
