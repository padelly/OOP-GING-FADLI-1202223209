public class FRIExpress extends Ekspedisi //...
{
    // TO DO: Create Protected Attribute of FRIExpress (pecahBelah)
    protected boolean pecahBelah;
    // TO DO: Create Constructor of FRIExpress
    public FRIExpress( int jumlahCabang, String pusat, double tarif, boolean pecahBelah){
        super( jumlahCabang, pusat, tarif);
        this.pecahBelah = pecahBelah;
    }
    // TO DO: Create 'informasi' Method to show Information
    @Override
    public void informasi(){
        if (pecahBelah = true){
            System.out.println("\n\nEkspedisi FRIExpress dengan jumlah cabang " + jumlahCabang + " dan berpusat di " + pusat + " mempunyai tarif sebesar " + tarif + " perkilogram\n" +"Selain itu ekspedisi ini Pecah Belah\n");
        } else {
            System.out.println("\n\nEkspedisi FRIExpress dengan jumlah cabang " + jumlahCabang + " dan berpusat di " + pusat + " mempunyai tarif sebesar " + tarif + " perkilogram\n" +"Selain itu ekspedisi  tidak ini Pecah Belah\n");
        }
        
    }
    // TO DO: Create 'terima' Method to accept a number of packages
    public void terima(int jumlahPaket){
        System.out.println("FRIExpress baru saja menerima paket yang masuk disortis sebanyak " + jumlahPaket);
    }
    // TO DO: Create 'kirim' Method to send a package to a destination
    public void kirim(String tujuan){
        System.out.printf("FRIExpress berhasil mengirim paket ke tujuan " + tujuan + "\n");
    }
    // TO DO: Create 'kirim' Method to send a package to two destinations
    public void kirim(String tujuan_1, String tujuan_2){
        System.out.printf("FRIExpress berhasil mengirim paket ke tujuan " + tujuan_1 +  " dan " + tujuan_2 + "\n");
    }
 
}
