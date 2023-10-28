package modula;

public class Rak {
    //data
    String namaRak;
    ListBuku kumpulanBuku;

    //link
    Rak next;
    Rak prev;

    //constructor
    public Rak(String namaRak, ListBuku kumpulanBuku){
        this.namaRak=namaRak;
        this.kumpulanBuku=kumpulanBuku;
    }

}
