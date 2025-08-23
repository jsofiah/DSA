package uts2;

import java.util.Scanner;
public class DosenMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataDosen21 listDosen = new DataDosen21(5);
        Dosen21 d1 = new Dosen21(2441065, "Sofiah", "sofiah@gmail.com", 2006, "Sistem Informasi");
        Dosen21 d2 = new Dosen21(2441166, "Alza", "alza@gmail.com", 2010, "Teknik Informatika");
        Dosen21 d3 = new Dosen21(2440244, "Herman", "herman@gmail.com", 2000, "Sistem Informasi");
        Dosen21 d4 = new Dosen21(2441060, "Raka", "raka@gmail.com", 2012, "Sistem Informasi");
        Dosen21 d5 = new Dosen21(2441073, "April", "april@gmail.com", 2007, "Teknik Informatika");
        listDosen.tambahData(d1);
        listDosen.tambahData(d2);
        listDosen.tambahData(d3);
        listDosen.tambahData(d4);
        listDosen.tambahData(d5);

        while (true) {
            System.out.println("===========================================");
            System.out.println("                    Menu                   ");
            System.out.println("===========================================");
            System.out.println("1. Tampil Data Dosen");
            System.out.println("2. Urutkan Dosen berdasarkan NIDN");
            System.out.println("3. Cari Data Dosen berdasarkan Nama");
            System.out.println("4. Urutkan Dosen Berdasarkan Masa Kerja");
            System.out.println("5. Keluar");
            System.out.println("===========================================");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            if(menu == 1){
                listDosen.tampilDosen();
            } else if(menu == 2){
                listDosen.isertionASC();
                listDosen.tampilDosen();
            } else if(menu == 3){
                input.nextLine();
                System.out.print("Masukkan Nama Dosen: ");
                String key = input.nextLine();
                listDosen.cariNama(key);
            } else if(menu == 4){
                listDosen.insertionDSC();
                listDosen.tampilDosen();
            } else if(menu == 5){
                break;
            } else{
                System.out.println("Menu tidak tersedia. Silakan masukkan ulang 1-5");
            }
        }
    }
}