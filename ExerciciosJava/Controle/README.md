Controle Smart
Este projeto implementa um controle remoto inteligente em Java, simulando as funcionalidades de um controle de TV ou dispositivo similar. Ele permite o controle de volume, canais, reprodução e pausa, e a ativação do mudo, utilizando o conceito de interfaces e herança.

Estrutura do Projeto
O projeto é composto por duas classes principais, uma interface e um arquivo Main para testar as funcionalidades do controle inteligente:

Interface Controlador: Define os métodos que devem ser implementados pelas classes que controlam dispositivos inteligentes (ligar/desligar, volume, etc).
Classe ControleSmart: Implementa a interface Controlador e simula um controle remoto inteligente com funcionalidades como volume, canal e mudo.
Classe Main: Realiza testes, instanciando o ControleSmart e utilizando seus métodos para simular interações com o controle remoto.
Funcionalidades
O controle remoto inteligente possui as seguintes funcionalidades:

Ligar/Desligar: Liga ou desliga o controle remoto.
Ajustar Volume: Aumenta ou diminui o volume de 0 a 100.
Mudo: Ativa o mudo e restaura o volume.
Alterar Canal: Altera o canal dentro do intervalo de 0 a 100.
Reprodução: Inicia e pausa a reprodução de conteúdo.

Tecnologias Utilizadas
Java
Programação Orientada a Objetos (POO)
Interfaces e implementação de métodos
Licença
Este projeto está licenciado sob a MIT License.