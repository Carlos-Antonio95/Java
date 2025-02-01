package ExerciciosJava.Polimorfismo;

public class Reptil extends Animal {

    //Atributos
    private String corEscama;

    //Contrutor
    public Reptil() {
        this.corEscama = corEscama;
    }

    //getters e setters
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
       System.out.println("Comendo Vejetais");
    }

    @Override
    public void emitorSom() {
        System.out.println("Som de reptil");
    }

    
    
}
