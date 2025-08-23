package uts;

import java.util.Scanner;
public class SiakadMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataMahasiswa2122 list = new DataMahasiswa2122(3);
        Mahasiswa2122 m1 = new Mahasiswa2122("22001", "Ali Rahman", "Informatika");
        Mahasiswa2122 m2 = new Mahasiswa2122("22002", "Budi Santoso", "Informatika");
        Mahasiswa2122 m3 = new Mahasiswa2122("22003", "Citra Dewi", "Sistem Informasi Bisnis");
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        DataMatkul2122 listMK = new DataMatkul2122(3);
        MataKuliah2122 mk1 = new MataKuliah2122("MK001", "Struktur Data", 3);
        MataKuliah2122 mk2 = new MataKuliah2122("MK002", "Basis Data", 3);
        MataKuliah2122 mk3 = new MataKuliah2122("MK003", "Desain Web", 3);
        listMK.tambahMK(mk1);
        listMK.tambahMK(mk2);
        listMK.tambahMK(mk3);
        Mahasiswa2122[] dataMhs = list.dataMahasiswa;
        MataKuliah2122[] dataMk = listMK.dataMatkul;

        DataPenilaian2122 listNilai = new DataPenilaian2122(5);
        Penilaian2122 p1 = new Penilaian2122(dataMhs[0], dataMk[0], 80, 85, 90);
        Penilaian2122 p2 = new Penilaian2122(dataMhs[0], dataMk[1], 60, 75, 70);
        Penilaian2122 p3 = new Penilaian2122(dataMhs[1], dataMk[0], 75, 70, 80);
        Penilaian2122 p4 = new Penilaian2122(dataMhs[2], dataMk[1], 85, 90, 95);
        Penilaian2122 p5 = new Penilaian2122(dataMhs[2], dataMk[2], 80, 90, 65);
        listNilai.tambahNilai(p1);
        listNilai.tambahNilai(p2);
        listNilai.tambahNilai(p3);
        listNilai.tambahNilai(p4);
        listNilai.tambahNilai(p5);


        while (true) {
            System.out.println("==============================================");
            System.out.println("            Menu Sistem Akademik              ");
            System.out.println("==============================================");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.println("==============================================");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            if(menu == 1){
                list.tampil();
            }
            else if(menu == 2){
                listMK.tampilMK();
            }
            else if(menu == 3){
                listNilai.tampil();
            }
            else if(menu == 4){
                System.out.println("Urutan Mahasiswa Berdasarkan Nilai Akhir (Tertinggi ke Terendah):");
                listNilai.insertionDSC();
                listNilai.tampil();
            }
            else if(menu == 5){
                input.nextLine(); 
                System.out.print("Masukkan NIM Mahasiswa: ");
                String cariNIM = input.nextLine();
                listNilai.cariByNIM(cariNIM);
            }
            else if(menu == 0){
                break;
            }
            else{
                break;
            }
            
            
            
        }
    }
}
