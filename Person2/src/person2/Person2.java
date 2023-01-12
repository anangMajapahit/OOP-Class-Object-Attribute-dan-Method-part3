package person2;

/**
 * @author Anang Misbakhul Khoir
 * nim 09040620047
 */

class Person{
    protected String FirtsName = "Jhon";
    protected String LastName = "Doe";
    protected String email = "john@doe.com";
    protected int age = 24;
}
class Student extends Person{
    private int graduationYear = 2018;
    

public int getGraduationYear() {
        return graduationYear;
    }
}

public class Person2 {

    public static void main(String[] args) {
        Student myObj = new Student();
        
        System.out.println("Nama\t : " + myObj.FirtsName + " " + myObj.LastName);
        System.out.println("Email\t : " + myObj.email);
        System.out.println("Umur\t : " + myObj.age);
        System.out.println("Tahun Kelulusan\t : " + myObj.getGraduationYear());
    }
}
