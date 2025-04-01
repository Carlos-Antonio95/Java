public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Gol", 50);
        Moto moto1 = new Moto("Fan160", 25);
        System.out.println(carro1.calcularAluguel(10));
        System.out.println(carro1.calcularAluguel(10, true));
       // System.out.println(moto1.calcularAluguel(6));
       // System.out.println(moto1.calcularAluguel(2));
        
    }
}
