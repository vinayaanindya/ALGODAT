package modula;

public class Buku {
    //data
    String namaBuku;             
    String penulisBuku;
    String bahasa;
    int jumlahHalaman;
    double ratingBuku;
    String kategoriBuku;

    //link
    Buku next;
    Buku prev;

    //constructor
    public Buku(String namaBuku, String penulisBuku, String bahasa, int jumlahHalaman, double ratingBuku, String kategoriBuku){
        this.namaBuku=namaBuku;
        this.penulisBuku=penulisBuku;
        this.bahasa=bahasa;
        this.jumlahHalaman=jumlahHalaman;
        this.ratingBuku=ratingBuku;
        this.kategoriBuku=kategoriBuku;
    }
    

}
