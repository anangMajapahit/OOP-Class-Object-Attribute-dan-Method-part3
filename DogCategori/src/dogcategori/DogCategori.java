package dogcategori;

/**
 * @author Anang Misbakhul Khoir
 * nim 09040620047
 */

public class DogCategori {

    public static void main(String[] args) {
        Dog Mydog = new Dog();
            System.out.println("Jenis\t : " + Mydog.breed );
            System.out.println("Ukuran\t : " + Mydog.size );
            System.out.println("Umur\t : " + Mydog.age );
            System.out.println("Warna\t : " + Mydog.color +"\n");
                
                Mydog.eat("Rujak");
                Mydog.sleep("Karena Kelelahan");
                Mydog.sit("Memperhatikan Sesuatu");
                Mydog.run("Bermain Main\n");
            
            System.out.println("=============================================");
                
            System.out.println("Jenis\t : " + Mydog.breed2 );
            System.out.println("Ukuran\t : " + Mydog.size2 );
            System.out.println("Umur\t : " + Mydog.age2 );
            System.out.println("Warna\t : " + Mydog.color2 +"\n");
                
                Mydog.eat("Soto Babat");
                Mydog.sleep("Karena Kelelahan");
                Mydog.sit("Memperhatikan Sesuatu");
                Mydog.run("Bermain Main\n");
            
            System.out.println("=============================================");    
                
            System.out.println("Jenis\t : " + Mydog.breed3 );
            System.out.println("Ukuran\t : " + Mydog.size3 );
            System.out.println("Umur\t : " + Mydog.age3 );
            System.out.println("Warna\t : " + Mydog.color3 +"\n");
            
                Mydog.eat("Daging");
                Mydog.sleep("Karena Kelelahan");
                Mydog.sit("Memperhatikan Sesuatu");
                Mydog.run("Bermain Main\n");
                
            System.out.println("=============================================");    
	}
}