import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bilgileri girin:");

        String ad = scan.nextLine();
        String soyad = scan.nextLine();
        String email = scan.nextLine();
        int telefonNumarasi = scan.nextInt();
        int musteriNumarasi = scan.nextInt();

        Musteri a = new Musteri (ad, soyad, email, telefonNumarasi,musteriNumarasi);

        System.out.println("Kisi bilgileri:");
        System.out.println("Ad: " + a.getAd());
        System.out.println("Soyad: " + a.getSoyad());
        System.out.println("Email: " + a.getEmail());
        System.out.println("Telefon numarasi: " + a.getTelefonNumarasi());
        System.out.println("Müşteri numarasi: " + a.getMusteriNumarasi());




    }
}

