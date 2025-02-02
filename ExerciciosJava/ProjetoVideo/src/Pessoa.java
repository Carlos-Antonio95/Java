public abstract class Pessoa {
    //Atributos
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experiecia;

    
    //Construtor
    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiecia = 0;
    }

    //Métodos escpais
    protected void ganharExp(){

    }

    //getters e setters 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setData(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getExperiecia() {
        return experiecia;
    }

    public void setExperiecia(int experiecia){
        this.experiecia = experiecia;
    }

    @Override
    public String toString() {
        return "Pessoa \n[nome=" + nome + ", \nidade=" + idade + ", \nsexo=" + sexo + ", \nexperiecia=" + experiecia + "]";
    }

    
}
