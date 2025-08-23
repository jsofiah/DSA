package uas;
import java.util.Scanner;

public class QueueLinkedList_21 {
    NodeKendaraan_21 head;
    NodeKendaraan_21 tail;
    int size;
    static int motor = 0, mobil = 0, lainnya = 0;

    public QueueLinkedList_21(){
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public boolean isFull(){
        return false;
    }

    public void clear(){
        if(!isEmpty()){
            head = tail = null;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void tambahData(Kendaraan_21 input){
        NodeKendaraan_21 data = new NodeKendaraan_21(input, null);
        if(isEmpty()){
            head = data;
            tail = data;
        } else {
            tail.next = data;
            tail = data;
        }
        size++;
        if(tail.data.tipe.equalsIgnoreCase("Sepeda Motor")){
            motor++;
        } else if(tail.data.tipe.equalsIgnoreCase("Mobil")){
            mobil++;
        } else{
            lainnya++;
        }
        System.out.println(">> Kendaraan masuk ke dalam antrian");
    }
    
    public void tampilkanSemua(){
        if(!isEmpty()){
            NodeKendaraan_21 tmp = head;
            System.out.println("================================");
            System.out.println("\tAntrian Kendaraan");
            System.out.println("================================");
            while (tmp != null){
                tmp.data.tampilkanInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Antrian Kendaraan masih kosong");
        }
    }

    public void sizeAntrian(){
        System.out.println(">> Jumlah kendaraan dalam antrian: " + size);
    }

    public static void layaniKendaraan(QueueLinkedList_21 antrian, QueueTransaksi_21 transaksiQueue, Scanner sc) {
        if (!antrian.isEmpty()) {
            NodeKendaraan_21 dilayani = antrian.head;
            System.out.println("Petugas melayani " + dilayani.data.platNomor);
            if(dilayani.data.tipe.equalsIgnoreCase("Sepeda Motor")){
                motor--;
            } else if(dilayani.data.tipe.equalsIgnoreCase("Mobil")){
                mobil--;
            } else{
                lainnya--;
            }
            antrian.head = antrian.head.next;
            antrian.size--;

            System.out.print("Masukkan nama BBM: ");
            String namaBBM = sc.nextLine();
            System.out.print("Masukkan harga per liter: ");
            double hargaPerLiter = sc.nextDouble();
            System.out.print("Masukkan jumlah liter: ");
            double liter = sc.nextDouble();
            sc.nextLine();

            BBM_21 bbm = new BBM_21(namaBBM, hargaPerLiter);
            TransaksiPengisian_21 transaksi = new TransaksiPengisian_21(dilayani.data, bbm, liter);
            transaksiQueue.enqueue(transaksi);

            System.out.println(">> Transaksi berhasil dicatat");
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void cariTotal(String key){
        NodeKendaraan_21 current;
        System.out.println("================================");
        System.out.println("       Jumlah Kendaraan");
        System.out.println("================================");
        if(key.equalsIgnoreCase("Sepeda Motor")){
            System.out.println("Jumlah Sepeda Motor: " + motor);
        } else if(key.equalsIgnoreCase("Mobil")){
            System.out.println("Jumlah Mobil: " + mobil);
        } else{
            System.out.println("Jumlah Kendaraan Lainnya: " + lainnya);
        }

        System.out.println("================================");
        System.out.println("        Data Kendaraan");
        System.out.println("================================");
        current = head;
        while (current != null) {
            if (current.data.tipe.equalsIgnoreCase(key)) {
                current.data.tampilkanInformasi();
            }
            current = current.next;
        }
    }
}
