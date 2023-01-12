package person1;

/**
 * @author Anang Misbakhul Khoir
 * nim 09040620047
 */

class Person{
    String FirtsName = "Jhon";
    String LastName = "Doe";
    String email = "john@doe.com";
    int age = 24;
}

public class Person1 {

    public static void main(String[] args) {
        
        Person myObj= new Person();
        System.out.println("Name\t : " + myObj.FirtsName + " " + myObj.LastName);
        System.out.println("Email\t : " + myObj.email );
        System.out.println("Umur\t : " + myObj.age);
    }
}
