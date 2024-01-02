package Day38_AbstractClasses;

public abstract class F_Hemsire extends E_Doktor{


    public abstract void sertifika();
    public abstract void nobet();

    @Override
    public void standartMaas() {
        System.out.println("hemsire maasi : 100 bin tl");
    }

    @Override
    public void mesai() {

        System.out.println("tum hemsireler 8 saat mesai yapar");
    }

    @Override
    public void yillikIzin() {

        System.out.println("var");
    }
}
