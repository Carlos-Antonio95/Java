
/**
 * Classe que representa um Livro, implementando a interface Publicacao.
 * Contém informações sobre o título, autor, total de páginas, página atual,
 * estado (aberto ou fechado) e o leitor (uma instância de Pessoa).
 */
public class Livro implements Publicacao {
    // Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    // Construtor
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.pagAtual = 0;  // Inicializa na página 0
        this.aberto = false; // Inicialmente fechado
    }

    // Métodos Getters e Setters (Encapsulamento)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        // Verifica se a página é válida antes de atualizar
        if (pagAtual >= 0 && pagAtual <= totPaginas) {
            this.pagAtual = pagAtual;
        }
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    // Métodos da interface Publicacao
    @Override
    public void abir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p >= 0 && p <= totPaginas) {
            this.pagAtual = p;
        } else {
            System.out.println("Página inválida!");
        }
    }

    @Override
    public void avancarPag() {
        if (pagAtual < totPaginas) {
            this.pagAtual++;
        }
    }

    @Override
    public void voltarPag() {
        if (pagAtual > 0) {
            this.pagAtual--;
        }
    }

    // Método toString para exibir os detalhes do livro
    @Override
    public String toString() {
        return "Livro{" +
               "Título='" + titulo + '\'' +
               ", Autor='" + autor + '\'' +
               ", Total de Páginas=" + totPaginas +
               ", Página Atual=" + pagAtual +
               ", Aberto=" + aberto +
               ", Leitor=" + leitor.getNome() +
               ", Idade do Leitor=" + leitor.getIdade() +
               ", Sexo do Leitor='" + leitor.getSexo() + '\'' +
               '}';
    }
}
