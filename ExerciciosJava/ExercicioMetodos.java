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
            System.out.printf("O n�mero %d � par.\n ",num);
        }else{
            System.out.printf("O n�mero %d � �mpar.\n",num);
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
            System.out.println("[5] RESTO DA DIVIS�O");
            System.out.println("[6] N�mero par ou impar.");
            System.out.println("[7] Potencia");
            System.out.println("[8] Gerador de n�meros aleatorios");
            System.out.println("[0] SAIR");
            System.out.print("Digite sua op��o: ");
            op = teclado.nextInt();
            switch (op) {
                case 1:
                    receberNumeros();
                    resultado = soma(n1,n2);
                    System.out.println("O Resultado da soma �: " + resultado);
                    contador ++ ;
                    break;

                case 2:
                    receberNumeros();
                    resultado = sub(n1, n2);
                    System.out.println("O resultado da subtra��o �: " + resultado);
                    contador ++ ;
                    break;
                
                case 3:
                    receberNumeros();
                    resultado = mult(n1, n2);
                    System.out.println("O resultado da multiplica��o �: " + resultado);
                    contador ++ ;
                    break;

                case 4:
                    receberNumeros();
                    if(n2 != 0){
                        double num1 = n1;
                        double num2  = n2;
                        double resul = resultado;
                        resul = div(n1, n2);
                        System.out.println("O resultado da divis�o �: " + resul);
                        contador ++ ;
                    }else{
                        System.out.println("N�mero invalido!");
                    }
                break;

                case 5:
                    if(n2 != 0 ){
                        receberNumeros();
                        double num1 = n1;
                        double num2 = n2;
                        double resul = resultado;
                        resul = resto(n1, n2);
                        System.out.println("O resto da divis�o �: " + resul);
                        contador ++ ;
                    }else{
                        System.out.println("N�mero invalido!");
                    }
                break;
                case 6:
                System.out.print("Digite um n�mero:");
                num = teclado.nextInt();
                positivoNegativo(num);
                contador ++;
                break;
                case 7:
                    receberNumeros();
                    double resul = potencia(n1, n2);
                    System.out.printf("O resultado da potencia �: %.0f\n",resul);

                break;
                case 8:
                    System.out.print("Digite o inicio dos n�meros aleatorios: ");
                    n1 = teclado.nextInt();
                    System.out.print("Digite o final do n�mero aleatorio: ");
                    n2 = teclado.nextInt();
                    double aleatorio = Math.random();
                    int ale = (int) (n1 + aleatorio * (n2- n1 + 1));
                    System.out.printf("O n�mero aleatorio entre %d e %d � %d\n",n1,n2,ale );
                    contador++;

                break;
                case 0:
                    System.out.println("Sindo do programa...");
                    System.out.printf("Foram realizadas %d opera��es no programa.\n",contador);
                break;

                default:
                    System.out.println("Op��o invalida!");
                break;
            }

        }while(op != 0);
        
    }

    public static void receberNumeros(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro n�mero: ");
        n1 = teclado.nextInt();
        System.out.println("Digite o segundo n�mero: ");
        n2  = teclado.nextInt();

    }

}
