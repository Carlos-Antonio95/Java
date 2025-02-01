package ExerciciosJava.Polimorfismo;

public class Main {
    public static void main(String[] args){
     Mamifero m = new Mamifero();
     Reptil r = new Reptil();
     Peixe p = new Peixe();
     Ave a = new Ave();
     Canguro c = new Canguro();
     Cachorro d = new Cachorro();
     Goldfish g = new Goldfish();
     Cobra co = new Cobra();
     Arara aa = new Arara();

    a.locomover();
    p.locomover();
    r.locomover();
    m.locomover();
    aa.setIdade(50);

    d.locomover();
    
    }
}
