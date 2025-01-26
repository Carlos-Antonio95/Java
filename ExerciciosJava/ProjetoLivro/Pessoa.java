

/**
 * Classe que representa uma Pessoa.
 * Contém atributos para nome, idade e sexo, além de métodos acessores, modificadores
 * e um método para incrementar a idade.
 */
public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private String sexo;

    // Construtor
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // Métodos Getters e Setters (Encapsulamento)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    // Método para incrementar a idade
    public void fazerAniver() {
        this.idade++;
    }
}
