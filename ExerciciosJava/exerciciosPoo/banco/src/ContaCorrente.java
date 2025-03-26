    public class ContaCorrente extends ContaBancaria {

        //Atributo
        public double taxaManutencao;

        //Contrutor

        public ContaCorrente(String nome, double saldo,int idade, double taxaManutencao){
            super(nome,saldo,idade);
            this.taxaManutencao = taxaManutencao;
        }

        //Métodos acessores getters e setters
        public double getTaxaManutencao(){
            return taxaManutencao;
        }

        public void setTaxaManutencao(double taxaManutencao){
            this.taxaManutencao = taxaManutencao;
        }


        //Método que subtrai do saldo da conta a taxa de manutenção
        public void descontarTaxa(){
            if (this.saldo >= taxaManutencao) { //verifica se o saldo da conta é superior a taxa de manuteção
                this.saldo = this.saldo - taxaManutencao;
                System.out.println("Taxa descontada com sucesso");
            }else{
                System.out.println("Valor do saldo não pode ser inferior a taxa");
            }
        }



    }
