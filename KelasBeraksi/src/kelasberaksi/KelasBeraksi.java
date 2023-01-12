package kelasberaksi;

class Super_Class{
    int num = 20;
    public void display(){
        System.out.println("This is the display method of superclass");
    }
}

/**
 * @author Anang Misbakhul Khoir
 * nim 09040620047
 */

public class KelasBeraksi extends Super_Class{
    int num = 10;
    
    public void display(){
        System.out.println("This is the display method of kelas beraksi");
    }
    public void my_method(){
        KelasBeraksi sub = new KelasBeraksi();
    
        sub.display();
        
        super.display();
        
        System.out.println("Value of the variable named num in Kelas Beraksi : " + sub.num);
        
        System.out.println("value of the variable named num in super class : " + super.num);
    }

    public static void main(String[] args) {
        KelasBeraksi obj = new KelasBeraksi();
        obj.my_method();
        
    }
    
}
