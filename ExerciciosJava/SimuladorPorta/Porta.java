package ExerciciosJava.SimuladorPorta;

public class Porta {
   private boolean estado;
   private String nome;

   public Porta(){
    this.estado = false; //inicializa a porta como fechada
   }

   public void abrir(){
        this.estado = true;
        System.out.println("A porta "+this.nome+ " foi aberta");
   }

   public void fechar(){
        this.estado = false;
        System.out.println("A porta "+this.nome+ " foi fechada");

   }

   public void verificaEstado(){
        if(this.estado == true){
            System.out.println("A porta "+this.nome+ " esta aberta");
        }else{
            System.out.println("A porta "+this.nome+ " esta fechada");
        }
   }

   public void escolherNOme(String nome ){
    this.nome = nome;
   }

}
