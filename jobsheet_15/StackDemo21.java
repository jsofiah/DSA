import java.util.Stack;
public class StackDemo21 {
    public static void main(String[] args) {
        Book21 book1 = new Book21("1234", "Dasar Pemrograman");
        Book21 book2 = new Book21("7145", "Hafalan Shalat Delisa");
        Book21 book3 = new Book21("3562", "Muhammad Al-Fatih");

        Stack<Book21> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        Book21 temp = books.peek();
        if(temp != null){
            System.out.println(temp.toString());
        }

        Book21 temp2 = books.pop();
        if(temp != null){
            System.out.println(temp2.toString());
        }

        System.out.println("Cara 1");
        for (Book21 book : books) {
            System.out.println(book.toString());
        }

        System.out.println("Cara 2");
        System.out.println(books);

        int index = books.search(book2);
        System.out.println("Index book2 dari atas: " + index);

    }
}
