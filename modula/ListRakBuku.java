package modula;

public class ListRakBuku {
    Rak head;
    Rak tail;
    Rak current;

    void add(String namaRak, ListBuku kumpulanBuku){
        Rak baru = new Rak(null, null);

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
                System.out.println("["+current.namaRak+"]");
                System.out.println("-------------------------------------------");
                current.kumpulanBuku.print();
                current=current.next;
                if(current==head){
                    break;
                }
            }
        }
    }
}
