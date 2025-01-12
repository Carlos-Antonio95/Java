package UECombate;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Métodos publicos

    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }

    }

    public void lutar(){
        if(this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            System.out.println("====== RESULTADO DA LUTA ======");
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);// 0 1 2
            switch (vencedor) {
                case 0://Empate
                System.out.println("Empatou");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                    
                    break;

                case 1://Desafiado vence
                System.out.println("Vitoria do "+this.desafiado);
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();

                    break;


                case 2://Desafiante vence
                System.out.println("Vitoria do "+this.desafiante);
                this.desafiado.perderLuta();
                this.desafiante.ganharLuta();

                    break;
            
                default:
                    System.out.println("Erro na luta");

                    break;
            }
            System.out.println("===========================");


        }else{
            System.out.println("A luta não pode acontecer");
        }

    }

    //Métodos especiais

    public void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;

    }

    public Lutador getDesafiado(){
        return desafiado;
    }

    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }

    public Lutador getDesafiante(){
        return desafiante;
    }

    public void setRounds(int rounds){
        this.rounds = rounds;
    }

    public int getRounds(){
        return rounds;
    }

}
