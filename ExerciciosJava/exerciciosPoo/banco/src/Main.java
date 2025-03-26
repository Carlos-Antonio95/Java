public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("Carlos Antonio", 2000.00f, 29, 5);
        ContaPoupanca poupanca1 = new ContaPoupanca("Andre silva", 124.01f, 99, 10);
        System.out.println(conta1.getSaldo());
        conta1.depositar(50);
        System.out.println(conta1.getSaldo());
        System.out.println(conta1.getNome());
        conta1.sacar(100);
        System.out.println(conta1.getSaldo());
        
       
    }
}
