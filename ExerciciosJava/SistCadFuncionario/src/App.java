import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome,cargo,departamento;
        double salario;
        int aumento;
        List<Funcionario> funcionario = new ArrayList<>();
        List<Gerente> gerente = new ArrayList<>();
        boolean entradaValida = false;
        while(!entradaValida){
            try {
                System.out.print("Digite o nome do Funcionario: ");
                nome = scanner.nextLine();
                System.out.print("Digite o cargo do funcionario: ");
                cargo = scanner.nextLine();
                System.out.print("Digite o Salário do funcionaro R$: ");
                salario = Double.parseDouble(scanner.nextLine());
                funcionario.add(new Funcionario(nome, cargo, salario));
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("ERRO: Entrada inválida! Digite um número");
                scanner.next();
            }
        } 

        System.out.print("Digite o aumento do funcionario: ");
        aumento = scanner.nextInt();
        funcionario.get(0).aumentarSalario(aumento);
        System.out.println(funcionario.get(0).exibirDados());
        
        
    }
}
