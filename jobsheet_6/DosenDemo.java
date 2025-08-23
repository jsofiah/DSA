package jobsheet_6;
public class DosenDemo{
    public static void main(String[] args) {
        DataDosen21 list = new DataDosen21(10);
        Dosen21 d1 = new Dosen21("001", "Silby", false, 30);
        Dosen21 d2 = new Dosen21("002", "Devin", true, 34);
        Dosen21 d3 = new Dosen21("003", "Jeri", true, 45);
        Dosen21 d4 = new Dosen21("004", "Nici", false, 50);
        Dosen21 d5 = new Dosen21("005", "Kenan", true, 27);
        Dosen21 d6 = new Dosen21("006", "Betty", false, 60);
        Dosen21 d7 = new Dosen21("007", "Clara", false, 56);
        Dosen21 d8 = new Dosen21("008", "Jono", true, 70);
        Dosen21 d9 = new Dosen21("009", "Dono", true, 59);
        Dosen21 d10 = new Dosen21("010", "Alza", false, 40);

        list.tambah(d1);
        list.tambah(d2);
        list.tambah(d3);
        list.tambah(d4);
        list.tambah(d5);
        list.tambah(d6);
        list.tambah(d7);
        list.tambah(d8);
        list.tambah(d9);
        list.tambah(d10);

        System.out.println("Data dosen sebelum sorting: ");
        list.tampil();

        System.out.println("Data dosen setelah bubble sorting berdasarkan usia (ASC): ");
        list.bubbleASC();
        list.tampil();

        System.out.println("Data dosen setelah selection sorting berdasarkan usia (DSC): ");
        list.selectionDSC();
        list.tampil();

        System.out.println("Data dosen setelah insertion sorting berdasarkan usia (DSC): ");
        list.insertionDSC();
        list.tampil();
    }
}