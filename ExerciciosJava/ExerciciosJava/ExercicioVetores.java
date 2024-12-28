package ExerciciosJava;
import java.util.*;
public class ExercicioVetores {


    public static void main(String[] agrs){
        int[] vetores = {1,2,3,4,5};
        int numeros,pocisao;
        char sair = 'N', zerar = 'N';
        Scanner scanner = new Scanner(System.in);
        do{
            for(int i = 0; i < vetores.length; i ++){
                System.out.printf("Posi��es: %d -> %d\n",i,vetores[i]);
            }
            System.out.println("Deseja zerar todas as posi��es? [S/N]");
            zerar = scanner.next().charAt(0);
            if (zerar == 'S' || zerar =='s') {
                Arrays.fill(vetores, 0);
                System.out.println("Nova lista zerada:");
                for(int i = 0; i < vetores.length; i++){
                    System.out.printf("Posi��o: %d -> %d\n",i,vetores[i]);
                }
            }
            System.out.print("Digite a posi��o que deseja alterar: ");
            pocisao = scanner.nextInt();
            if(pocisao >=0 && pocisao < vetores.length){
                System.out.print("Digite o n�mero que deseja por na posi��o: "+pocisao+" -> ");
                numeros = scanner.nextInt();
                vetores[pocisao] = numeros;

            }else{
                System.out.println("Posi��o invalida!");
                System.out.println("Digite um n�mero entre 0 e "+(vetores.length - 1));
            }
            

            System.out.println("Deseja parar? (S/N) ");
            sair = scanner.next().charAt(0);

        }while(sair != 'S' && sair != 's');
    }

}

