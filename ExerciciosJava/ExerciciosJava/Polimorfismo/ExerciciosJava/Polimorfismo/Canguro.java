package ExerciciosJava.Polimorfismo;

public class Canguro extends Mamifero{

    @Override
    public void locomover() {
        System.out.println("Saltando");
    }

    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }


}
