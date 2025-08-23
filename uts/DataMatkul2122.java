package uts;
public class DataMatkul2122 {
    MataKuliah2122[] dataMatkul;
    int idx;
    public DataMatkul2122(int kapasitas){
        dataMatkul = new MataKuliah2122[kapasitas];
        idx = 0;
    }

    void tambahMK (MataKuliah2122 mk){
        if(idx < dataMatkul.length){
            dataMatkul[idx] = mk;
            idx++;
        } else{
            System.out.println("Data sudah penuh");
        }
    }
    void tampilMK(){
        for (int i = 0; i < idx; i++) {
            dataMatkul[i].tampilMataKuliah();
        }
    }
}
