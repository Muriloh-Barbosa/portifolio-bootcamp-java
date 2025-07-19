# 🎯 Módulo 08 - Projeto do bootcamp TONNIE Java and AI in Europe – Integração com Banco de Dados

Este projeto demonstra a implementação de um sistema de gerenciamento de boards (quadros) com colunas e cartões (cards), usando Java puro e JDBC com MySQL, sem frameworks externos.

É um repositório focado em prática com SQL, JDBC, DAOs e estruturação de camadas em aplicações Java.

---

## 📌 **Funcionalidades**
s
- Criar, listar e excluir boards
- Criar colunas personalizadas para cada board
- Inserir cards em colunas específicas
- Persistência em banco de dados MySQL com JDBC puro

---

## 🗂️ **Estrutura do Projeto**

src/
└── main/
├── java/
│   └── br/com/murilo/
│       ├── Main.java
│       ├── dto/
│       ├── exception/
│       ├── persistence/
│       │   ├── config/
│       │   ├── converter/
│       │   ├── dao/
│       │   ├── entity/
│       │   └── migration/
│       ├── service/
│       └── ui/
└── resources/
├── liquibase.properties
└── db/
└── changelog/
├── db.changelog-master.yml
└── migrations/

---

## 🛑 **Pré-Requisitos**
- Java JDK 11 +
- Gradle
- IntelliJ IDEA (utilizado neste projeto)
- MySQL Server (local)
- Git
- Conta no GitHub

---

## 🎯 **Visão Geral**

O projeto é uma aplicação de terminal (console) que simula a organização de tarefas em boards

Utiliza boas práticas de separação de responsabilidades:

DAO: acesso a dados

Entity: representação das tabelas

DTO: transporte de dados para a UI

Service: regras de negócio

UI: interação com o usuário via console

Banco de dados gerenciado com Liquibase.

---

## 🖥️ **Execução do Projeto**

✅ **Usando o IntelliJ IDEA**
1. Crie o banco de dados no MySQL:
2. Execute o projeto com: ./gradlew run
3. Siga as instruções no terminal para:
    - Criar um novo board
    - Adicionar colunas 

---

## 📦 **Exemplo de Saída no Console**
 **Neste teste foi definido 6 bords para exemplo**  
+------------------------------------------------------+    
1 | Teste Murilo | 1 | Data Inicial         | INITIAL | 0   
1 | Teste Murilo | 2 | Testar essa aplicacao | PENDING | 1  
1 | Teste Murilo | 3 | Testar essa aplicacao01 | PENDING | 2    
1 | Teste Murilo | 4 | testar essa aplicacao02 | PENDING | 3    
1 | Teste Murilo | 5 | testar essa aplicacao03 | PENDING | 4    
1 | Teste Murilo | 6 | testar essa aplicacao04 | PENDING | 5    
1 | Teste Murilo | 7 | testar essa aplicacao05 | PENDING | 6    
1 | Teste Murilo | 8 | Data Fim              | FINAL   | 7  
1 | Teste Murilo | 9 | Cancelar Board        | CANCEL  | 8  
+------------------------------------------------------+

---

## 💡 **Possíveis Melhorias**
- Criar testes automatizados com JUnit
- Adicionar logs com SLF4J
- Adicionar persistência com JPA futuramente
- Interface gráfica com JavaFX

---

## 👨‍💻 **Autor**
Desenvolvido por **Murilo**

✨ Transformar ideias em código. ✨

---

## 🤝 **Contribuições**
Sinta-se à vontade para abrir *issues* ou enviar *pull requests* para melhorias!
