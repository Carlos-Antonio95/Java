package SistemaBanco;

import java.util.*;
// Classe que gerencia as contas bancárias
public class Banco {

    private List<ContaBancaria> contas;  // Lista de contas bancárias

    // Construtor para inicializar a lista de contas
    public Banco() {
        this.contas = new ArrayList<>();
    }

    // Método para criar novas contas bancárias
    public void criarConta() {
        int quantContas, numConta;
        String nomeTitular;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas contas deseja criar?");
        quantContas = scanner.nextInt();
        scanner.nextLine();
        
        // Estrutura para criação de contas
        for (int i = 0; i < quantContas; i++) {
            System.out.println("Criando a conta " + (i + 1));
            System.out.print("Digite o número da conta: ");
            numConta = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Digite o nome do titular da conta: ");
            nomeTitular = scanner.nextLine();

            contas.add(new ContaBancaria(numConta, nomeTitular));  // Adiciona a nova conta à lista
            System.out.printf("Conta %d criada com sucesso para %s, saldo inicial de 50.\n", numConta, nomeTitular);
        }
    }

    // Método para buscar uma conta pelo número
    public ContaBancaria buscarConta(int numConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumConta() == numConta) {
                return conta;  // Retorna a conta se encontrada
            }
        }
        System.out.println("Conta não encontrada");
        return null;  // Retorna null se a conta não for encontrada
    }

    // Método para exibir os dados de uma conta
    public void exibirConta(int numConta) {
        ContaBancaria conta = buscarConta(numConta);
        if (conta != null) {
            System.out.println("Conta encontrada!");
            System.out.println("Número da conta: " + conta.getNumConta());
            System.out.println("Titular: " + conta.getNomeTitular());
            System.out.println("Saldo: " + conta.getSaldo());
        }
    }
}