package Desafios.Easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {

    }
    public int romanToInt(String s) {
        // Passo 1: Criar o mapa com os valores dos símbolos romanos
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;       // Resultado acumulado
        int prevValue = 0;    // Valor do símbolo anterior

        // Passo 2: Percorrer a string de trás para frente
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);                // Símbolo atual
            int currentValue = romanMap.get(currentChar);  // Valor do símbolo atual

            if (currentValue < prevValue) {
                // Passo 3: Caso de subtração
                result -= currentValue;
            } else {
                // Passo 4: Caso de adição
                result += currentValue;
            }

            prevValue = currentValue;  // Atualiza o valor anterior
        }

        return result; // Passo 5: Retorna o resultado final
    }


}
