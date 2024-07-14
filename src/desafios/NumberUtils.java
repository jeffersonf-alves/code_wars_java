package desafios;
/* Criar uma solução para verificar se o número é narcisista (Número de Armstrong) ou não
 *
 *
 */

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {
    public static void main(String[] args) {
        if(isNarcissistic(1938))
            System.out.println("Verdadeiro");
        else
            System.out.println("Falso");
    }

    public static boolean isNarcissistic(int number) {
        // TODO replace with your code
        char[] digitos = String.valueOf(number).toCharArray();

        List<Integer> listNumbers = new ArrayList<Integer>();
        int expoente = digitos.length;

        for(char d : digitos) {
            int base = d - '0';
            int result = 1;
            for(int i = 0; i < expoente; i++) {
                result *= base;
            }
            listNumbers.add(result);
        }
        int soma = 0;
        for(int l : listNumbers) {
            soma += l;
        }

        if(soma == number)
            return true;

        return false;
    }

}
