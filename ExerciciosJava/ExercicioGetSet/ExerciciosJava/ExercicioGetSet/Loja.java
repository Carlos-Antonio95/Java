package ExerciciosJava.ExercicioGetSet;
import java.util.Scanner;

public class Loja {
        //Metodo com informações dos produtos como nome e preço
        static  void informacaoProdPreco(ProdutoL produto01,ProdutoL produto02){
        System.out.println("Lista produtos: ");
        System.out.printf("[1] %s, preço R$ %.3f\n",produto01.getNome(),produto01.getPreco());
        System.out.printf("[2] %s, preço R$ %.3f\n",produto02.getNome(),produto02.getPreco());
        System.out.println("Opção: ");
    }

    public static void main(String[] agrs){
        
        int op,quantiVenda,quantiEstoque,op1;
        double novoPreco;
        //instanciando objetos
        ProdutoL produto01 = new ProdutoL("Celular", 2.500, 10);
        ProdutoL produto02 = new ProdutoL("Tv",1.215,17);
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("    MENU");
            System.out.println("[1] Vender produtos");
            System.out.println("[2] Atualizar produtos/estoque");
            System.out.println("[3] Informaçoes gerais");
            System.out.println("[0] Sair");
            System.out.print("Sua Opção: ");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    informacaoProdPreco(produto01,produto02);
                    op1 = scanner.nextInt();
                    if(op1 == 1){
                        System.out.printf("Quantidade %s a serem vendido(a)s: ",produto01.getNome());
                        quantiVenda = scanner.nextInt();
                        produto01.removerEstoque(quantiVenda);

                    }else if(op1 == 2){
                        System.out.printf("Quantidade %s a serem vendido(a)s: ",produto02.getNome());
                        quantiVenda = scanner.nextInt();
                        produto02.removerEstoque(quantiVenda);
                            
                    }else{
                        System.out.println("Opção invalida!");
                    }
                    
                break;

                case 2:
                    System.out.println("[1] Atualizar estoque");
                    System.out.println("[2] Atualizar preços");
                    System.out.print("Sua opção: ");
                    op1 = scanner.nextInt();
                    if(op1 == 1 ){
                        System.out.printf("[1] Produto: %s, quantidade em estoque: %d\n",produto01.getNome(),produto01.getQuantidade());
                        System.out.printf("[2] Produto: %s, quantidade em estoque: %d\n",produto02.getNome(),produto02.getQuantidade());
                        System.out.print("Opção: ");
                        op1 = scanner.nextInt();
                        System.out.print("Novo valor em estoque: ");
                        if(op1 == 1){
                            quantiEstoque = scanner.nextInt();
                            produto01.setQuantidade(quantiEstoque);                 
                           
                        }else if(op1 == 2){
                            quantiEstoque = scanner.nextInt();
                            produto02.setQuantidade(quantiEstoque);
                        } else{
                            System.out.println("Opção invlida!");
                        }  
                    }else if(op1 == 2){
                        informacaoProdPreco(produto01,produto02);
                        op = scanner.nextInt();
                        System.out.print("Digite o novo preçoo: ");
                        if(op == 1){  
                            novoPreco = scanner.nextDouble(); 
                            produto01.setPreco(novoPreco);
                            
                        }else if(op1 == 2){
                            novoPreco = scanner.nextDouble();
                            produto02.setPreco(novoPreco);
                        }else{
                            System.out.println("Opção invlida!");
                        }
                        
                        
                    }else{
                        System.out.println("Opção invalida!");
                    }


                break;

                case 3:
                    produto01.exibirDetalhes();
                    produto02.exibirDetalhes();

                break;

                case 0:
                   System.out.println("Finalizando programa."); 

                break;
            
                default:
                    System.out.println("Opção invalida!");
                break;
            }


        }while(op !=0);

    
    }
    
}
