public class Gafanhoto extends Pessoa {

    //Atrinutos
    private String login;
    private int totAssistindo;

    //Construtor
    public Gafanhoto(String nome, int data,String sexo,String login){
        super(nome, data, sexo);
        this.login = login;
        this.totAssistindo = 0;
    }

    //Métodos getters e setters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return totAssistindo;
    }

    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }

    public void viuMaisum(){

    }

    //Método toString sobreescrito
    @Override
    public String toString() {
        return "Gafanhoto "+super.toString()+"\n[login=" + login + ", \ntotAssistindo=" + totAssistindo + "]";
    }
}
