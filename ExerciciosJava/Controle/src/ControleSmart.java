// A classe ControleSmart implementa a interface Controlador
public class ControleSmart implements Controlador {
    // Atributos que representam as propriedades do controle
    private int volume;       // Volume atual do controle (de 0 a 100)
    private boolean ligado;   // Estado do controle (ligado ou desligado)
    private boolean tocando;  // Estado de reprodução (tocando ou não)
    private int canalAtual;   // Canal atual

    // Construtor da classe ControleSmart
    // Inicializa o controle com volume em 50, desligado, não tocando, e canal 0
    public ControleSmart(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
        this.canalAtual = 0;
    }

    // Métodos privados para acessar e modificar os atributos do controle
    private int getVolume(){
        return volume;  // Retorna o volume atual
    }

    private void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;  // Ajusta o volume se estiver entre 0 e 100
        } else {
            System.out.println("Volume inválido. Deve estar entre 0 e 100.");
        }
    }

    private boolean getLigado(){
        return ligado;  // Retorna o estado do controle (ligado ou desligado)
    }

    private void setLigado(boolean ligado){
        this.ligado = ligado;  // Ajusta o estado do controle
    }

    private boolean getTocando(){
        return tocando;  // Retorna o estado da reprodução (tocando ou não)
    }

    private void setTocando(boolean tocando){
        this.tocando = tocando;  // Ajusta o estado de reprodução
    }

    private int getCanalAtual(){
        return canalAtual;  // Retorna o canal atual
    }

    private void setCanalAtual(int novoCanal){
        this.canalAtual = novoCanal;  // Ajusta o canal atual
    }

    // Método que exibe o menu do controle com as informações de status
    public void menu(){
        System.out.println("========MENU========");
        System.out.println("Smart Ligada? "+(this.getLigado() ? " Sim" : " Não"));
        System.out.println("Está tocando? "+(this.getTocando() ? " Sim" : " Não"));
        System.out.println("Canal: "+this.getCanalAtual());
        System.out.print("Volume: "+this.getVolume());
        for(int i = 0; i < this.getVolume(); i += 10){
            System.out.print("||");  // Exibe o volume com barras "||"
        }
        System.out.println("\n======================");
    }

    // Métodos implementados da interface Controlador

    @Override
    public void ligar() {
        this.setLigado(true);  // Liga o controle
        System.out.println("Controle ligado");
    }

    @Override
    public void desligar() {
        this.setLigado(false);  // Desliga o controle
        System.out.println("Controle Smart desligado");
    }

    @Override
    public void abrirMenu() {
        menu();  // Abre o menu
    }

    @Override
    public void fecharMenu() {
        System.out.println("Menu fechado.");  // Fecha o menu
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            if(this.getVolume() < 100){
                this.setVolume(getVolume() + 1);  // Aumenta o volume
            } else {
                System.out.println("Volume está no máximo");
            }
        } else {
            System.out.println("Controle Smart está desligado");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            if(this.getVolume() > 0){
                this.setVolume(getVolume() - 1);  // Diminui o volume
            } else {
                System.out.println("Volume está no mínimo");
            }
        } else {
            System.out.println("Controle Smart está desligado");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado()) {
            if (this.getVolume() != 0) {
                this.setVolume(0);  // Coloca o volume no mudo
                System.out.println("Volume no mudo.");
            } else {
                System.out.println("O volume já está no mudo.");
            }
        } else {
            System.out.println("Controle Smart desligado.");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado()) {
            if (this.getVolume() == 0) {
                this.setVolume(50);  // Restaura o volume para 50
                System.out.println("Volume restaurado para 50.");
            } else {
                System.out.println("O controle não está no mudo.");
            }
        } else {
            System.out.println("Controle Smart desligado.");
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);  // Inicia a reprodução
            System.out.println("Reprodução iniciada");
        } else {
            System.out.println("Impossível reprodução. Controle Smart desligado");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);  // Pausa a reprodução
            System.out.println("Reprodução pausada");
        } else {
            System.out.println("Impossível pausar. Controle Smart desligado ou nada está tocando.");
        }
    }

    @Override
    public void alterarCanal(int novoCanal) {
        if (getLigado()) {
            if (novoCanal >= 0 && novoCanal <= 100) {
                this.setCanalAtual(novoCanal);  // Altera o canal
                System.out.println("Canal alterado para: "+novoCanal);
            } else {
                System.out.println("Digite um canal válido, entre 0 e 100");
            }
        } else {
            System.out.println("Controle Smart está desligado");
        }
    }
}
