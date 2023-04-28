public class YatirimHesap extends BankaHesap{

    String hesapTuru;
    String yatirimTuru;
    int yatirimBakiye;
    float kur;

    public YatirimHesap(long iban, double toplamBakiye, String hesapBilgisi, String hesapTuru, String yatirimTuru, int yatirimBakiye, float kur) {
        super(iban, toplamBakiye, hesapBilgisi);
        this.hesapTuru = hesapTuru;
        this.yatirimTuru = yatirimTuru;
        this.yatirimBakiye = yatirimBakiye;
        this.kur = kur;
    }



}
