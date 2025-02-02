public class Main {
    public static void main(String[] args) throws Exception {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 POO");
        v[1] = new Video("Aula 12 PHP");
        v[2] = new Video("Aula 10 HTML");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Carlos", 28, "Masculino", "lota");
        g[1] = new Gafanhoto("Creuza", 50, "Feminino", "cz");

        Visualizacao vis[] = new Visualizacao[3];
        vis[0] = new Visualizacao(g[0], v[0]);
        vis[0] = new Visualizacao(g[0], v[1]);
        vis[0] = new Visualizacao(g[1], v[2]);
        vis[0] = new Visualizacao(g[1], v[0]);
       
        
    }
}
