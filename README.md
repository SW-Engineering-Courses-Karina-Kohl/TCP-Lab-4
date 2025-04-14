# PARTE 1
## Diagrama UML no Lucidchart para Associação, Agregação e Composição
Passo-a-Passo para Criar no Lucidchart
1. Acesse o Lucidchart e crie um novo diagrama UML em branco
2. Adicione as classes (retângulos com 3 compartimentos):
    * Departamento
    * Projeto
    * Funcionario
    * Endereco
    * Main
3. Preencha os atributos e métodos em cada classe,
    * Use a classe Main.java (package app) para ter uma ideia de alguns dos métodos que você vai precisar implementar
5. Adicione os relacionamentos:
    * Composição (losango preto) entre Departamento e Funcionarios (se o Departamento deixa de existir, os Funcionários também… exemplo prático: layoffs)
    * Agregação (losango branco) entre Projeto e Funcionario (se o projeto acaba, Funcionários continuam)
    * Associação Simples entre Funcionario e Endereco
6. Exporte o Diagrama
    * No Lucidchart, clique em "File" → "Download as" → "PNG" ou "PDF"
    * Upload no repositório do GitHub na pasta diagrama

# PARTE 2
Implementação das classes e relações em java

