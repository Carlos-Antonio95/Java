package UECombate;

public class UltraEmojCombat {
    public static void main(String[] agrs) {
        // Criação de um array para armazenar os lutadores (6 posições)
        Lutador l[] = new Lutador[6];
        Lutador novo = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        Lutador novo1 = new Lutador(null, null, 0, 0, 0, 0, 0, 0);
        
        // Instanciação de cada lutador com os respectivos atributos
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1); // Lutador 1
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.70f, 57.8f, 14, 2, 3); // Lutador 2
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.93f, 81.6f, 13, 2, 1);  // Lutador 3
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2); // Lutador 4
        l[4] = new Lutador("UF0Cobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);  // Lutador 5
        l[5] = new Lutador("Nerdaat", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);     // Lutador 6
        
        // Exibição do status dos dois primeiros lutadores
        l[0].status(); // Status do lutador 0 ("Pretty Boy")
        l[1].status(); // Status do lutador 1 ("Putscript")

        // Criação de um objeto da classe Luta para gerenciar uma luta
        Luta UEC01 = new Luta();
      
        // Marcando a luta entre "Pretty Boy" (l[0]) e "Putscript" (l[1])
        UEC01.marcarLuta(l[0], l[1]);
        
        // Realizando a luta
        UEC01.lutar();

        // Exibindo o status dos lutadores novamente após a luta
        l[0].status(); // Status atualizado de "Pretty Boy"
        l[1].status(); // Status atualizado de "Putscript"
    }
}
