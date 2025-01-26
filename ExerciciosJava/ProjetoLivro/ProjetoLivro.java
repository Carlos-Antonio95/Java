

/**
 * Classe principal para testar as funcionalidades das classes Pessoa e Livro.
 */
public class ProjetoLivro {
    public static void main(String[] args) {
        // Criação de duas pessoas
        Pessoa[] p = new Pessoa[2];
        p[0] = new Pessoa("Carlos", 29, "M");
        p[1] = new Pessoa("Ligia", 26, "F");

        // Criação de três livros
        Livro[] l = new Livro[3];
        l[0] = new Livro("Aprendendo Java", "Carlos", 100, p[0]);
        l[1] = new Livro("POO para Iniciantes", "Ligia", 800, p[0]);
        l[2] = new Livro("Python para Iniciantes", "Carlos", 500, p[1]);

        // Interações com o primeiro livro
        l[0].abir();              // Abre o livro
        l[0].folhear(50);         // Folheia até a página 50
        l[0].avancarPag();        // Avança para a próxima página
        System.out.println(l[0]); // Exibe os detalhes do livro
    }
}
