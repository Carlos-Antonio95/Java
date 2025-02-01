package ExerciciosJava.Polimorfismo;

public abstract class Animal {
    //Atributos
    protected float peso;
    protected int idade;
    protected int membros;

    //Construtor
    public Animal(){
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    //Métodos getters e setters
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    //Métodos abstratos
    public void locomover(){
        System.out.println("Correndo");

    }
    public void alimentar(){
        
    }
    public abstract void emitorSom();

    

}
