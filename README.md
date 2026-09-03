# API REST de Gerenciamento Financeiro Pessoal

API REST desenvolvida em Java com Spring Boot e MySQL para gerenciamento de finanças pessoais (controle de receitas, despesas, saldo e documentação interativa com Swagger).

## 🚀 Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3** (Spring Web, Spring Data JPA)
- **MySQL** (Banco de Dados Relacional)
- **Springdoc OpenAPI / Swagger UI** (Documentação Interativa)
- **Maven** (Gerenciador de Dependências)
- **Postman** (Testes de Requisições HTTP)

## 📌 Endpoints da API

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| `POST` | `/transacoes` | Cadastra uma nova receita ou despesa |
| `GET` | `/transacoes` | Lista todas as transações cadastradas |
| `PUT` | `/transacoes/{id}` | Atualiza uma transação existente pelo ID |
| `DELETE` | `/transacoes/{id}` | Remove uma transação do banco pelo ID |
| `GET` | `/transacoes/resumo` | Retorna o total de receitas, despesas e o saldo final |

## 📖 Documentação e Testes (Swagger UI)

Com a aplicação rodando localmente, acesse no navegador:
`http://localhost:8080/swagger-ui.html`

## 🛠️ Como Executar o Projeto Localmente

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/jpnascimento7/finance-api.git](https://github.com/jpnascimento7/finance-api.git)
   
2. **Crie o DataBase no terminal do seu MySql:**
   
   CREATE DATABASE financas_db;

3. **Ajustes**
   
   altere o arquivo: **src/main/resources/application.properties** com seu usuário e senhas locais do seu banco

5. **Inicializar**
   
   Rode a classe ApiFinancasApplication.java pela IDE de sua preferência 😊

   
