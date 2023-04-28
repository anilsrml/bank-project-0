public class VadesizHesap extends BankaHesap{

    String hesapTuru;
    double vadesizBakiye;

    public VadesizHesap(long iban, double toplamBakiye, String hesapBilgisi, String hesapTuru, double vadesizBakiye) {
        super(iban, toplamBakiye, hesapBilgisi);
        this.hesapTuru = hesapTuru;
        this.vadesizBakiye = vadesizBakiye;
    }

    public double paraTransfer(String hesapTuru,long iban,double vadesizBakiye,int islemiktari){


        return 4;
    }

    public double krediKartBorcOdeme(double vadesizBakiye,KrediKarti guncelBorc){


        return 4 ;
    }

    public double krediOdeme(int krediID,Krediler krediMiktari,Krediler taksitMiktari){


        return 4 ;
    }


}
