# HelpDesk API

## Decrição
essa api foi desenvolvida com varios intutitos dentre eles facilitar a comunicação 
entre os funcionarios de uma empresa onde o objetivo dela é facilitar o gerenciamento
de chamados, pois dentro dessa api é possivel ter funcionalidades como
criar, listar, atualizar, e deletar chamados, onde o usuario e o tecnico poderão ter uma 
comunicação facilitada de um chamado que foi aberto, 

 ## Tecnologias Utilizadas
- Java 17
- Spring Boot 4.0.6
- MySQL
- Swagger

## Como rodar
1. Clone o repositório
2. Configure o `application.properties` com suas credenciais do MySQL
3. Rode o projeto pela IDE
4. Acesse `http://localhost:8080/swagger-ui/index.html`


## Endpoints
|  Metodo | Rota | Descrição |
|---------|---|---|
| POST    | /chamado | Cria um novo chamado |
| GET     | /chamado | Lista todos os chamados |
| GET     | /chamado/{id} | Busca um chamado pelo ID |
| PUT     | /chamado/{id} | Atualiza um chamado |
| DELETE  | /chamado/{id} | Deleta um chamado |



## Contribuição
Dicas de melhorias e críticas construtivas são sempre bem vindas!
