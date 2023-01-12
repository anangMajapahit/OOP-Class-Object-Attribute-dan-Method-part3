package vehiclekonstruktor;

/**
 * @author Anang Misbakhul Khoir
 * nim 09040620047
 */

class Vehicle {
    
    int numberOfWheels = 4;
    String brandName = "Honda";
    String color = "Red";
    double price = 500000000;
    
    int numberOfWheels2 = 2;
    String brandName2 = "Yamaha";
    String color2 = "White";
    double price2 = 50000000;
    
    int numberOfWheels3 = 6;
    String brandName3 = "Calvary";
    String color3 = "Yellow";
    double price3 = 1000000000;
    
    String Start = "";
    int Gir;

    void setStart(String nyalakan){
       Start = nyalakan;
    } 
    
        String getStart(){
            return Start;
        }
        
    void setchangeGir(int pertambahanGir) { 
	   	Gir = Gir+ pertambahanGir;
	}
    
	int getchangeGir() {
	    	return Gir;
	}
}

public class VehicleKonstruktor {

    public static void main(String[] args) {
        
        Vehicle car = new Vehicle();
        System.out.println("Jumlah Roda\t : " + car.numberOfWheels);
        System.out.println("Nama Kendaraan\t : " + car.brandName);
        System.out.println("Warna Kendaraan\t : " + car.color);
        System.out.println("Harga \t\t : " + car.price+"\n");
        
        car.setStart("Belum nyala");
        System.out.println("Kondisi Sebelumnya\t : " + car.getStart());
        car.setStart("Sudah nyala");
        System.out.println("Kondisi saat ini\t : " + car.getStart()+"\n");
        
        car.setchangeGir(1);  
	System.out.println("Gir Sebelumnya\t : "  + car.getchangeGir());
	car.setchangeGir(5); 	 									              
        System.out.println("Gir saat ini\t : " + car.getchangeGir());
        
        System.out.println("================================================");
        
        Vehicle MotorCycle = new Vehicle();
        System.out.println("Jumlah Roda\t : " + MotorCycle.numberOfWheels2);
        System.out.println("Nama Kendaraan\t : " + MotorCycle.brandName2);
        System.out.println("Warna Kendaraan\t : " + MotorCycle.color2);
        System.out.println("Harga \t\t : " + MotorCycle.price2+"\n");
        
        MotorCycle.setStart("Belum nyala");
        System.out.println("Kondisi Sebelumnya\t : " + MotorCycle.getStart());
        MotorCycle.setStart("Sudah nyala");
        System.out.println("Kondisi saat ini\t : " + MotorCycle.getStart()+"\n");
        
        MotorCycle.setchangeGir(1);  
	System.out.println("Gir Sebelumnya\t : "  + MotorCycle.getchangeGir());
	MotorCycle.setchangeGir(4); 	 									              
        System.out.println("Gir saat ini\t : " + MotorCycle.getchangeGir());
        
        System.out.println("================================================");
        
        Vehicle Truck = new Vehicle();
        System.out.println("Jumlah Roda\t : " + Truck.numberOfWheels3);
        System.out.println("Nama Kendaraan\t : " + Truck.brandName3);
        System.out.println("Warna Kendaraan\t : " + Truck.color3);
        System.out.println("Harga \t\t : " + Truck.price3+"\n");
        
        Truck.setStart("Belum nyala");
        System.out.println("Kondisi Sebelumnya\t : " + Truck.getStart());
        Truck.setStart("Sudah nyala");
        System.out.println("Kondisi saat ini\t : " + Truck.getStart()+"\n");
        
        Truck.setchangeGir(1);  
	System.out.println("Gir Sebelumnya\t : "  + Truck.getchangeGir());
	Truck.setchangeGir(7); 	 									              
        System.out.println("Gir saat ini\t : " + Truck.getchangeGir()+"\n");
        
        System.out.println("================================================");

    }
    
}
