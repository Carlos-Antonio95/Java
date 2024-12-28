package ExerciciosJava.SistemaCadProduto;

import java.util.Scanner;

public class SisCadProduto {
        static Produto produto1 = new Produto("Celular", 1500.0,10);
        static Produto produto2 = new Produto("Televis?o",2200.34,10);
        static Produto produto3 = new Produto("Caneta", 2.50,10);
        
    public static void main(String[] agrs){
       
        int op,op1,op2,quant,estoqueRet;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Lista de produtos:");
            System.out.println("OP 1>> "+produto1.nome);
            System.out.println("OP 2>> "+produto2.nome);
            System.out.println("OP 3>> "+produto3.nome);
            System.out.println("4 >> Informações gerais dos produtos");
            System.out.println("0>> FINALIZAR PROGRAMA");
            System.out.print("Sua opção: ");
            op = scanner.nextInt();
            if(op == 1){
                opcoes();
                op1 = scanner.nextInt();
                if(op1 == 1){
                    System.out.println("Quantidade que ira retirar do estoque: ");
                    quant = scanner.nextInt();
                    produto1.removerEstoque(quant);
                }else{
                    System.out.println("Quantidade que ira adicionar ao estoque: ");
                    quant = scanner.nextInt();
                    produto1.adicionarEstoque(quant);
                }
            }else if(op == 2){
                opcoes();
                op1 = scanner.nextInt();
                if(op1 == 1){
                    System.out.println("Quantidade que ira retirar do estoque: ");
                    quant = scanner.nextInt();
                    produto2.removerEstoque(quant);
                    
                }else{
                    System.out.println("Quantidade que ira adicionar ao estoque: ");
                    quant = scanner.nextInt();
                    produto2.adicionarEstoque(quant);
                }
            }else if(op == 3){
                opcoes();
                op1 = scanner.nextInt();
                if(op1 == 1){
                    System.out.println("Quantidade que ira retirar do estoque: ");
                    quant = scanner.nextInt();
                    produto3.removerEstoque(quant);
                }else{
                    System.out.println("Quantidade que ira adicionar ao estoque: ");
                    quant = scanner.nextInt();
                    produto3.adicionarEstoque(quant);
                }
            }else if(op == 4){
                produto1.exibirInfo();
                produto2.exibirInfo();
                produto3.exibirInfo();

            }else if (op == 0){
                System.out.println("Programa finalizado!");
            }else {
                System.out.println("Opção invalida");
            }
        }while(op != 0);

            
    }

    static void opcoes(){
        System.out.println("1>> retirar estoque"); 
        System.out.println("2>> adicionar estoque");
        System.out.print("Sua opção: ");
        
    }
}
