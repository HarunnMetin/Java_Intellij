package Day40_interfaces;

import Day39_interfaces.I01_Interfaces;
import Day39_interfaces.I02_Interfaces;

public class C01_ChildOfInterfaces implements I02_Interfaces, I01_Interfaces {

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

    @Override
    public String method4() {
        return null;
    }

    @Override
    public double method5() {
        return 0;
    }
}
