# Matriz de votação thehuxley
https://www.thehuxley.com/problem/2131?locale=pt_BR
## Descrição

Muito tempo atrás, em um lugar muito, muito distante, foi fundado o Reino Das Princesas Unidas. Trata-se de um grande Reino formado pela união dos povos liderados pelas princesas da Disney. Agora este Reino precisa eleger seu representante e é sua tarefa ajudar neste ponto.

A eleição será democrática, na qual os eleitores deverão votar nas princesas, indicando se concordam ou não que elas sejam suas representantes. Se concordar votam 1, se não concordar votam 0, para cada princesa.

Seu papel será colher os votos e apresentar um relatório com os votos dado a cada princesa.

## Formato de entrada

A primeira linha da entrada é composta por um número natural P, referente a quantidade de princesas

A segunda linha tem um número natural E, representando a quantidade de eleitores.

Cada uma das próximas E linhas contém P números que podem ser 1 ou 0, separados por espaço. Essas linhas representam os votos de um eleitor. Em cada uma dessas linhas, os P números correspondem, em ordem as princesas 1, 2, 3,...,P.

OBS: Você precisa, obrigatoriamente, armazenar os votos dos eleitores em um array bidimensional. Também é necessário um bloco de repetição para receber os votos e um diferente para apurá-los.

## Formato de saída

A saída deve conter P linhas, uma para cada princesa, no seguinte formato:

Princesa K: X voto(s)

K representa o número da princesa e X a quantidade de votos da mesma. As linhas devem estar em ordem da princesa 1 até a princesa P.

### Exemplos de:

Entrada
```txt
3
4
0 1 1
1 1 0
1 0 1
1 1 0
```
Saída
```txt
Princesa 1: 3 voto(s)
Princesa 2: 3 voto(s)
Princesa 3: 2 voto(s)
```
