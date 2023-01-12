package jualbeli;

/**
 * @author Anang Misbakhul Khoir
 * Nim 09040620047  
 * Prodi Sistem Informasi
 */
public class Jual {
    
    private String nama; private int antrean;
    private int uang, harga, bayar;
    private int diskon, ongkir;
    private int totalharga, sisauang, kembalian;
    
    Jual (int antrean, String nama,int uang){
        this.antrean = antrean;
        this.nama = nama;
        this.uang = uang;
    }
    public void beli(int harga){
        this.harga = harga;
        System.out.println("No antrean\t: " + this.antrean + "\nNama\t\t: " + this.nama);
        System.out.println("Uang\t\t: " + this.uang);
        System.out.println("Barang\t\t: " + this.harga);
        bayar = this.uang - harga;
        
        if(harga >= 200000){
            diskon = 35000;
            sisauang = bayar + diskon;
            System.out.println("Diskon\t\t: " + diskon);
        } else{
            diskon = 0;
            sisauang = bayar + diskon;
            System.out.println("Diskon\t\t: " + diskon);
        }
    }
    public void totalharga(){
        ongkir = 20000;
        if(this.harga >= 200000){
            ongkir = ongkir - 7000;
            totalharga = harga - diskon + ongkir;
            kembalian = sisauang - ongkir;
            System.out.println("Ongkir\t\t: " + ongkir);
            System.out.println("=========================");
            System.out.println("Total harga\t: " + totalharga);
            System.out.println("Kembali\t\t: " + kembalian);
            System.out.println("\n");
        }else{
            totalharga = harga - diskon + ongkir;
            kembalian = sisauang - ongkir;
            System.out.println("Ongkir\t\t: " + ongkir);
            System.out.println("=========================");
            System.out.println("Total harga\t: " + totalharga);
            System.out.println("Kembali\t\t: " + kembalian);
            System.out.println("\n");
        }
    }
    private int getuang(){
        return this.uang;
    }
}

