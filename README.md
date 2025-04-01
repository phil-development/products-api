# Products API

Este projeto é uma API RESTful simples para gerenciamento de produtos, desenvolvida usando Spring Boot e um banco de dados SQL em memória H2. Ele permite realizar operações CRUD (Criar, Ler, Atualizar e Deletar) em produtos.

## Tecnologias Utilizadas

* **Spring Boot**: Framework Java para desenvolvimento rápido de aplicativos web.
* **H2 Database**: Banco de dados SQL em memória para desenvolvimento e testes.
* **Maven**: Ferramenta de gerenciamento de dependências e construção de projetos Java.
* **Java 24**: Linguagem de programação utilizada.

## Pré-requisitos

* Java Development Kit (JDK) 24 ou superior instalado.
* Maven instalado.
* Um cliente REST (como Postman ou Insomnia) para testar a API.

## Como Executar

1.  Clone o repositório:

    ```bash
    git clone [https://github.com/phil-development/products-api](https://github.com/phil-development/products-api)
    ```

2.  Navegue até o diretório do projeto:

    ```bash
    cd products-api
    ```

3.  Execute a aplicação usando Maven:

    ```bash
    mvn spring-boot:run
    ```

A API estará disponível em `http://localhost:8080`.

## Endpoints da API

* **Criar um produto (POST /products)**

    ```json
    {
      "name": "Produto Exemplo",
      "description": "Descrição do produto",
      "price": 99.99
    }
    ```

* **Listar todos os produtos (GET /products)**

* **Obter um produto por ID (GET /products/{id})**

* **Atualizar um produto (PUT /products/{id})**

    ```json
    {
      "name": "Produto Atualizado",
      "description": "Nova descrição",
      "price": 129.99
    }
    ```

* **Deletar um produto (DELETE /products/{id})**

## Banco de Dados H2

O banco de dados H2 é configurado para ser executado em memória, o que significa que os dados serão perdidos ao reiniciar a aplicação. Para acessar o console do H2, abra o navegador em `http://localhost:8080/h2-console` (as credenciais padrão são `username: sa` e `password: password`).

## Contribuição

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhorias, sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto está sob a licença [MIT](LICENSE).
