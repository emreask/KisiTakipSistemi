import java.util.ArrayList;
import java.util.Scanner;

/**
 * Sınıf Methodları:
 * - Kişi bilgilerini eklemek
 * - Kişi bilgilerini güncellemek
 * - Kişi bilgilerini silmek
 * - Kişi bilgilerini listelemek
 * - Belirli bir kişinin bilgilerini görüntülemek
 */


public class PersonTracker {
    private ArrayList<Person> people = new ArrayList<>();


    public ArrayList<Person> getPeople() {
        return people;
    }

    public void addKisi(Person person) {
        people.add(person);

    }

    public void removeKisi(String vatandaslikNumarasi) {

        for (int i = 0; i < people.size(); i++) {
            Person person = people.get(i);
            if (person.getVatandaslikNumarasi().equals(vatandaslikNumarasi)) {
                people.remove(i);
                break;
            }
        }
    }

    public void personListesiniGoster() {
        System.out.print("Kişi listesi = ");
        for (Person person : people) {
            System.out.println(person);
        }

    }

    public void tekBirKisininBilgileri(String vatandaslikNumarasi) {
        for (int i = 0; i < people.size(); i++) {
            Person person = people.get(i);
            if (person.getVatandaslikNumarasi().equals(vatandaslikNumarasi)) {
                System.out.println(person);
                break;
            }

        }
    }

    public void kisiBilgileriniGuncelle(String vatandaslikNumarasi) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < people.size(); i++) {
            Person person = people.get(i);
            if (person.getVatandaslikNumarasi().equals(vatandaslikNumarasi)) {
                System.out.print("Adı soyadı : ");
                String adiSoyadi = sc.nextLine();
                person.setAdSoyadi(adiSoyadi);
                System.out.print("yaşı :");
                int yasi = sc.nextInt();
                person.setYasi(yasi);
                System.out.print("Telefon numarası : ");
                int telefonNumarasi = sc.nextInt();
                person.setTelefonNumarasi(telefonNumarasi);
                System.out.print("e-posta adresi : ");
                sc.nextLine();
                String epostaAdres = sc.nextLine();
                person.setePostaadresi(epostaAdres);
                break;

            }
        }
    }
}