package modula;

//import TGS1.main;

public class ListBuku {
    Buku head;
    Buku tail;
    Buku current;

    void add(String namaBuku, String penulisBuku, String bahasa, int jumlahHalaman, double ratingBuku, String kategoriBuku){
        Buku baru = new Buku(namaBuku, penulisBuku, bahasa, jumlahHalaman, ratingBuku, kategoriBuku);
        if(head==null){
            head=baru;
            tail=baru;
            tail.next=baru;
            head.prev=baru;

        }else{

            tail.next=baru;
            baru.prev=tail;
            tail=baru;
            head.prev=tail;
            tail.next=head;
        }

    }
    void add(Buku baru){
        if(head==null){
            head=baru;
            tail=baru;
            tail.next=baru;
            head.prev=baru;

        }else{

            tail.next=baru;
            baru.prev=tail;
            tail=baru;
            head.prev=tail;
            tail.next=head;
        }

    }
    void print(){
        if(head==null){
            System.out.println("belum ada data");

        }else{
            current=head;
            while(current!=null){
                System.out.println("Judul Buku\t:"+current.namaBuku);
                System.out.println("Nama Penulis\t:"+current.penulisBuku);
                System.out.println("Bahasa\t\t:"+current.namaBuku);
                System.out.println("Jumlah Halaman\t:"+current.jumlahHalaman);
                System.out.println("Rating Buku\t:"+current.ratingBuku);
                System.out.println("Kategori\t:"+current.kategoriBuku);
                System.out.println("---------------------------------------------");
                current=current.next;
                if(current==head){
                    break;
                }
            }
            
        }
    }
    public static void main(String[] args){
    ListBuku bukuu =new ListBuku();

    bukuu.add("A Princess of Mars", "Edgar Rice Burrough", "Inggris", 176, 4.5, "Science & Fiction");
    bukuu.add("Walden", "E.M Foster", "Inggris", 36, 4.5, "Biography");

    bukuu.print();
}
}
