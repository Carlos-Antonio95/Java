package ExerciciosJava;
//contador em java

import java.util.*;
public class ContadorFor {
    public static void main(String[] agrs){
        int inicio, fim, passo;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o inicio do contador: ");
        inicio = teclado.nextInt();
        System.out.print("Digite o final do conrtador: ");
        fim = teclado.nextInt();
        System.out.print("Digite de quanto sera o passo: ");
        passo = teclado.nextInt();
        for(int i = inicio; i <= fim; i += passo ){
            System.out.print(i +" ");
        }


    }
}
