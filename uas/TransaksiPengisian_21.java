package uas;
public class TransaksiPengisian_21 {
    Kendaraan_21 kendaraan;
    BBM_21 bbm;
    double liter;
    double totalBayar;

    public TransaksiPengisian_21(Kendaraan_21 kendaraan, BBM_21 bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        if(liter >= 10){
            this.totalBayar = (liter * bbm.hargaPerliter) - (0.10 * (liter * bbm.hargaPerliter)) ;
        } else{
            this.totalBayar = liter * bbm.hargaPerliter;
        }
    }

    public void tampilkanTransaksi() {
        System.out.println(kendaraan.platNomor + " : Rp " + totalBayar);
        System.out.println("================================");
    }
}
