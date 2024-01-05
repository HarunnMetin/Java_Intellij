package Day41_Exceptions;

public class C05_ThrowKeyword {

    public static void main(String[] args) {

        int sayti = 17;

        try {
            if (sayti % 2 == 0){

                throw new  ArithmeticException();
            }
            System.out.println("kod satiri 1");
            System.out.println("kod satiri 2");
            System.out.println("kod satiri 3");

        }catch (ArithmeticException e){
            System.out.println("sayicift oldugundan 3 kod satiri atlandi");
        }


        System.out.println("kod satiri 4");
        System.out.println("kod satiri 5");
    }
}
