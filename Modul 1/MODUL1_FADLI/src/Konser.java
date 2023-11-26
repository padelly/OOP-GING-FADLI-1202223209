public class Konser {
    // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket Price) then Create Setter and Getter
    private String Nama_band;
    private String Tanggal;
    private String Lokasi;
    private double Harga_tiket;

    public void setNama_band(String Nama_band) {
        this.Nama_band = Nama_band;
    }   

    public void setTanggal(String Tanggal) {
        this.Tanggal = Tanggal;
    }

    public void setLokasi(String Lokasi) {
        this.Lokasi = Lokasi;
    }

    public void setHarga_tiket(double Harga_tiket) {
        this.Harga_tiket = Harga_tiket;
    }

    public String getNama_Band() {
        return Nama_band;
    }

    public String getTanggal() {
        return Tanggal;
    }

    public String getLokasi() {
        return Lokasi;
    }
        
    public double getHarga_tiket() {
        return Harga_tiket;
    }         
}