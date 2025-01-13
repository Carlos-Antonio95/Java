package SistemaBanco;

import java.util.Scanner;
// Classe principal que executa o sistema bancário com menu interativo
public class Main {
    public static void main(String[] agrs) {
        Banco banco = new Banco();  // Cria uma instância do banco
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            // Exibe o menu de opções para o usuário
            System.out.println("**********************");
            System.out.println("* Banco Carlos - Menu*");
            System.out.println("**********************");
            System.out.println("1. Criar conta");
            System.out.println("2. Exibir conta");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Depositar");
            System.out.println("5. Sacar");
            System.out.println("6. Transferir");
            System.out.println("0. Sair");
            System.out.println("\n----------------------");
            System.out.print("Escolha sua opção: ");
            opcao = scanner.nextInt();

            // Switch que define o que acontece com base na opção escolhida
            switch (opcao) {
                case 1:
                    banco.criarConta();  // Chama o método para criar uma nova conta
                    break;
                case 2:
                    int numContaExibir;
                    System.out.print("Digite o número da conta que deseja exibir: ");
                    numContaExibir = scanner.nextInt();
                    banco.exibirConta(numContaExibir);  // Exibe os dados de uma conta
                    break;
                case 3:
                    int numContaSaldo;
                    System.out.print("Número da conta para exibir saldo: ");
                    numContaSaldo = scanner.nextInt();
                    ContaBancaria contaSaldo = banco.buscarConta(numContaSaldo);
                    if (contaSaldo != null) {
                        System.out.println("Saldo: " + contaSaldo.consultarSaldo());  // Consulta o saldo
                    }
                    break;
                case 4:
                    int numContaDeposito;
                    double valorDeposito;
                    System.out.print("Número da conta do depósito: ");
                    numContaDeposito = scanner.nextInt();
                    ContaBancaria contaDeposito = banco.buscarConta(numContaDeposito);
                    if (contaDeposito != null) {
                        System.out.print("Valor a ser depositado: ");
                        valorDeposito = scanner.nextDouble();
                        contaDeposito.depositar(valorDeposito);  // Realiza o depósito
                    }
                    break;
                case 5:
                    int numContaSaque;
                    double valorSaque;
                    System.out.print("Número da conta saque: ");
                    numContaSaque = scanner.nextInt();
                    ContaBancaria contaSaque = banco.buscarConta(numContaSaque);
                    if (contaSaque != null) {
                        System.out.print("Valor saque: ");
                        valorSaque = scanner.nextDouble();
                        contaSaque.sacar(valorSaque);  // Realiza o saque
                    }
                    break;
                case 6:
                    int numContaRetirada, numContaDestino;
                    double valorTransferencia;
                    System.out.print("Número da conta origem transferência: ");
                    numContaRetirada = scanner.nextInt();
                    System.out.print("Número da conta destino: ");
                    numContaDestino = scanner.nextInt();
                    ContaBancaria contaRetirada = banco.buscarConta(numContaRetirada);
                    ContaBancaria contaDestino = banco.buscarConta(numContaDestino);
                    if (contaRetirada != null && contaDestino != null) {
                        System.out.print("Valor transferência: ");
                        valorTransferencia = scanner.nextDouble();
                        contaRetirada.transferir(valorTransferencia, contaDestino);  // Realiza a transferência
                    } else {
                        System.out.println("Conta origem ou destino não encontrada.");
                    }
                    break;
                case 0:
                    System.out.println("Finalizando sistema!");  // Finaliza o programa
                    break;
                default:
                    System.out.println("Opção inválida!");  // Mensagem para opções inválidas
                    break;
            }
        } while (opcao != 0);  // Repete até que a opção seja 0 (sair)
    }
}