/*
Implementa un programa en el que, dada una cadena de caracteres, elimine todos los caracteres duplicados consecutivos.
Actuando sobre la cadena original.
Ennn un luugarrr dde La Maaaancha
En un lugar de La Mancha	
 */
package Examen1ºEV;

public class Ejercicio004 {
    public static void main(String arg[]){
        char frase[] = {'E', 'n', 'n', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'u', 'g', 'a', 'r', 'r', 'r', ' ', 'd', 'd', 'e', ' ', 'L', 'a', ' ', 'M', 'a', 'a', 'a', 'a', 'n', 'c', 'h', 'a', ' '};
            
        int i = 0;
        int longitud = frase.length-1;
        while(i < longitud)
            if(frase[i] == frase[i+1]){
                for(int j = i; j < frase.length-1; j++)
                    frase[j] = frase[j+1];
            longitud--;
        }else
                i++;
            
        System.out.println(frase);
    }
}
