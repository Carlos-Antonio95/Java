
    public class Main {
        public static void main(String[] agrs){
            ControleSmart controle = new ControleSmart();
           // Ligar o controle e abrir o menu
           controle.ligar();
           controle.abrirMenu();
    
           // Aumentar o volume
           controle.maisVolume();
           controle.maisVolume();
    
           // Mudar o canal
           controle.alterarCanal(10);
           controle.alterarCanal(105); // Canal inválido
    
           // Tocar e pausar a reprodução
           controle.play();
           controle.pause();
    
           // Testar o mudo
           controle.ligarMudo();
           controle.desligarMudo();
    
           // Desligar o controle
           controle.desligar();
           controle.abrirMenu();  // O controle está desligado, então não exibe o menu
          
    
        }
    }
    

