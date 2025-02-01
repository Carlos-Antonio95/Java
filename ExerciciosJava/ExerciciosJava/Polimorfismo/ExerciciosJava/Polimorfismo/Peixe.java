package ExerciciosJava.Polimorfismo;

public class Peixe extends Animal {
    //Atributos
    private String corEScama;

    //Construtor
    public Peixe(){
        this.corEScama = corEScama;
    }

    //M�todos especiais
    @Override
    public void locomover() {
       System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo subst�ncias");
    }

    @Override
    public void emitorSom() {
        System.out.println("Peixe n�o faz som");
    }

    public void soltarBolha(){
        System.out.println("Soltando bolha");
    }

    //M�todos getters e setters
    public String getCorEScama() {
        return corEScama;
    }

    public void setCorEScama(String corEScama) {
        this.corEScama = corEScama;
    }
    
}
