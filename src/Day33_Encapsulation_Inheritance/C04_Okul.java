package Day33_Encapsulation_Inheritance;

public class C04_Okul {

    String okulAdi = "Yildiz Koleji";
    int ogrenciSayisi = 234;
    public String okulAdresi;


    public int getOgrenciSayisi() {
        return ogrenciSayisi;
    }

    public void setOgrenciSayisi(int ogrenciSayisi) {
        this.ogrenciSayisi = ogrenciSayisi;
    }

    public String getOkulAdi() {
        return okulAdi;
    }

    public void setOkulAdi(String okulAdi) {
        this.okulAdi = okulAdi;
    }
}
