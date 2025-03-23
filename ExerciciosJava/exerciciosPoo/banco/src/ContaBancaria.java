public class ContaBancaria {
    //Atributos
    public String nome;
    public double saldo;
    public int idade;

    //contrutor
    public ContaBancaria(String nome, double saldo,int idade){
        this.nome = nome;
        this.saldo = saldo;
        this.idade = idade;
    }

    //Métodos acessores getters e setters
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    //Método(Especiais) para realizar de posito na conta
    public void depositar(double valorDeposito){
        if (valorDeposito > 0) {
            this.saldo = getSaldo() + valorDeposito;
            System.out.println("Deposito realizado com sucesso.");
        }else if(valorDeposito == 0){
            System.out.println("Deposito não pode ser 0");
        }else{
            System.out.println("Valor deposito deve ser positivo!");
        }
    }

    //Método realizar saque na conta
    public void sacar(double valorSaque){
        if (this.getSaldo() < valorSaque) {
            System.out.println("Erro: Valor do saque superior ao saldo da conta.");
            
        }else{
            this.saldo = this.saldo - valorSaque;
            System.out.println("Saque realizado com sucesso.");
        }
    }



    



}