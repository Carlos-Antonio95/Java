package ExerciciosJava.Polimorfismo;

public class Ave extends Animal {

    //Atributos
    private String corPena;

    //Construtor
    public Ave(){
        this.corPena = corPena;
    }

    //Métodos getters e setters
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    //Métodos especiais
    @Override
    public void locomover() {
       System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitorSom() {
       System.out.println("som de ave");
    }

    public void fazerNinho(){
        System.out.println("Contruindo um ninho");
    }
}
