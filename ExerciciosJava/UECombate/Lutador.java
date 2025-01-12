package UECombate;

public class Lutador {
    //Atributos

    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //MÃ©todos publicos
    public Lutador(String nome,String nacionalidade,int idade, double altura,double peso, int vitorias, int derrotas, int empates){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates  = empates;
    
    }

  
    public String toString() {
        return this.nome;
    }
    

    //MÃ©todos especiais

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getNacionalidade() {
        return nacionalidade;
    }


    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double getPeso() {
        return peso;
    }


    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }


    public String getCategoria() {
        return categoria;
    }


    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Médio";
        }else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria ="Inválido";
        }
    }


    public int getVitorias() {
        return vitorias;
    }


    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }


    public int getDerrotas() {
        return derrotas;
    }


    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }


    public int getEmpates() {
        return empates;
    }


    public void setEmpates(int empates) {
        this.empates = empates;
    }
    

    //MÃ©todos publicos


    
    public void apresentar(){
        System.out.println("-------------------------------");
        System.out.println("Chegou a Hora! Apresentamos o lutador  "+this.getNome());
        System.out.println("Diretamente de "+this.getNacionalidade());
        System.out.print("Com  "+this.getIdade()+"anos e ");
        System.out.println(this.getAltura()+" m de altura");
        System.out.printf("Pesando: %.2f kg\n",this.getPeso());
        System.out.println("Ganhou: "+this.getVitorias());
        System.out.println("Empatou: "+this.getEmpates());
        System.out.println("Perdeu: "+this.getDerrotas());


    }

    public void status(){
        System.out.print(this.getNome());
        System.out.print(" é um peso "+this.getCategoria());
        System.out.print(" "+this.getVitorias()+" vitorias ");
        System.out.print(this.getDerrotas()+" derrotas ");
        System.out.print(this.getEmpates()+" Empates \n");

    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);

    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);

    }
}
