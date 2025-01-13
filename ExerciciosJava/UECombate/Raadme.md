Sistema de Gerenciamento de Lutas
Este é um projeto simples em Java que simula um sistema de gerenciamento de lutas entre lutadores. O programa utiliza conceitos de Programação Orientada a Objetos (POO), como classes, métodos, atributos, e encapsulamento, para organizar e executar as lutas.

🚀 Funcionalidades
Cadastro de lutadores com informações como nome, nacionalidade, idade, peso e histórico de lutas.
Sistema de categorias baseado no peso dos lutadores.
Gerenciamento de lutas com validação para garantir que sejam entre lutadores da mesma categoria.
Resultado aleatório das lutas (vitória, derrota ou empate).
Atualização automática do histórico de lutas dos lutadores após cada combate.
🛠️ Tecnologias Utilizadas
Java: Linguagem de programação principal.
POO (Programação Orientada a Objetos): Estruturação do código em classes e objetos.
Random: Para determinar aleatoriamente o resultado das lutas.
📂 Estrutura do Projeto
plaintext
Copiar código
JavaPoo/
├── Aula07/
│   ├── Lutador.java       # Classe que representa os lutadores
│   ├── Luta.java          # Classe que gerencia as lutas
│   └── Main.java          # Classe principal para executar o programa

✨ Exemplo de Uso
No código principal, você pode criar lutadores e marcar lutas:

java
Copiar código
Lutador l1 = new Lutador("Anderson Silva", "Brasil", 45, 1.88, 84, 34, 6, 0);
Lutador l2 = new Lutador("Jon Jones", "EUA", 36, 1.93, 93, 27, 1, 0);

Luta luta = new Luta();
luta.marcarLuta(l1, l2);
luta.lutar();
🏆 Aprendizados
Este projeto foi desenvolvido com o objetivo de:

Praticar conceitos básicos de POO em Java.
Entender melhor como usar métodos, atributos e construtores.
Trabalhar com encapsulamento e validação de dados.
