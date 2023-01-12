package jualbeli;

/**
 * @author Anang Misbakhul Khoir
 * nim 09040620047
 */

public class JualBeli {

    public static void main(String[] args) {
        Jual j1 = new Jual(01, "Sarah", 400000);
        j1.beli(200000);
        j1.totalharga();
        
        Jual j2 = new Jual(02, "Sabil", 400000);
        j2.beli(125000);
        j2.totalharga();
    }
    
}
