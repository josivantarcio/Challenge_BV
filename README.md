# 🤓 Desafios de código Banco BV
## 📆 [Desafio do Cálculo do Dia da Semana](https://github.com/thaizacn/Challenge_BV/blob/main/Case1-Solution.java)
### Objetivo:
Calcular o dia da semana após K dias a partir de um dia inicial dado em formato de string.

### Descrição:
Este desafio envolve calcular o dia da semana após um certo número de dias a partir de um dia inicial dado. O dia inicial é representado por uma string de três letras (por exemplo, "Mon" para segunda-feira). O número de dias pode ser positivo ou negativo.

### Solução Implementada:

Utilização de um mapa para mapear os dias da semana para seus índices correspondentes.
Uso de aritmética modular para lidar com dias positivos e negativos de forma eficiente.
Implementação dentro de uma única classe (Solution) com um método solution que recebe a string do dia inicial e o número de dias.

## 🍌 [Desafio da Palavra "BANANA"](https://github.com/thaizacn/Challenge_BV/blob/main/Case2-Solution.java)
### Objetivo:
Determinar o número máximo de vezes que a palavra "BANANA" pode ser removida de uma string.

### Descrição:
Neste problema, é possível remover seis letras que formam a palavra "BANANA" da string S em cada operação. A operação só é válida se "BANANA" pode ser formada exatamente como na sequência da string.

### Solução Implementada:
Uso de um mapa para contar a frequência de cada caractere na string S.
Cálculo do número máximo de operações de remoção de "BANANA" com base na frequência de cada letra na string.
Implementação dentro de uma única classe (Solution) com um método solution que recebe a string S.

## 📂 [Desafio de Filtragem de Arquivos](https://github.com/thaizacn/Challenge_BV/blob/main/Case3-Solution.java)
### Objetivo:
Calcular o comprimento mínimo dos nomes dos arquivos que atendem a critérios específicos de permissões, extensões e proprietário.

### Descrição:
Este problema envolve filtrar uma lista de arquivos especificados em uma string formatada e determinar o comprimento mínimo dos nomes dos arquivos que atendem aos critérios:

Extensões válidas são "doc", "xls" e "pdf".
Permissões devem ser somente leitura (r--).
Os arquivos devem ter sido criados pelo usuário "root".
### Solução Implementada:

Leitura da string de entrada e split das linhas para processamento.
Verificação de cada linha para determinar se atende aos critérios especificados.
Retorno do comprimento mínimo do nome dos arquivos que atendem aos critérios ou a string "NO FILES" se nenhum arquivo atender.
Implementação dentro de uma única classe (Solution) com um método solution que recebe a string S.
