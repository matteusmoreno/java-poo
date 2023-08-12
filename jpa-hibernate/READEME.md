# Sistema de Cadastro de Produtos - Projeto Alura

Este repositório contém um sistema de cadastro de produtos desenvolvido como parte do curso de Java com persistência JPA da Alura. O sistema utiliza o Hibernate como implementação da JPA para persistir os dados no banco de dados.

## Descrição

O projeto é uma aplicação Java que permite cadastrar, atualizar, remover e buscar produtos e categorias em um banco de dados utilizando JPA. Ele também demonstra consultas JPQL para buscar informações específicas do banco de dados.

## Tecnologias Utilizadas

- Java
- JPA (Java Persistence API)
- Hibernate
- Banco de Dados (configurável no arquivo persistence.xml)
- Maven (para gerenciamento de dependências)
- Git (controle de versão)

## Estrutura do Projeto

- `src/main/java/br/com/alura/loja` - Contém os pacotes com as classes Java do projeto.
    - `dao` - Classes de acesso aos dados.
    - `modelo` - Classes que representam as entidades do domínio.
    - `testes` - Classes com exemplos de uso das funcionalidades.

- `src/main/resources/META-INF` - Contém o arquivo `persistence.xml` que configura a unidade de persistência.

## Como Executar

1. Clone este repositório para sua máquina local.
2. Configure o banco de dados no arquivo `persistence.xml` se necessário.
3. Abra o projeto em uma IDE de sua escolha (Eclipse, IntelliJ, etc.).
4. Execute a classe `CadastroDeProduto.java` localizada em `src/main/java/br/com/alura/loja/testes`.

## Exemplos de Uso

O arquivo `CadastroDeProduto.java` contém exemplos de como cadastrar, buscar e realizar consultas de produtos e categorias. Basta executar essa classe para ver os resultados no console.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir um pull request caso queira adicionar melhorias, correções ou novas funcionalidades.
