package ExerciciosJava.Heranca;
public abstract class ContaBancaria {
    //Atributos
    private String titular;
    private int numeroConta;
    private float saldo;

    //Construtor
    public ContaBancaria(String titular, int numeroConta, float saldo){
        if (titular != null && !titular.isEmpty()) {
            this.titular = titular;
        }else{
            throw new IllegalArgumentException("O titular não pode ser nulo ou vazio");
        }
        if (numeroConta > 0) {  
            this.numeroConta = numeroConta;
        }else{
            throw new IllegalArgumentException("O número da conta deve ser positivo");
        }
        if (saldo >= 0) {
            this.saldo = saldo;
        }else{
            throw new IllegalArgumentException("O saldo não pode ser negativo");
        }


    }

    //Métodos espciais
    
    //Método depositar valor em conta
    public void depositar(float valor) {
        if (valor > 0) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito de R$ " + valor + " realizado com sucesso. Saldo atual: R$ " + this.getSaldo());
        } else {
            throw new IllegalArgumentException("O valor deve ser positivo");
        }

    }

    //Método sacar valor da conta
    public void sacar(float valor) {
        if (valor > 0 && this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque de R$ " + valor + " realizado com sucesso. Saldo atual: R$ " + this.getSaldo());
        } else {
            throw new IllegalArgumentException("Erro: Saldo insuficiente ou valor inv�lido para saque.");
        }
    }

    //Método abstrato
    public abstract void exibirInfo();

    //Métodos getters e setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    protected void setSaldo(float saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }else {
            throw new IllegalArgumentException("O saldo não pode ser negativo.");
        }
        
    }


    

}
