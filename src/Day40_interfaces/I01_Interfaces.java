package Day40_interfaces;

public interface I01_Interfaces {

    void method1();
    abstract int method2();
    public String method3();
    public String method4();
    public double method5();

    public static void body(){

    }

    public default int body2(){
        return 0;
    }
    public static double body3(){

        return 2.3;
    }

    public static void main(String[] args) {


        System.out.println(C01_ChildOfInterfaces.sayi4);
        System.out.println(C01_ChildOfInterfaces.sayi8);
        System.out.println(C01_ChildOfInterfaces.sayi1);

    }
}
