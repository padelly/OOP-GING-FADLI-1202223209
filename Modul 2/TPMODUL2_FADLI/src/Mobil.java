public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang, int jumlahPintu){
        super(nomorIdentifikasi, kecepatanMaksimum, kapasitasPenumpang);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public String toString(){
        double waktuTempuh = hitungWaktuTempuh(300);
        return  super.toString() + "\n" +
                "Jumlah Pintu                   : " + jumlahPintu +
                "\n\nWaktu Tempuh Dengan Mobil      : " + waktuTempuh ;
    }
}
