package modula;

public class Mainm {

    static ListRakBuku rakKiki = new ListRakBuku(); // Initialize the ListRakBuku
    static ListBuku bukuKiki = new ListBuku();     // Initialize the ListBuku
    Rak current;

    void addIntoRak(Buku baru, String namaRak) {
        if (rakKiki.head == null) {
            ListBuku bukuPertama = new ListBuku();
            bukuPertama.add(baru);
            rakKiki.add(namaRak, bukuPertama);
        } else {
            current = rakKiki.head;
            while (current != null) {
                if (current.namaRak.equals(namaRak)) {
                    current.kumpulanBuku.add(baru);
                    return; // No need to continue searching if we found the rack
                }
                current = current.next;
                if (current == rakKiki.head) {
                    break;
                }
            }
            // If we reach here, it means we haven't found the rack, so we need to add it
            ListBuku bukuPertama = new ListBuku();
            bukuPertama.add(baru);
            rakKiki.add(namaRak, bukuPertama);
        }
    }

    public static void main(String[] args) {
        Buku harryPotter = new Buku("Harry Potter", "uvuwewue", "Indonesia", 123, 3.4, "Science");
        bukuKiki.add(harryPotter);

        Buku asas = new Buku("asas", "assa", "osas", 0, 0, "assa");

        System.out.println("List buku kiki");
        bukuKiki.print();

        Main main = new Main(); // Create an instance of the Main class
        main.addIntoRak(asas, "Science"); // Call addIntoRak on the instance
        main.addIntoRak(harryPotter, "Fiction");

        rakKiki.print();
    }
}


