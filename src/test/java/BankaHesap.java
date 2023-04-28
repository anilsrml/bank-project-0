import java.util.Date;
import java.util.Scanner;

public class BankaHesap {

    long iban;
    Date hesapAcilisTarih;
    double toplamBakiye;
    double islemMiktar;
    String hesapBilgisi;
    String hesapTuru;

    public BankaHesap(long iban, double toplamBakiye, String hesapBilgisi) {
        this.iban = iban;
        this.toplamBakiye = toplamBakiye;
        this.hesapBilgisi = hesapBilgisi;
    }


    public void hesapGoruntuleme(int musteriNumarasi, String ad, String soyad, long iban, double toplamBakiye, String hesapBilgisi) {

    }


}
