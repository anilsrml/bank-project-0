import java.util.ArrayList;

public class BankaPersonel extends Kisi{

        private int personelID;
        private ArrayList<Musteri> musteriler = new ArrayList<Musteri>();

        public BankaPersonel(String ad, String soyad, String email, int tcKimlikNo, int personelID, ArrayList musteriler) {
            super(ad, soyad, email, tcKimlikNo);
            this.personelID = personelID;
            this.musteriler = musteriler;
        }

    }
