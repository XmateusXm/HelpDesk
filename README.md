# 🚀 HelpDesk API

## 📌 Descrição
A HelpDesk API foi desenvolvida com o objetivo de facilitar a comunicação entre funcionários e o gerenciamento de chamados dentro de uma empresa.

Com ela, é possível realizar operações de:

- ✅ Criar chamados  
- ✅ Listar chamados  
- ✅ Atualizar chamados  
- ✅ Deletar chamados  

A proposta é permitir uma comunicação mais eficiente entre o usuário que abre o chamado e o técnico responsável pelo atendimento.

---

## 🛠 Tecnologias Utilizadas

- ☕ Java 17
- 🌱 Spring Boot
- 🗄 MySQL
- 📖 Swagger / OpenAPI

---

## ▶ Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/XmateusXm/HelpDesk
   ```

2. Configure o arquivo `application.properties` com suas credenciais do MySQL.

3. Execute o projeto pela sua IDE (IntelliJ ou VS Code).

4. Acesse a documentação Swagger:
   ```bash
   http://localhost:8080/swagger-ui/index.html
   ```

---

## 📡 Endpoints

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| POST | `/chamado` | Criar um novo chamado |
| GET | `/chamado` | Listar todos os chamados |
| GET | `/chamado/{id}` | Buscar chamado por ID |
| PUT | `/chamado/{id}` | Atualizar chamado |
| DELETE | `/chamado/{id}` | Deletar chamado |

---

## 📂 Estrutura do Projeto

```bash
src/
 ┣ controller
 ┣ service
 ┣ repository
 ┣ model
 ┣ dto
 ┗ config
```

---

## 📘 Documentação da API

Após iniciar o projeto, acesse a documentação interativa pelo navegador:

```bash
http://localhost:8080/swagger-ui/index.html
```

---

## 🤝 Contribuição

Sugestões, melhorias e críticas construtivas são sempre bem-vindas!  
Sinta-se à vontade para abrir issues ou contribuir com o projeto.

---

## 👨‍💻 Autor

Desenvolvido por **Mateus Meireles**
