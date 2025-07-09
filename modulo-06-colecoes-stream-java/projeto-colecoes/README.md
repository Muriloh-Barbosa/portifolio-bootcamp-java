# 🎯 Módulo 06 - Projeto do bootcamp TONNIE Java and AI in Europe - Simulação do jogo Sudoku


Este projeto é uma simulação de um jogo Sudoku em Java, com interface gráfica feita em Swing, onde o usuário pode escolher níveis de dificuldade, preencher o tabuleiro, verificar o status e resolver o desafio conforme as regras clássicas do Sudoku.

O jogo recria a estrutura 9x9 dividida em blocos 3x3, destacando os números fixos (pistas) e permitindo a interação do usuário com validação em tempo real.

---

## 📌 **Funcionalidades**

✅ Interface gráfica em Swing com layout em blocos 3x3

✅ Escolha de dificuldade (Fácil, Médio, Difícil) ao iniciar

✅ Geração de tabuleiros com pistas fixas conforme dificuldade

✅ Edição apenas em células livres (números fixos são bloqueados)

✅ Verificação de status do jogo (não iniciado, incompleto, completo, com/sem erros)

✅ Botões de ação: Verificar, Limpar, Novo Jogo, Sair

---

## 🗂️ **Estrutura do Projeto**

src/
└── br/
└── com/
└── murilo/
├── Main.java
├── model/
│     ├── Cell.java
│     └── SudokuBoard.java
└── gui/
├── SudokuFrame.java
└── Dificuldade.java

---

## 🛑 **Pré-Requisitos**
- Java JDK 11 +
- IntelliJ IDEA (utilizado neste projeto)
- Conhecer a sintaxe da Java
- Git
- Conta no GitHub


---

## 🎯 **Visão Geral **

A aplicação simula o jogo Sudoku tradicional

Neste projeto:

As pistas são prédefinidas de acordo com o nível de dificuldade escolhido pelo jogador (Facil, Medio ou Difícil).

A interface Swing exibe um grid de 9x9 com bordas destacando os blocos 3x3.

As células com pistas iniciais são bloqueadas, enquanto as outras podem ser preenchidas pelo usuario.

O usuário pode verificar o status do jogo, limpar suas jogadas ou iniciar um novo jogo com outra dificuldade.

Bootão para sair do jogo a qualquer momento.

---

## 🖥️ **Execução do Projeto**

✅ **Usando o IntelliJ IDEA**
1. Marque a pasta `src` como **Sources Root**.
2. Abra `Main.java`.
3. Clique no botão **Run** (ícone verde ▶️).
4. A aplicação Swing abrirá:
    - Escolha o nível de dificuldade.
    - Complete o Sudoku conforme as regras.
    - Use os botões: Verificar, Limpar, Novo Jogo, Sair.

---

## 📦 **Exemplo de Saída no Console**

+------------------------------------------------------+

| Escolha o nível de dificuldade: [Facil | Meedio | Dificil] |

+------------------------------------------------------+

---

## 💡 **Possíveis Melhorias**
- Adicionar geração aleatória de tabuleiros válidos.
- Salvar e carregar progresso em arquivo.
- Melhorar layout com cores.
- Entrada de dados via Scanner para interatividade

---

## 👨‍💻 **Autor**
Desenvolvido por **Murilo**

✨ Transformar ideias em código. ✨

---

## 🤝 **Contribuições**
Sinta-se à vontade para abrir *issues* ou enviar *pull requests* para melhorias!
