
public class Mago extends Personagem {
    //Atributo
    public int magia;

    //Construtor
    public Mago(String nome, int vida, int forca,int magia){
        super(nome,vida,forca);
        this.magia = magia;
    }

    
    @Override
    public String atacar(){
        return "O Mago "+this.nome+" lançou uma magia poderosa!!!" ;
    }

    public String atacar(int dano){
        return "O Persoagem "+this.nome+ " atacou causando "+dano +" de dano";

    }

    



}
