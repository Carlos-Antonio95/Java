package SistemaBanco;

public class ContaBancaria implements Conta {
    // Atributos
    public int numConta;   // Número da conta
    public String nomeTitular; // Nome do titular da conta
    private double saldo;  // Saldo da conta

    // Construtor para inicializar a conta com número e titular, e saldo inicial de 50.
    public ContaBancaria(int numConta, String nomeTitular) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 50f; // Saldo inicial de 50
    }

    // Métodos especiais: getters e setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos implementados da interface Conta

    @Override
    public double consultarSaldo() {
        return this.getSaldo();  // Retorna o saldo atual da conta
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;  // Adiciona o valor ao saldo
            System.out.println("Depósito realizado com sucesso");
        } else {
            System.out.println("Valor inválido para depósito");
        }
    }

    @Override
    public void sacar(double valor) {
        if (this.getSaldo() >= valor) {
            this.saldo -= valor;  // Subtrai o valor do saldo
            System.out.println("Saque realizado com sucesso");
        } else {
            System.out.println("Saque não pode ser maior que o saldo disponível");
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (this.getSaldo() >= valor) {
            this.saldo -= valor;  // Subtrai o valor da conta de origem
            contaDestino.depositar(valor);  // Deposita o valor na conta de destino
            System.out.println("Transferência realizada com sucesso");
        } else {
            System.out.println("Saldo insuficiente para transferência");
        }
    }
}