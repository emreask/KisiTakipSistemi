

public class Person {
    private String vatandaslikNumarasi;
    private String adSoyadi;
    private int yasi;
    private int telefonNumarasi;
    private String ePostaadresi;


    public Person(String vatandaslikNumarasi, String adSoyadi, int yasi, int telefonNumarasi, String ePostaadresi) {
        this.vatandaslikNumarasi = vatandaslikNumarasi;
        this.adSoyadi = adSoyadi;
        this.yasi = yasi;
        this.telefonNumarasi = telefonNumarasi;
        this.ePostaadresi = ePostaadresi;

    }


    public void setVatandaslikNumarasi(String vatandaslikNumarasi) {
        this.vatandaslikNumarasi = vatandaslikNumarasi;

    }

    public String getVatandaslikNumarasi() {
        return vatandaslikNumarasi;
    }

    public String getAdSoyadi() {
        return adSoyadi;
    }

    public void setAdSoyadi(String adSoyadi) {
        this.adSoyadi = adSoyadi;
    }

    public int getYasi() {
        return yasi;
    }

    public void setYasi(int yasi) {
        this.yasi = yasi;
    }

    public int getTelefonNumarasi() {
        return telefonNumarasi;
    }

    public void setTelefonNumarasi(int telefonNumarasi) {
        this.telefonNumarasi = telefonNumarasi;
    }

    public String getePostaadresi() {
        return ePostaadresi;
    }

    public void setePostaadresi(String ePostaadresi) {
        this.ePostaadresi = ePostaadresi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "vatandaslik Numarasi='" + vatandaslikNumarasi + '\'' +
                ", Adı Soyadı='" + adSoyadi + '\'' +
                ", Yası=" + yasi +
                ", Telefon Numarası=" + telefonNumarasi +
                ", ePosta Adresi=" + ePostaadresi +
                '}';
    }
}
