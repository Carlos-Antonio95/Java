
public class Main {
    public static void main(String[] args) {
    Mago mago1 = new Mago("Glebson", 50, 50, 10);
   Guerreiro guerreiro1 = new Guerreiro("Daniel", 100, 40, 60);
    System.out.println(mago1.atacar());
    System.out.println(mago1.atacar(50));
    }

}
