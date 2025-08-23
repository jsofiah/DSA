package uas;

public class Kendaraan_21 {
    String platNomor;
    String tipe;
    String merk;

    public Kendaraan_21(String platNomor, String tipe, String merk) {
        this.platNomor = platNomor;
        this.tipe = tipe;
        this.merk = merk;
    }

    public void tampilkanInformasi(){
        System.out.println("Plat Nomor: " + platNomor);
        System.out.println("Tipe      : " + tipe);
        System.out.println("Merk      : " + merk);
        System.out.println("================================");
    }
}