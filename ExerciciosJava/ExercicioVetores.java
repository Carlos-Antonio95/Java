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
                System.out.printf("Posições: %d -> %d\n",i,vetores[i]);
            }
            System.out.println("Deseja zerar todas as posições? [S/N]");
            zerar = scanner.next().charAt(0);
            if (zerar == 'S' || zerar =='s') {
                Arrays.fill(vetores, 0);
                System.out.println("Nova lista zerada:");
                for(int i = 0; i < vetores.length; i++){
                    System.out.printf("Posição: %d -> %d\n",i,vetores[i]);
                }
            }
            System.out.print("Digite a posição que deseja alterar: ");
            pocisao = scanner.nextInt();
            if(pocisao >=0 && pocisao < vetores.length){
                System.out.print("Digite o número que deseja por na posição: "+pocisao+" -> ");
                numeros = scanner.nextInt();
                vetores[pocisao] = numeros;

            }else{
                System.out.println("Posição invalida!");
                System.out.println("Digite um nímero entre 0 e "+(vetores.length - 1));
            }
            

            System.out.println("Deseja parar? (S/N) ");
            sair = scanner.next().charAt(0);

        }while(sair != 'S' && sair != 's');
    }

}

