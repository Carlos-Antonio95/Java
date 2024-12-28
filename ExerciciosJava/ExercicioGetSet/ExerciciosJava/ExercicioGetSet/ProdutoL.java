package ExerciciosJava.ExercicioGetSet;
    public class ProdutoL {
        //atributos
        private String nome;
        private double preco;
        private int quantidade;

        //construtor produto
        public ProdutoL(String nome,double preco,int quantidade){
            this.nome = nome;
            this.preco = preco >= 0 ? preco : 0;
            this.quantidade = quantidade >= 0 ? quantidade : 0;

        }   
        //metodos acessores getters
        public String getNome(){
            return this.nome;
        }

        public double getPreco(){
            return this.preco;
        }

        public int getQuantidade(){
            return this.quantidade;
        }

        //metodos modificadores setters

        public void setPreco(double novoPreco){
            if(novoPreco >= 0){
                this.preco = novoPreco;
                System.out.println("Preço atualizado!");
            }else{
                System.out.println("Erro! O preço não pode ser negativo");
            }
        }

        public void setQuantidade(int novaQuantidade){
            if(novaQuantidade >= 0){
                this.quantidade = novaQuantidade;
                System.out.printf("Estoque atualizado! %s, quantidade: %d\n",this.getNome(),this.getQuantidade());
            }else{
                System.out.println("ERRO! Quantidade não pode ser negativa");
            }
        }
        //estrutura adicionar em estoque
        public int adicionarEstoque(int quantidade){
            if (quantidade > 0) {
                return this.quantidade += quantidade;
            }else{
                System.out.println("ERRO!  Quantidade invalida");
            }
            return this.quantidade;

        }
        //estrutura remover do estoque
        public int removerEstoque(int quantidade){
            if(this.quantidade >= quantidade ){
                this.quantidade -= quantidade;
                System.out.println("Venda concluida com sucesso.");
                System.out.println("Estoque atualizado produto: "+this.getNome());
                System.out.println("Quantidade: "+this.getQuantidade());
                return this.quantidade;
            }else{
                System.out.println("ERRO! Não pode vender 0 produtos ou mais que a quantidade: "+this.getQuantidade());
            }
            return this.quantidade;
        }
        //metodo exibir detalhes dos produtos
        public void exibirDetalhes(){
            System.out.println("Informações do produto: ");
            System.out.println("Nome do produto: "+getNome());
            System.out.printf("Preço do produto: %.3f\n",getPreco());
            System.out.println("Quantidade em estoque: "+getQuantidade());
        }

    }
