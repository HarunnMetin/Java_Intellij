package Day06_ConcetanationVeOperatorler;

public class C01_Concetanation {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Candır";
        String s3 = " ";
        String s4 = "";
        int a = 3;
        int b = 5;

        //Java35
        System.out.println(s1+a+b);
        //Java15
        System.out.println(s1 + a*b);
        //8Candır
        System.out.println((a+b)+s2);
        //53Java
        System.out.println(b+(a+s1));
        //35 Java
        System.out.println(a +s4 +b + s3 + s1);
    }
}
