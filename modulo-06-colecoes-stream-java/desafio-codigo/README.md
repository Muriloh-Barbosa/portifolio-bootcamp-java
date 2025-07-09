# 🎯 Módulo 06 - Coleções Stream

## ✅ Desafios deste módulo

- ✅ desafio-stream.java
- [Clique aqui para ver o resultado do desafio](https://github.com/Muriloh-Barbosa/portifolio-bootcamp-java/blob/main/modulo-06-colecoes-stream-java/desafio-codigo/desafio-stream.java)
```
Descrição
Você deve criar um programa que recebe uma lista de horários de reuniões agendadas durante o dia, cada uma representada por uma string no formato "HH:mm". Seu programa deve identificar e listar os horários únicos, ordenados do mais cedo ao mais tarde, ignorando horários repetidos.

Além disso, imprima quantos horários únicos foram informados.

Entrada
A primeira linha contém um número N, representando a quantidade de horários. Nas próximas N linhas, cada linha contém um horário no formato "HH:mm".

Um número inteiro N (quantidade de horários).
N linhas contendo um horário no formato "HH:mm".
Saída
Imprima os horários únicos ordenados, um por linha, e ao final uma linha com:
Total de horarios unicos: X, onde X é a quantidade de horários únicos.

Atenção: Os "horarios unicos" são os horários diferentes, ou seja, cada horário aparece uma única vez na listagem, mesmo que tenham sido informados múltiplas vezes na entrada. Dessa forma, a saída apresenta os horários distintos organizados do mais cedo ao mais tarde, eliminando duplicatas da entrada.

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	Saída
3
15:00
12:00
15:00	12:00
15:00
Total de horarios unicos: 2
4
11:30
09:00
11:30
09:00	09:00
11:30
Total de horarios unicos: 2
5
08:00
08:00
08:00
09:00
10:00	08:00
09:00
10:00
Total de horarios unicos: 3
Atenção: É extremamente importante que as entradas e saídas sejam exatamente iguais à descritas na descrição do desafio de código.
```
- ✅ desafio-stream-01.java
- [Clique aqui para ver o resultado do desafio](https://github.com/Muriloh-Barbosa/portifolio-bootcamp-java/blob/main/modulo-06-colecoes-stream-java/desafio-codigo/desafio-stream-01.java)
```
Descrição
Você deve criar um programa que receba uma lista de tarefas a serem feitas durante o dia. Cada tarefa possui um nome e uma prioridade (número inteiro). Ordene as tarefas pela prioridade crescente e imprima a lista organizada.

Entrada
A entrada receberá um número N, representando a quantidade de tarefas, seguido de N linhas, cada uma contendo o nome da tarefa e a prioridade separados por vírgula.

Um número inteiro N (quantidade de tarefas).
N linhas contendo "nome da tarefa,prioridade".
Saída
Deverá retornar a lista de tarefas ordenada pela prioridade em ordem crescente, uma por linha, no formato: tarefa - prioridade.

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	Saída
3
Estudar Java, 1
Reuniao Tech, 3
Pausa Cafe, 2	Estudar Java - 1
Pausa Cafe - 2
Reuniao Tech - 3
4
Enviar Emails, 2
Almoco, 3
Validar Codigos,1
Exercicios, 4	Validar Codigos - 1
Enviar Emails - 2
Almoco - 3
Exercicios - 4
2
Comprar Livros, 2
Ler, 2	Ler - 1
Comprar Livros - 2
Atenção: É extremamente importante que as entradas e saídas sejam exatamente iguais à descritas na descrição do desafio de código.

```

## 📖 Descrição
Exercícios sobre POO estruturas Java: variáveis, tipos, operadores, estruturas de controle.

## ▶️ Como executar
```
javac NomeDoArquivo.java
java NomeDoArquivo
```

## 💡 Observações
- Código simples e comentado.
