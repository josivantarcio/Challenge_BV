package src.br.com.thaizacn.designpattern.abstractfactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Calcular quantas vezes podemos remover a palavra "BANANA" da string S
 */
class Solution {
    public int solution(String S) {
        // Mapa para contar os caracteres
        Map<Character, Integer> charCount = new HashMap<>();
        
        // Iteração sobre cada caractere da string S e contagem
        for (char c : S.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Cálculo do número máximo de "BANANA" que podemos formar
        int maxBANANA = Integer.MAX_VALUE; // Começa com um número grande
        maxBANANA = Math.min(maxBANANA, charCount.getOrDefault('B', 0)); // Quantidade de 'B' disponíveis
        maxBANANA = Math.min(maxBANANA, charCount.getOrDefault('A', 0) / 3); // Quantidade de 'A' dividido por 3
        maxBANANA = Math.min(maxBANANA, charCount.getOrDefault('N', 0) / 2); // Quantidade de 'N' dividido por 2

        return maxBANANA;
    }
}
