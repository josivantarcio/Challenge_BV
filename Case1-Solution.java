package src.br.com.thaizacn.designpattern;

import java.util.HashMap;
import java.util.Map;


/**
 * Calcular o dia da semana após K dias a partir de um dia inicial S, onde S é representado por uma string de três letras.
 */
class Solution {

    private static final Map<String, Integer> DAY_INDEX_MAP;
    private static final String[] DAYS_OF_WEEK;
    private static final int DAYS_IN_WEEK;

    static {
        DAY_INDEX_MAP = new HashMap<>();
        DAY_INDEX_MAP.put("Mon", 0);
        DAY_INDEX_MAP.put("Tue", 1);
        DAY_INDEX_MAP.put("Wed", 2);
        DAY_INDEX_MAP.put("Thu", 3);
        DAY_INDEX_MAP.put("Fri", 4);
        DAY_INDEX_MAP.put("Sat", 5);
        DAY_INDEX_MAP.put("Sun", 6);

        DAYS_OF_WEEK = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        DAYS_IN_WEEK = DAYS_OF_WEEK.length;
    }

    
    public String solution(String S, int K) {
        int startIndex = DAY_INDEX_MAP.get(S);
        int newIndex = (startIndex + K) % DAYS_IN_WEEK;
        if (newIndex < 0) {
            newIndex += DAYS_IN_WEEK;
        }
        return DAYS_OF_WEEK[newIndex];
    }

}
