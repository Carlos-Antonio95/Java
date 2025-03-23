public class ContaPoupanca extends ContaBancaria {

    //Atributos
    public double taxaRendimento;

    public ContaPoupanca(String nome,double saldo,int idade,double taxaRendimento){
        super(nome, saldo, idade);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    
    

}
