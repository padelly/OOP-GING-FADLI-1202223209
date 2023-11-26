public class Bus extends Kendaraan {
    private int jumlahKursi;

    public Bus(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang, int jumlahKursi){
        super(nomorIdentifikasi, kecepatanMaksimum, kapasitasPenumpang);
        this.jumlahKursi = jumlahKursi;
    }
    
    @Override
    public String toString(){
        double waktuTempuh = hitungWaktuTempuh(300);
        return  super.toString() + "\n" +
                "Jumlah Kursi                   : " + jumlahKursi +
                "\n\nWaktu Tempuh Dengan Bus        : " + waktuTempuh +"\n" ;
    }

}
