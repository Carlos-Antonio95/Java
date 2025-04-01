
public class Guerreiro extends Personagem {
    //Atributo
    public int dano;

    //Construtor
    public Guerreiro(String nome, int vida, int forca,int dano){
        super(nome, vida, forca); // Chama o construtor da classe pai Personagem
        this.dano = dano;
    }

    @Override
    public String atacar(){
        return "O guerreiro "+this.nome+" atacou com sua espada!!!" ;
    }

    



}
