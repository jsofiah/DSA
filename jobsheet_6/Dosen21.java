package jobsheet_6;
public class Dosen21{
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public Dosen21(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampilInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("Kode: " + kode);
        if(jenisKelamin == true){
            System.out.println("Jenis Kelamin: Pria" );
        } else{
            System.out.println("Jenis Kelamin: Wanita" );
        }
        System.out.println("Usia: " + usia);
    }
}
