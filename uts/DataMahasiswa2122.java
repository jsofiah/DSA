package uts;
public class DataMahasiswa2122 {
    Mahasiswa2122[] dataMahasiswa;
    int idx;
    
    public DataMahasiswa2122(int kapasitas) {
        dataMahasiswa = new Mahasiswa2122[kapasitas];
        idx = 0;
    }

    void tambah (Mahasiswa2122 m){
        if(idx < dataMahasiswa.length){
            dataMahasiswa[idx] = m;
            idx++;
        } else{
            System.out.println("Data sudah penuh");
        }
    }
    void tampil(){
        for (int i = 0; i < idx; i++) {
            dataMahasiswa[i].tampilMahasiswa();
        }
    }
    
}
