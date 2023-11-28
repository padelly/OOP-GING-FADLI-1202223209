public class TelUExpress extends Ekspedisi//...
{
    // TO DO: Create Protected Atribute of TelUExpress(antarInter)
    protected boolean antarInter;
    // TO DO: Create Constructor of TelUExpress
    public TelUExpress( int jumlahCabang, String pusat, double tarif, boolean antariInter){
        super(jumlahCabang, pusat, tarif);
        this.antarInter = antariInter;
    }
    // TO DO: Create 'informasi' Method to show Information
    @Override
    public void informasi(){
        if (antarInter =true){
            System.out.println("Ekspedisi TelUExpress dengan jumlah cabang" + jumlahCabang + " dan berpusat di " + pusat + " mempunyai tarif sebesar " + tarif + " perkilogram\n" +"Selain itu ekspedisi ini melayani pengantaran internasional\n");
        } else {
            System.out.println("Ekspedisi TelUExpress dengan jumlah cabang" + jumlahCabang + " dan berpusat di " + pusat + " mempunyai tarif sebesar " + tarif + " perkilogram\n" +"Selain itu tidak ekspedisi ini melayani pengantaran internasional\n");
        }
    }
    // TO DO: Create 'ambil' Method to pick up a package
    public void ambil(String tempat){
        System.out.print("TelUExpress berhasil mengambil paket dari " + tempat);
    }
    // TO DO: Create 'antar' Method to send a package
    public void antar(int resi){
        System.out.print("\nTelUExpress berhasil mengantar paket dengan nomor resi" + resi);
    }


    // TO DO: Create 'antar' Method to send two packages
    public void antar(int resi_1, int resi_2){
        System.out.print("\nTelUExpress berhasil mengantar paket dengan nomor resi " + resi_1 + " dan " + resi_2);
    }
}
