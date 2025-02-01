package ExerciciosJava.Polimorfismo;

public class Mamifero extends Animal{
    //Atrinutos
    private String corPelo;

    //Contrutor
    public Mamifero(){
        this.corPelo = corPelo;
    }

    //Métodos getters e setters
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void locomover(){
     System.out.println("Correndo");   
    }
    @Override
    public  void alimentar(){
        System.out.println("Mamando");
    }
    @Override
    public  void emitorSom(){
        System.out.println("Som de Mamifero");

    }

}
