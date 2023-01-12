package personencapsulasipenbenaran;

/**
 * @author Anang Misbakhul Khoir
 * nim 09040620047
 */

class anggota{
    private String nama;
    
    public anggota(String nama){
        this.nama = nama;
    }
    public String getName(){
        return nama;
    }
    public void setName(String newNama){
        this.nama = newNama;
    }
    public void display(){
        System.out.println("Anggota\t : " + this.nama);
    }
}

public class PersonEncapsulasiPenbenaran {

    public static void main(String[] args) {
        anggota anggota1 = new anggota("Jhon");
                anggota1.setName("Jhon");

        System.out.println(anggota1.getName());
                anggota1.display();
    }
}