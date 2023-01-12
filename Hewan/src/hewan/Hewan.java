package hewan;

class animal{
    public void MakananHewan(){
        System.out.println("Hewan adalah pemakan makanan dan jenis2 hewan\n"
                + "pemakan makanan ini dibagi 3 ada herbivora, carnivora,dan omnivora berikut contoh2nya : \n");
    }
}

class herbivora extends animal{
    public void MakananHewan(){
        System.out.println("====Hewan Herbivora makan (Tumbuhan)====");
    }
}

class rabbit extends herbivora{
    public void MakananHewan(){
        System.out.println("Makanan rabit : Jagung, Padi, Kedelai, Semangka\n");
    }
}

class carnivora extends animal{
    public void MakananHewan(){
        System.out.println("====Hewan Carnivora makan (Daging)====");
    }
}

class lion extends carnivora{
    public void MakananHewan(){
        System.out.println("Makanan lion : wagyu A5, wagyu A4");
    }
}

class hyena extends carnivora{
    public void MakananHewan(){
        System.out.println("Makanan hyena : sapi, jerapah, gajah\n");
    }
}

class omnivora extends animal{
    public void MakananHewan(){
        System.out.println("====Hewan Omnivora makan (Selaga jenis makanan)====");
    }
}

class man extends omnivora{
    public void MakananHewan(){
        System.out.println("Makanan Manusia : Rujak Soto, Nasi goreng, Pepes daging ayam\n");
    }
}

/**
 * @author Anang Misbakhul Khoir
 * nim 09040620047
 */

public class Hewan {

    public static void main(String[] args) {
        animal hewanku = new animal();
        animal pemakanTumbuhan = new herbivora();
        animal kelinciku = new rabbit();
        animal pemakanDaging = new carnivora();
        animal singaku = new lion();
        animal hyenaku = new hyena();
        animal pemakanSegala = new omnivora();
        animal Manusiaku =  new man();
        
        hewanku.MakananHewan();
        pemakanTumbuhan.MakananHewan();
        kelinciku.MakananHewan();
        pemakanDaging.MakananHewan();
        singaku.MakananHewan();
        hyenaku.MakananHewan();
        pemakanSegala.MakananHewan();
        Manusiaku.MakananHewan();
    }
    
}