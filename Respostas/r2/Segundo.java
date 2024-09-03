package Respostas.r2;

import java.util.Scanner;

public class Segundo {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase para ser avaliada: ");
        String textoEntrada = scanner.nextLine();

        char minusculo = 'a';
        char maiusculo = 'A';
        int contador = 0;

        //seja maiúscula ou minúscula, como requisitado. 
        for (char c : textoEntrada.toCharArray()){
            if (c == minusculo  || c == maiusculo){
                contador++;
            }
        }

        if (contador != 0){
            System.out.println("A letra 'a' aparece " + contador + " vezes nesta frase.");
        }else {
            System.out.println("Não foi detectado nenhuma letra 'a' nesta frase.");
        }

        scanner.close();

        
    }
    
}
