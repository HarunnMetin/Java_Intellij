package Day19_Scope;

public class C01_Scope {


    static int classLevelStatic = 12;


    public static void main(String[] args) {

        int sayiMain = 20;

        for (int i = 0; i < 10; i++) {
            int sayiFoorLoop = 5;
            sayiFoorLoop++;
            System.out.println(sayiFoorLoop);
        }

    }
    public static void staticMetod(){

        String strStaticMethod = "Java Candir";
    }

    public void staticOlmayanMethod(){

        boolean blStatikOlmayaynMethod = true;
    }
}
