package ExerciciosJava;

import java.util.Scanner;

public class ExercicioMetodos {
    static int n1;
    static int n2;
    static int resultado;
    static int contador = 0;

    static int soma(int n1, int n2){
        return n1 + n2;
    }

    static int sub(int n1,int n2){
        return n1 - n2;
    }

    static float div(float n1, float n2){
        return n1 / n2;
    }

    static int mult(int n1, int n2){
        return n1 * n2;
    }

    static float resto(float n1, float n2){
        return n1 % n2;
    }

    static void positivoNegativo(int num){
        if(num % 2 == 0){
            System.out.printf("O número %d é par.\n ",num);
        }else{
            System.out.printf("O número %d é ímpar.\n",num);
        }
    }
    static double potencia(int n1, int n2){
        return Math.pow (n1, n2);
    }
    
    public static void main(String[] agrs){
        int op,num;
        Scanner teclado = new Scanner(System.in);
        
        do{  

            System.out.println("    MENU");
            System.out.println("[1] SOMAR");
            System.out.println("[2] SUBTRAIR");
            System.out.println("[3] MULTIPLICAR");
            System.out.println("[4] DIVIDIR");
            System.out.println("[5] RESTO DA DIVISÃO");
            System.out.println("[6] Número par ou impar.");
            System.out.println("[7] Potencia");
            System.out.println("[8] Gerador de números aleatorios");
            System.out.println("[0] SAIR");
            System.out.print("Digite sua opção: ");
            op = teclado.nextInt();
            switch (op) {
                case 1:
                    receberNumeros();
                    resultado = soma(n1,n2);
                    System.out.println("O Resultado da soma é: " + resultado);
                    contador ++ ;
                    break;

                case 2:
                    receberNumeros();
                    resultado = sub(n1, n2);
                    System.out.println("O resultado da subtração é: " + resultado);
                    contador ++ ;
                    break;
                
                case 3:
                    receberNumeros();
                    resultado = mult(n1, n2);
                    System.out.println("O resultado da multiplicação é: " + resultado);
                    contador ++ ;
                    break;

                case 4:
                    receberNumeros();
                    if(n2 != 0){
                        double num1 = n1;
                        double num2  = n2;
                        double resul = resultado;
                        resul = div(n1, n2);
                        System.out.println("O resultado da divisão é: " + resul);
                        contador ++ ;
                    }else{
                        System.out.println("Número invalido!");
                    }
                break;

                case 5:
                    if(n2 != 0 ){
                        receberNumeros();
                        double num1 = n1;
                        double num2 = n2;
                        double resul = resultado;
                        resul = resto(n1, n2);
                        System.out.println("O resto da divisão é: " + resul);
                        contador ++ ;
                    }else{
                        System.out.println("Número invalido!");
                    }
                break;
                case 6:
                System.out.print("Digite um número:");
                num = teclado.nextInt();
                positivoNegativo(num);
                contador ++;
                break;
                case 7:
                    receberNumeros();
                    double resul = potencia(n1, n2);
                    System.out.printf("O resultado da potencia é: %.0f\n",resul);

                break;
                case 8:
                    System.out.print("Digite o inicio dos números aleatorios: ");
                    n1 = teclado.nextInt();
                    System.out.print("Digite o final do número aleatorio: ");
                    n2 = teclado.nextInt();
                    double aleatorio = Math.random();
                    int ale = (int) (n1 + aleatorio * (n2- n1 + 1));
                    System.out.printf("O número aleatorio entre %d e %d é %d\n",n1,n2,ale );
                    contador++;

                break;
                case 0:
                    System.out.println("Sindo do programa...");
                    System.out.printf("Foram realizadas %d operações no programa.\n",contador);
                break;

                default:
                    System.out.println("Opção invalida!");
                break;
            }

        }while(op != 0);
        
    }

    public static void receberNumeros(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        n1 = teclado.nextInt();
        System.out.println("Digite o segundo número: ");
        n2  = teclado.nextInt();

    }

}
