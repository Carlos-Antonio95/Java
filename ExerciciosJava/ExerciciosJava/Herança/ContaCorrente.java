
public class ContaCorrente extends ContaBancaria{

    //Atributos
    private float limite;

        /**
     * Construtor para a classe ContaCorrente.
     * 
     * @param titular Nome do titular da conta.
     * @param numeroConta Número da conta.
     * @param saldo Saldo inicial da conta (deve ser >= limite).
     * @param limite Limite de cheque especial (deve ser 0 ou negativo).
     * @throws IllegalArgumentException Se os parâmetros forem inválidos.
 */
    //Construtor
    public ContaCorrente(String titular, int numeroConta, float saldo, float limite) {
        super(titular, numeroConta, saldo);
        this.setLimite(limite);

        if (saldo < limite) {
            throw new IllegalArgumentException("Saldo inicial ("+ saldo +") não pode ser menor que limite("+limite+").");
        }
        
    }

    //Método sobrescrito exibir informações da conta
    @Override
    public void exibirInfo(){
        System.out.println("Informações da conta:");
        System.out.println("Titular da conta "+this.getTitular());
        System.out.println("Número da conta  "+this.getNumeroConta());
        System.out.println("Saldo da conta R$ "+ String.format("%.2f", this.getSaldo()) );
        System.out.println("Limite de conta negativo R$ "+String.format("%.2f",this.getLimite()));

    }

    //Método sobreescrito sacar valor da conta
    @Override
    public void sacar(float valor) {
        if (valor > 0 && (this.getSaldo() + this.getLimite()  >= valor)) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque de R$ " + valor + " realizado com sucesso. Saldo atual: R$ " + this.getSaldo());
        } else {
            System.out.println("Erro: Saldo insuficiente ou valor inválido para saque.");
        }
    }

    //Métodos getters e setters
    public float getLimite() {
        return limite;
    }

    //garante que o limite seja 0 ou menor
    public void setLimite(float limite) {
        if (limite <= 0) {
            this.limite = limite;
        }else{
            throw new IllegalArgumentException("O limite deve ser um número negativo ou 0.");
        }
        
    }
    

}
