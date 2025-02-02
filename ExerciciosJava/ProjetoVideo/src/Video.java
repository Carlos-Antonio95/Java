public class Video implements AcoesVideo {
    //Atributos
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    //Construtor
    public Video(String titulo){
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    //Métodos espciais
    @Override
    public void play() {
        if (getReproduzindo() == false) {
            System.out.println("Vidío em play");
            setReproduzindo(true);
        }else{
            System.out.println("Ja esta reproduzindo");
        }
        
    }
    @Override
    public void pause() {
        if (getReproduzindo()) {
            System.out.println("Vídio pausado");
            setReproduzindo(false);
        }else{
            System.out.println("Video ja pausado");
        }
        
    }
    @Override
    public void like() {
        
    }

    //métodos getters e setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public boolean getReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video \n[titulo=" + titulo + ", \navaliacao=" + avaliacao + ", \nviews=" + views + ", \ncurtidas=" + curtidas
                + ", \nreproduzindo=" + reproduzindo + "]";
    }

}
