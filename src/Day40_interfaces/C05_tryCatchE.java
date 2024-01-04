package Day40_interfaces;

public class C05_tryCatchE {

    public static void main(String[] args) {

        int a = 20;
        int b = 0;

        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){

            //e.printStackTrace();
            //System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }


}
