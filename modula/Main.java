package modula;

public class Main {
    static ListRakBuku rakKiki = new ListRakBuku();
    static Rak current;
    static ListBuku bukuKiki = new ListBuku();

    static void addIntoRak(Buku baru, String namaRak){
        if(rakKiki.head==null){
            ListBuku bukuPertama = new ListBuku();
            bukuPertama.add(baru);
            rakKiki.add(namaRak, bukuPertama);

        }else{
            current = rakKiki.head;
            while(current!=null){
                if(rakKiki.head == null){
                    ListBuku bukuPertama = new ListBuku();
                    bukuPertama.add(baru);
                    rakKiki.add(namaRak,bukuPertama);
                }else{
                    current = rakKiki.head;
                    while(current!=null){
                        if(current.namaRak.compareTo(namaRak)==0){
                            current.kumpulanBuku.add(baru);
                        }else{
                            current=current.next;
                            
                            if(current==rakKiki.head){
                                break;
                            }

                        }
                    }
                    ListBuku bukuPertama = new ListBuku();
                    rakKiki.add(namaRak,bukuPertama);
                }
            }


        }
    }
    public static void main(String[] args){
        Buku harryPotter = new Buku("Harry poter", "uvuwewue", "Indonesia", 123, 3.4, "Scient");
        bukuKiki.add(harryPotter);

        
        System.out.println("List buku kiki");
        bukuKiki.print();

        addIntoRak(harryPotter,"Scient");

        

        

        rakKiki.print();
    }
}


