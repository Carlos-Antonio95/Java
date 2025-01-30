package ExerciciosJava.Heranca;
import java.util.*;
public class Main {
    public static void main(String[] args){
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int op1,quantCc,quantCp;
        do{
            System.out.println("====== MENU ======");
            System.out.println("[1] Criar conta Corrente");
            System.out.println("[2] Criar conta Poupança");
            System.out.println("[3] Depositar");
            System.out.println("[4] Sacar");
            System.out.println("[5] Aplicar redimento");
            System.out.println("[6] Exibir informações de Contas");
            System.out.println("[0] Sair");
            System.out.print("Sua opção: ");
            op1 = scanner.nextInt();
            switch (op1) {
                case 1:
                    System.out.println("Quantas contas corrente deseja criar ?");
                    quantCc = scanner.nextInt();
                    scanner.nextLine();
                    for(int i = 0; i < quantCc; i++){
                        System.out.println("\nCriando Conta Corrente #" + (i + 1));
                      
                        System.out.print("Nome do titular: ");
                        String titularCC = scanner.nextLine();

                        System.out.print("Número da conta: ");
                        int numeroCC = scanner.nextInt();
                        scanner.nextLine(); // Limpa o buffer

                        System.out.print("Saldo inicial: ");
                        float saldoCC = scanner.nextFloat();
                        

                        System.out.print("Limite de cheque especial (negativo): ");
                        float limiteCC = scanner.nextFloat();
                        scanner.nextLine();
                        

                        try {
                            ContaBancaria novaConta = new ContaCorrente(titularCC, numeroCC, saldoCC, limiteCC);
                            contas.add(novaConta);
                        } catch (IllegalArgumentException e) {
                            System.out.println("Erro ao criar conta. "+e.getMessage());
                            i--;
                        }

                    }
                    break;
                case 2:
                    System.out.println("Quantas contas pouponças deseja criar? ");
                    quantCp = scanner.nextInt();
                    scanner.nextLine();// limpa o buffer
                    for(int i = 0; i < quantCp; i++){
                        System.out.println("\nCriando conta Poupança #"+( i + 1));

                        System.out.print("Nome do titular: ");
                        String nomeCp = scanner.nextLine();

                        System.out.print("Número da conta: ");
                        int numeroCp = scanner.nextInt();
                        scanner.nextLine();//Limpa o buffer

                        System.out.print("Saldo incial: ");
                        float saldoCp = scanner.nextFloat();
                

                        System.out.print("Rendimento %: ");
                        float redimentoCp = scanner.nextFloat();
                        scanner.nextLine();
                        
                        try {
                            ContaBancaria novaContaCp = new ContaPoupanca(nomeCp, numeroCp, saldoCp, redimentoCp); 
                            contas.add(novaContaCp);
                            
                        } catch (IllegalArgumentException e) {
                            System.out.println("Erro ao criar conta. "+ e.getMessage());
                           i--;
                        }
                    }
                    break;
            
                case 3:
                    System.out.println("Contas disponiveis:");
                    for(int i = 0; i < contas.size(); i ++){
                        ContaBancaria conta = contas.get(i);
                        System.out.printf("Conta # %d : Titular: %s\n",i,conta.getTitular());
                    }
                    System.out.println("Escolha a conta para depositar (digite o número da conta)");
                    int contaEscolhida = scanner.nextInt();
                    scanner.nextLine();

                    if (contaEscolhida >= 0 && contaEscolhida < contas.size()) {
                        ContaBancaria contaSelecionada = contas.get(contaEscolhida);

                        System.out.println("Digite o valor para deposito: ");
                        float valorDeposito = scanner.nextFloat();

                        try {
                            contaSelecionada.depositar(valorDeposito);
                        } catch (IllegalArgumentException e) {
                            System.out.println("Erro no deposito: "+e.getMessage());
                        }

                        
                    }else{
                        System.out.println("Conta inválida tente novamente");
                    }

                    break;

                case 4:
                    System.out.println("Contas disponíveis: ");
                    for(int i = 0; i < contas.size(); i ++){
                        ContaBancaria conta = contas.get(i);
                        System.out.printf("Conta # %d : Titular: %s\n",i,conta.getTitular());
                    }

                    System.out.println("Escolha a conta para sacar(digite o número da conta)");
                    contaEscolhida = scanner.nextInt();
                    scanner.nextLine();

                    if (contaEscolhida >= 0 && contaEscolhida < contas.size()) {
                        ContaBancaria contaSelecionada = contas.get(contaEscolhida);
                        System.out.println("Digite o valor para saque: ");
                        float valorSaque = scanner.nextFloat();

                        try {
                            contaSelecionada.sacar(valorSaque);
                        } catch (IllegalArgumentException e) {
                            System.out.println("Erro no saque: "+e.getMessage());
                        }
                    }else{
                        System.out.println("Conta inválida tente novamente");
                    }
                    break;

                case 5:
                    System.out.println("Contas disponiveis");
                    for(int i = 0; i < contas.size(); i++){
                        ContaBancaria conta = contas.get(i);
                        System.out.printf("Conta # %d : Titular: %s\n",i,conta.getTitular());
                    }
                    System.out.println("Escolha a conta para aplicar redimento(digite o número da conta)");
                    contaEscolhida = scanner.nextInt();
                    scanner.nextLine();
                    if (contaEscolhida >= 0 && contaEscolhida < contas.size()) {
                        ContaBancaria contaSelecionada = contas.get(contaEscolhida);
                        if (contaSelecionada instanceof ContaPoupanca) {
                            ((ContaPoupanca) contaSelecionada).aplicarRendimento();
                        } else {
                            System.out.println("Erro: Somente contas poupança podem receber rendimento!");
                        }
                    } else {
                        System.out.println("Conta inválida, tente novamente.");
                    }

                    break;
                default:
                    break;
            }
        }while(op1 != 0);


        scanner.close();
    }

}
