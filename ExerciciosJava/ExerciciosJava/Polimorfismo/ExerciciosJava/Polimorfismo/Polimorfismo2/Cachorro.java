package ExerciciosJava.Polimorfismo.Polimorfismo2;

public class Cachorro extends Lobo {
    //Métodos

    @Override
    public void emitirSom(){
        System.out.println("Au!Au!Au!");
    }

    public void reagir(String frase){
        if(frase.equals("Toma Comida") || frase.equals("Ola")){
            System.out.println("Abandar e latir");
        }else{
            System.out.println("Rosnar");
        }

    }

    public void reagir(int hora, int min){
        if (hora < 12) {
            System.out.println("Abandar");
        }else if(hora >= 18){
            System.out.println("Ignorar");
        }else{
            System.out.println("Abandar e latir");
        }
    }
    public void reagir(boolean dono){
        if (dono) {
            System.out.println("Abanar");
        }else{
            System.out.println("Rosnar e latir");
            this.emitirSom();
        }
    }

    public void reagir(int idade, float peso){
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            }else{
                System.out.println("Latir");
                this.emitirSom();
            }
        }else{
            if (peso < 10) {
                System.out.println("Rosnar");
                this.emitirSom();
            }else{
                System.out.println("Ignroar");
            }
        }

        }

    }

