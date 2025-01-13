package SistemaBanco;

// Interface que define os métodos que todas as contas bancárias devem implementar.
public interface Conta {
    void depositar(double valor);      // Método para depósito
    void sacar(double valor);          // Método para saque
    double consultarSaldo();           // Método para consultar saldo
    void transferir(double valor, Conta contaDestino); // Método para transferir valores para outra conta
}