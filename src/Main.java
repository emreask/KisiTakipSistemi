import java.util.Scanner;

/**
 * Örnek Proje: Kişi Takip Sistemi
 * <p>
 * Amaç: Ülkedeki tüm kişileri kaydetmek ve bu kişilerin bilgilerini saklamak için
 * bir sınıf oluşturun.
 * <p>
 * Sınıf İçeriği:
 * - Kişinin adı
 * - Kişinin soyadı
 * - Kişinin yaşı
 * - Kişinin telefon numarası
 * - Kişinin e-posta adresi
 * <p>
 * Sınıf Methodları:
 * - Kişi bilgilerini eklemek
 * - Kişi bilgilerini güncellemek
 * - Kişi bilgilerini silmek
 * - Kişi bilgilerini listelemek
 * - Belirli bir kişinin bilgilerini görüntülemek
 * <p>
 * Bu projede, `Person` adında bir sınıf oluşturun ve bu sınıfı kullanarak
 * tüm kişileri kaydedin ve bu kişilerin bilgilerini saklayın. Ayrıca,
 * yukarıdaki methodları kullanarak kişilerin bilgilerini ekleyin, güncelleyin,silin ve
 * listeleyin. Son olarak, belirli bir kişinin bilgilerini görüntülemek için bir method yazın.
 */


public class Main {
    public static void main(String[] args) {

        personelisleri();

    }

    public static void personelisleri() {
        PersonTracker personTracker = new PersonTracker();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Yapmak istediğiniz İşlemi seçiniz  ");
            System.out.println("Kişi eklemek için = E");
            System.out.println("Kişi Çıkarmak için = C ");
            System.out.println("Kişi Güncellemek için = G");
            System.out.println("Kişileri Listelemek için = L ");
            System.out.print("Tek bir Kişinin bilgileri gormek için = T 'yi giriniz : ");
            String secim = sc.nextLine();
            if (secim.toLowerCase().equals("e")) {
                System.out.print("Vatandaslik numarası : ");
                String vatandaslikNumarasi = sc.nextLine();

                System.out.print("Adı soyadı : ");
                String adiSoyadi = sc.nextLine();
                System.out.print("yaşı :");
                int yasi = sc.nextInt();
                System.out.print("Telefon numarası : ");
                int telefonNumarasi = sc.nextInt();
                System.out.print("e-posta adresi : ");
                String epostaAdres = sc.nextLine();
                String epostaAdresi = sc.nextLine();
                personTracker.addKisi(new Person(vatandaslikNumarasi,
                        adiSoyadi, yasi, telefonNumarasi, epostaAdresi));

            } else if (secim.toLowerCase().equals("c")) {
                System.out.print("Çıkarmak istediğiniz vatandaşın numarasını giriniz : ");
                String vatandaslikNumarasi = sc.nextLine();
                personTracker.removeKisi(vatandaslikNumarasi);

            } else if (secim.toLowerCase().equals("g")) {
                System.out.print("guncellemek istediğiniz vatandaşın vatandaslık numarasını giriniz : ");
                String vatandaslikNumarasi = sc.nextLine();
                personTracker.kisiBilgileriniGuncelle(vatandaslikNumarasi);
            } else if (secim.toLowerCase().equals("l")) {
                personTracker.personListesiniGoster();

            } else if (secim.toLowerCase().equals("t")) {
                System.out.println("gormek istediğiniz kişinin vatandaslık numarasını giriniz");
                String vatandaslikNumarasi = sc.nextLine();
                personTracker.tekBirKisininBilgileri(vatandaslikNumarasi);

            } else System.out.println("geçersiz işlem");


        }
    }
}