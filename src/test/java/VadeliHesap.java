public class VadeliHesap extends BankaHesap {

    String hesapTuru;
    double vadeliBakiye;
    float faizOrani;

    public VadeliHesap(long iban, double toplamBakiye, String hesapBilgisi, String hesapTuru, double vadeliBakiye, float faizOrani) {
        super(iban, toplamBakiye, hesapBilgisi);
        this.hesapTuru = hesapTuru;
        this.vadeliBakiye = vadeliBakiye;
        this.faizOrani = faizOrani;
    }

    public VadeliHesap(long iban, double toplamBakiye, String hesapBilgisi, String hesapTuru) {
        super(iban, toplamBakiye, hesapBilgisi);
        this.hesapTuru = hesapTuru;


    }
}
