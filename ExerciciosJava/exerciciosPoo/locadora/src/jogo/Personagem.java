
public class Personagem {
    
    //Atributos
    public String nome;
    public int vida;
    public int forca;

//CONSTRUTOR
    public Personagem(String nome, int vida, int forca){
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public String atacar(){
        return "Personagem atacou !!!" ;
    }

    /*
    public void atacar(){
        System.out.println("Personagem atacou");
    }
     */

}
