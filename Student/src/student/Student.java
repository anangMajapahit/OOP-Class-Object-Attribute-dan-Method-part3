package student;

class murid{
    private String nama;
    private String warna;
    private int umur;
    private String jenisKelamin;
    
    private Eating eating;
    private Drinking drinking;
    private Running running;
            
    
    public murid(String nama, String warna, int umur, String jenisKelamin){
        this.nama = nama;
        this.warna = warna;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }
    public void display(){
        System.out.println("Murid\t\t : " + this.nama);
        System.out.println("Warna\t\t : " + this.warna);
        System.out.println("Umur\t\t : " + this.umur);
        System.out.println("jenisKelamin\t : " + this.jenisKelamin + "\n");
    }
    public void setEating(Eating eating){
        this.eating = eating;
    }
    public void setDrinking(Drinking drinking){
        this.drinking = drinking;
    }
    public void setRunning(Running running){
        this.running = running;
    }
}
    class Running{
        private String name;
        private int health;
       
        public Running(String name, int health){
           this.name = name;
           this.health = health;
        }
        public void display(){
            System.out.println("Bisa Lari dengan cepat / lambat ? : " + this.name);
            System.out.println("Menambah poin kesehatan : " + this.health + "\n");
        }
    }
    class Drinking{
        private String name;
        private int health;
       
        public Drinking(String name, int health){
           this.name = name;
           this.health = health;
        }
        public void display(){
            System.out.println("Bisa minum secukupnya atau tidak ? : " + this.name);
            System.out.println("Menambah poin kesehatan : " + this.health + "\n");
        }
    }
    class Eating {
        private String name;
        private int strength;
        private int health;
        
        public Eating(String name, int strength, int health){
            this.name = name;
            this.strength = strength;
            this.health = health;
        }
        
        public void display(){
        System.out.println("Bisa makan banyak / sedikit : " + this.name);
        System.out.println("Menambah Kekuatan\t\t : " + this.strength);
        System.out.println("Menambah Kesehatan\t\t : " + this.health + "\n");
        
        }
        
    }

/**
 *
 * @author Anang Misbakhul Khoir
 * NIM 09040620047
 * Fakultas Saintek
 * Prodi Sistem Informasi
 * UINSA
 * 
 */

public class Student {

    public static void main(String[] args) {
        murid murid1 = new murid ("John","Fair",12,"Male");
        Eating eating1 = new Eating("Bisa Makan Banyak",2,3);
        Drinking drinking1 =  new Drinking("Bisa minum secukupnya",2);
        Running running1 = new Running("Bisa lari dengan cepat",3);

        murid1.display();
        eating1.display();
        drinking1.display();
        running1.display();
        
        System.out.println("================================================");
        
        murid murid2 = new murid ("Sophia","Fair",10,"Female");
        Eating eating2 = new Eating("Bisa Makan Sedikit",2,2);
        Drinking drinking2 =  new Drinking("Bisa minum sedikit",2);
        Running running2 = new Running("Bisa lari dengan lambat",2);

        murid2.display();
        eating2.display();
        drinking2.display();
        running2.display();
        
        System.out.println("================================================");
        
        murid murid3 = new murid ("Lily","Dark",11,"Female");
        Eating eating3 = new Eating("Bisa Makan Banyak",2,3);
        Drinking drinking3 =  new Drinking("Bisa minum secukupnya",2);
        Running running3 = new Running("Bisa lari dengan cepat",3);

        murid3.display();
        eating3.display();
        drinking3.display();
        running3.display();
        
        System.out.println("================================================");
    }
    
}
