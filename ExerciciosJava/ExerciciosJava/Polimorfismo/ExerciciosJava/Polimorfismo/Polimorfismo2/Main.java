package ExerciciosJava.Polimorfismo.Polimorfismo2;

public class Main {
    public static void main(String[] args){
       Cachorro x = new Cachorro();

        x.reagir("Ola"); //Abanar e latir
        x.reagir("Vai apanhar"); //Rosnar
        x.reagir(11, 45); // Ananar
        x.reagir(21,00); //Ignorar
        x.reagir(true); // Abanar
        x.reagir(false); // Rosnar e latir
        x.reagir(2, 12.5f); // Latir
        x.reagir(17, 4.5f); // Rosnar
    
    }

}
