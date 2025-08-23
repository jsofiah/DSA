import java.util.ArrayList;
import java.util.Collections;
public class Sorting21 {
    public static void main(String[] args) {
        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");
        Collections.sort(daftarSiswa);

        System.out.println("Cara 1");
        System.out.println(daftarSiswa);

        System.out.println("Cara 2");
        ArrayList<Customer21> customers = new ArrayList<>();
        Customer21 customer1 = new Customer21(1, "Zaskia");
        Customer21 customer2 = new Customer21(5, "Budi");
        customers.add(customer1);
        customers.add(customer2);
        customers.add(new Customer21(4, "Cica"));
        customers.add(2, new Customer21(100, "Rosa"));

        customers.sort((c1, c2)->c1.name.compareTo(c2.name));
        System.out.println(customers);
    }
}
