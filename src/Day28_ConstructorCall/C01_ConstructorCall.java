package Day28_ConstructorCall;

public class C01_ConstructorCall {

    C01_ConstructorCall(){

        System.out.println("parametresiz constructor calisti");
    }
    C01_ConstructorCall(String str){
        this(4);
        C01_ConstructorCall(23);
        System.out.println("string parametreli constructor calisti");
    }
    C01_ConstructorCall(int a){
        System.out.println("int parametreli constructor calisti");
    }
    static void C01_ConstructorCall(int a){
        System.out.println("int parametreli method calisti");
    }

    public static void main(String[] args) {

        C01_ConstructorCall obj1 = new  C01_ConstructorCall("merhaba");
    }
}
