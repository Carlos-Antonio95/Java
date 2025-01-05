public interface Controlador {
// Interface Controlador que define os métodos a serem implementados pelas classes que a utilizarem


    // Método para ligar o dispositivo
    public abstract void ligar();
    
    // Método para desligar o dispositivo
    public abstract void desligar();
    
    // Método para abrir o menu do dispositivo
    public abstract void abrirMenu();
    
    // Método para fechar o menu do dispositivo
    public abstract void fecharMenu();
    
    // Método para aumentar o volume do dispositivo
    public abstract void maisVolume();
    
    // Método para diminuir o volume do dispositivo
    public abstract void menosVolume();
    
    // Método para colocar o dispositivo no mudo (volume 0)
    public abstract void ligarMudo();
    
    // Método para desativar o mudo e restaurar o volume
    public abstract void desligarMudo();
    
    // Método para iniciar a reprodução (play)
    public abstract void play();
    
    // Método para pausar a reprodução
    public abstract void pause();
    
    // Método para alterar o canal do dispositivo
    public abstract void alterarCanal(int novoCanal);
}

