package ExerciciosJava.Polimorfismo;

public class Cachorro extends Mamifero {

    //M�todos especiais
    @Override
    public void emitorSom(){
        System.out.println("AU AU!");
    }
    
    public void enterrarOsso(){
        System.out.println("Enterrado osso");
    }
    public void abanarRabo(){
        System.out.println("Abandndo rabo");
    }
}
