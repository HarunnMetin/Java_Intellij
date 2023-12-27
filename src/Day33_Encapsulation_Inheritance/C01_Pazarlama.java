package Day33_Encapsulation_Inheritance;

public class C01_Pazarlama {

    private int toplamSatis;
    private int satis;

    public int getToplamSatis() {
        return toplamSatis;
    }

    public void setSatis(int satis) {
        this.satis = satis;
        toplamSatisaEkle();

    }
    private void  toplamSatisaEkle(){
        toplamSatis += satis;
    }
}
