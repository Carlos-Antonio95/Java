
public class ContaPoupanca extends ContaBancaria {

    //Atributos
    private float rendimento;

    public ContaPoupanca(String titular, int numeroConta, float saldo, float rendimento) {
        super(titular, numeroConta, saldo);
        this.setRendimento(rendimento);
    }

    public float getRendimento() {
        return rendimento;
    }

    public void setRendimento(float redimento) {
        if (redimento > 0) {
            this.rendimento = redimento;
        }else{
            throw new IllegalArgumentException("O rendimento deve ser superior a 0%. Insira um número valido.");
        }
        
    }

    //Método aplicar redimento no saldo fixo de 5.50%
    public void aplicarRendimento(){
        this.setSaldo(this.getSaldo() + (this.getSaldo() * (getRendimento() / 100)));
        System.out.println("Redimento aplicado, novo saldo R$ "+String.format("%.2f", getSaldo()));

    }

    @Override
    public void exibirInfo(){
        System.out.println("Informações da conta:");
        System.out.println("Titular da conta "+this.getTitular());
        System.out.println("Número da conta  "+this.getNumeroConta());
        System.out.println("Saldo da conta R$ "+ String.format("%.2f", this.getSaldo()) );
        System.out.printf("Taxa de redimento mensal %.2f%%\n",getRendimento());
    }
}
