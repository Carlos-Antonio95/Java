package ExerciciosJava.SimuladorPorta;

public class Principal {
    public static void main(String[] agrs){
        Porta porta01 = new Porta();  
        porta01.escolherNOme("Sala");
        Porta porta02 = new Porta();
        porta02.escolherNOme("Quarto");
        porta01.verificaEstado();
        porta01.abrir();
        porta01.verificaEstado();
        porta01.fechar();
        porta01.verificaEstado();
        System.out.println();
        porta02.verificaEstado();
        porta02.abrir();
        porta02.verificaEstado();
        porta02.fechar();
        porta02.verificaEstado();
    

    }
}
