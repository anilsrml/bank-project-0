import java.util.ArrayList;

    public class Musteri extends Kisi {

        private int musteriNumarasi;
        private ArrayList<BankaHesap> hesaplar = new ArrayList<BankaHesap>();
        private ArrayList<KrediKarti> krediKartlari = new ArrayList<KrediKarti>();

        public Musteri(String ad, String soyad, String email, int telefonNumarasi, int musteriNumarasi) {
            super(ad, soyad, email, telefonNumarasi);
            this.musteriNumarasi = musteriNumarasi;
        }

        public int getMusteriNumarasi() {
            return musteriNumarasi;
        }

        public void setMusteriNumarasi(int musteriNumarasi) {
            this.musteriNumarasi = musteriNumarasi;
        }

        public void hesapEkle (int tcKimlikNo, int musteriNumarasi, String ad, String soyad){
//● Musteri sınıfındaki hesapEkle isimli metot, müşterinin açmak istediği hesap türüne göre
//(Vadeli hesap, Vadesiz hesap veya yatırım hesabı) BankaHesap sınıfının altındaki
//hesapTuru isimli değişkenden elde edilecektir. İlgili sınıftan nesneler oluşturulup
//hesaplar isimli ArrayList’te saklanacaktır.
            System.out.println("açmak istediiğiniz hesap türüne göre seçiniz ");





        }

        public void hesapSil (int tcKimlikNo,int musteriNumarasi,String ad,String soyad){
//Musteri sınıfındaki hesapSil metodu öncelikle hesabın bakiyesini kontrol etmeli, eğer
//hesap bakiyesi 0 dan büyükse “lütfen öncelikle bakiyenizi başka bir hesaba aktarınız”
//uyarısını göstermelidir. Eğer 0’a eşitse hesabı silmelidir


        }

    }

