package ExerciciosJava;
/*
 * Crie um programa que simula uma calculadora simples, onde o usuário pode escolher uma operação (soma, subtração, multiplicação ou divisão) e fornecer dois números para realizar a operação. O programa deve exibir o resultado da operação escolhida.
 */

import java.util.*;;

public class CalculadoraSimples {
    //metodo que retorna a soma dos valores
    static int soma(int n1, int n2){
        int s = n1 + n2;
        return s;
    }
    //metodo que retorna multiplica  dois valores
    static int multiplica(int n1, int n2){
        int s = n1 * n2;
        return s;
    }
    //metodo que retorna  a subtração de dois valores
    static int subtrair(int n1, int n2){
        int s = n1 - n2;
        return s;
    }

    //metodo que retorna a divisão de dois valores
    static double divisao(double n1, double n2){
        double s = n1 / n2;
        if( n2 == 0){
            System.out.println("Não é possivel dividir número por 0!");
            return 0;
        }
        return s;
    }

    //recebe os números do usuário
    static void receberNumeros(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número");
        n1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = scanner.nextInt();
        
    }
    static int n1,n2,resultado;
    public static void main(String[] agrs){
        int op;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("    MENU");
            System.out.println("1 = SOMA");
            System.out.println("2 = MULTIPLICAÇÃO");
            System.out.println("3 = SUBTRAÇÃO");
            System.out.println("4 = DIVISÃO");
            System.out.println("0 = SAIR");
            System.out.print("Digite sua opção: ");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    receberNumeros();
                    resultado = soma(n1, n2);
                    System.out.println("A soma dos valores é: "+resultado);
                break;
                case 2:
                    receberNumeros();
                    resultado = multiplica(n1, n2);
                    System.out.println("A multiplicação dos valores é: "+resultado);

                break;
                case 3:
                receberNumeros();
                resultado = subtrair(n1, n2);
                System.out.println("A subtração dos valores é: "+resultado);
                break;

                case 4:
                receberNumeros();
                double resul = (double) resultado;
                resul = divisao(n1, n2);
                if (n2 != 0){
                    System.out.println("O resultado da divisão é: "+resul);
                }
                break;
                case 0:
                    System.out.println("Saindo do programa!");
                break;
                default:
                    System.out.println("Opção invalida!");
                break;
            }
        }while(op != 0);
        scanner.close();



    }
}
