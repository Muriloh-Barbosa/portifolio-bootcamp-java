# 🎯 Módulo 07 - Projeto do bootcamp TONNIE Java and AI in Europe – Praticando com Spring

Este projeto demonstra a implementação de **padrões de projeto em Java** de forma didática, com dois módulos distintos:

✅ **javaPuro**: implementações clássicas de Design Patterns em Java puro, sem frameworks.

✅ **javaSpring**: aplicação Spring Boot que usa padrões de projeto para estruturar uma API REST conectada ao ViaCEP.

É um repositório focado em ajudar estudantes a **entender e aplicar padrões como Singleton, Facade e Strategy**, além de integrar uma solução **real** com consumo de API externa usando **OpenFeign** e persistência com **Spring Data JPA**.

---

## 📌 **Funcionalidades**

✅ Padrões de projeto em Java puro:
- Singleton (Lazy, Eager, LazyHolder)
- Facade (simplificação de subsistemas)
- Strategy (comportamento configurável em tempo de execução)

✅ API REST com Spring Boot:
- CRUD completo de Cliente
- Integração com ViaCEP usando OpenFeign
- Banco de dados em memória H2
- Repositórios JPA
- Injeção de dependências via Spring

✅ Organização modular para fácil manutenção e aprendizado.

---

## 🗂️ **Estrutura do Projeto**

src/
└── br/
└── com/
└── murilo/
├── javaPuro/
│   ├── ExecJavaPuro.java
│   ├── singleton/
│   │   ├── EagerSingleton.java
│   │   ├── LazySingleton.java
│   │   └── LazyHolderSingleton.java
│   ├── facade/
│   │   └── Facade.java
│   └── strategy/
│       ├── Robo.java
│       ├── Comportamento.java
│       ├── ComportamentoNormal.java
│       ├── ComportamentoDefensivo.java
│       └── ComportamentoAgressivo.java
└── javaSpring/
└── main/
├── AppApi.java
├── controller/
│   └── ClienteRestController.java
├── model/
│   ├── Cliente.java
│   ├── Endereco.java
│   ├── ClienteRepository.java
│   └── EnderecoRepository.java
└── service/
├── ClienteService.java
├── ViaCepService.java
└── impl/
└── ClienteServiceImpl.java

---

## 🛑 **Pré-Requisitos**
- Java JDK 11 +
- Maven
- IntelliJ IDEA (utilizado neste projeto)
- Conhecer a sintaxe da Java
- Git
- Conta no GitHub

---

## 🎯 **Visão Geral**

A aplicação é dividida em **dois módulos principais**:

✅ **javaPuro**
- Demonstra padrões de projeto em Java puro.
- Sem frameworks ou dependências externas.
- Execução via método main para aprendizado didático.

✅ **javaSpring**
- API REST construída com Spring Boot.
- Endpoints para gerenciar clientes e seus endereços.
- Integração com o serviço ViaCEP para preencher dados de endereço automaticamente.
- Uso de OpenFeign para consumo de API externa.
- Banco H2 em memória para armazenamento.

---

## 🖥️ **Execução do Projeto**

✅ **Usando o IntelliJ IDEA**
1. Abra o projeto **a partir da raiz onde está o pom.xml** (importar como projeto Maven).
2. Aguarde a indexação e o download das dependências Maven.
3. Localize a classe principal:
    - Para **javaPuro**: `ExecJavaPuro.java` (roda via main)
    - Para **javaSpring**: `AppApi.java` (classe com @SpringBootApplication)
4. Clique no botão **Run** (ícone verde ▶️).
5. Para o módulo Spring Boot:
    - Acesse os endpoints via navegador ou ferramenta como Postman:
        - GET http://localhost:8080/clientes
        - POST http://localhost:8080/clientes
        - PUT http://localhost:8080/clientes/{id}
        - DELETE http://localhost:8080/clientes/{id}

---

## 📦 **Exemplo de Saída no Console**

✅ Para **javaPuro**:


+------------------------------------------------------+

Teste LazySingleton:

br.com.murilo.javaPuro.singleton.LazySingleton@1a2b3c
br.com.murilo.javaPuro.singleton.LazySingleton@1a2b3c

+------------------------------------------------------+

✅ Para **javaSpring** (startup):

+------------------------------------------------------+

Started AppApi in 5.123 seconds (JVM running for 5.678)
Tomcat started on port(s): 8080 (http)

+------------------------------------------------------+

---

## 💡 **Possíveis Melhorias**
- Documentar a API com Swagger/OpenAPI.
- Criar testes unitários e de integração.
- Configurar profiles para ambientes dev/prod.
- Adicionar autenticação e segurança com Spring Security.
- Persistência em banco relacional (PostgreSQL ou MySQL).e

---

## 👨‍💻 **Autor**
Desenvolvido por **Murilo**

✨ Transformar ideias em código. ✨

---

## 🤝 **Contribuições**
Sinta-se à vontade para abrir *issues* ou enviar *pull requests* para melhorias!
