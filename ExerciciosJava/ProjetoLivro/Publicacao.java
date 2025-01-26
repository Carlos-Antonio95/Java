

/**
 * Interface que define o comportamento de uma publicação.
 * Todas as classes que implementarem esta interface devem implementar
 * os métodos definidos aqui.
 */
public interface Publicacao {
    void abir();         // Método para abrir o livro
    void fechar();       // Método para fechar o livro
    void folhear(int p); // Método para folhear até uma página específica
    void avancarPag();   // Método para avançar para a próxima página
    void voltarPag();    // Método para voltar para a página anterior
}
