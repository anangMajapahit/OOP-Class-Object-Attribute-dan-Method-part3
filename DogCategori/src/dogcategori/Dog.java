package dogcategori;

/**
 * @author Anang Misbakhul Khoir
 * nim 09040620047
 */

public class Dog {
    String breed = "Neapolion Mastiff";
    String size = "Besar";
    String color = "Black";
    int age = 5;
    String breed2 = "Mattese";
    String size2 = "Kecil";
    String color2 = "Putih";
    int age2 = 2;
    String breed3 = "Chow Chow";
    String size3 = "Sedang";
    String color3 = "Coklat";
    int age3 = 3;
    String eat;
    String sleep;
    String sit;
    String run;
	
        public Dog(){
                
	}
	public void eat(String eat){
                this.eat = eat;
                System.out.println("Makan : " + eat);
	}
        public void sleep(String sleep){
                this.sleep = sleep;
                System.out.println("Tidur : " + sleep);
	}
        public void sit(String sit){
                this.sit = sit;
                System.out.println("Duduk : " + sit);
	}
        public void run(String run){
                this.run = run;
                System.out.println("Berlari : " + run);
	}
}