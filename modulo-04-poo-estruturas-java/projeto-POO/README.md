# 🎯 Módulo 04 - Projeto do bootcamp TONNIE Java and AI in Europe - Simulação de Plataforma de Aprendizado


Este projeto é uma **simulação de uma plataforma de bootcamp desenvolvida em Java**, que gerencia cursos, mentorias e alunos inscritos, com sistema de progressão e pontuação (XP).

Os alunos podem se matricular em um bootcamp, progredir nos conteudos, obter XP e gerar relatorios em texto com seus dados de progresso.

---

## 📌 **Funcionalidades**
✅ Cadastro de **Cursos** com carga horaria e XP proporcional.  
✅ Cadastro de **Mentorias** com data e XP adicional.  
✅ Criação de **Bootcamp** com conteudos variados.  
✅ Matricular **Alunos** em bootcamps.  
✅ Simular **progresso** do aluno.  
✅ Cálculo do **XP total** obtido.  
✅ Console com saída **colorida** (ANSI).  
✅ Relatorios individuais em formato `.txt`.

---

## 🗂️ **Estrutura do Projeto**

src/
├── Main.java
└── br/
└── com/
└── murilo/
└── dominio/
├── Aluno.java
├── Bootcamp.java
├── Curso.java
├── Mentoria.java
└── Conteudo.java

---

## 🛑 **Pré-Requisitos**
- Java JDK 11
- IntelliJ IDEA (utilizado neste projeto)
- Conhecer a sintaxe da Java
- Git
- Conta no GitHub


---

## 🎯 **Visão Geral das Classes**

### 📌 **Conteudo (abstract)**
Classe base abstrata para todos os conteúdos do bootcamp.
- Atributos: título, descrição
- Método abstrato: `calcularXp()`
- Subclasses: **Curso** e **Mentoria**

---

### 📌 **Curso**
- Herda de **Conteudo**
- Atributo: carga horária
- XP proporcional à carga horária
- Saída formatada e legível no console

---

### 📌 **Mentoria**
- Herda de **Conteudo**
- Atributo: data (formatada em `dd-MM-yy`)
- Saída formatada e legível no console

---

### 📌 **Aluno**
- Nome completo
- Sets de conteúdos **matriculados** e **concluídos**
- Métodos para **matricular em bootcamp**, **progredir** e **calcular XP**
- Salva relatório em arquivo .txt

---

### 📌 **Bootcamp**
- Nome e descrição
- Datas de início e fim
- Set de **conteúdos**
- Set de **alunos matriculados**

---

## 🖥️ **Execução do Projeto**

✅ **Usando o IntelliJ IDEA**
1. Marque a pasta `src` como **Sources Root**.
2. Abra `Main.java`.
3. Clique no botão **Run** (ícone verde ▶️).
4. Veja a saída no console:
    - Relatórios coloridos (ANSI)
    - Alunos, curso e pontuacao
5. Arquivos `.txt` com relatórios individuais gerados no diretório do projeto.

---

## 📦 **Exemplo de Saída no Console**

========================================

Relatório do Aluno: Pedro Sarutobi

Conteúdos MATRICULADOS:

Mentoria: Mentoria em Java (Data: 10-07-25)

Conteúdos CONCLUIDOS:

Curso: Java Fundamentos (8 horas)

Curso: JavaScript Moderno (6 horas)

Total de XP obtido: 140.00

✅ Saida colorida no console para facilitar leitura!

---

## 💡 **Possíveis Melhorias**
- Persistencia em banco de dados
- Interface grafica com Swing ou JavaFX
- Exportação de relatorios em PDF
- Entrada de dados via Scanner para interatividade

---

## 👨‍💻 **Autor**
Desenvolvido por **Murilo**

✨ Transformar ideias em código. ✨

---

## 🤝 **Contribuições**
Sinta-se à vontade para abrir *issues* ou enviar *pull requests* para melhorias!
