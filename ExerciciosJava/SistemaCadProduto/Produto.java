package ExerciciosJava.SistemaCadProduto;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    Produto(String nome, double preco,int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
   void exibirInfo(){
    System.out.println("Informações dos produtos: ");
        System.out.printf("Nome: %s, Preço %.2f, Quantidade: %d\n",this.nome,this.preco,this.quantidade);
    }

    int adicionarEstoque(int quant){
        if(quant > 0){
            this.quantidade += quant;
            System.out.printf("Adicionado %d unidades ao estoque de %s\n",quant,this.nome);
            System.out.println("Estoque atualizado: "+this.quantidade);
            return this.quantidade;
        }else{

        }
        System.out.println("Erro! Digite um número maior que 0");
        return this.quantidade;
    }

    int removerEstoque(int quant){
        if(this.quantidade  >= quant  && quant > 0){
            this.quantidade -= quant;
            System.out.printf("Retirado %d unidades ao estoque de %s\n",quant,this.nome);
            System.out.println("Estoque atualizado: "+this.quantidade );
            return this.quantidade;
        }else{
            System.out.println("Erro! Não pode tirar uma quantidade maior que o estoque");
            return this.quantidade;
        }
        

    }
}
