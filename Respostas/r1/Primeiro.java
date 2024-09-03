package Respostas.r1;

import java.math.BigInteger;
import java.util.Scanner;

public class Primeiro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        BigInteger  numeroEntrada = scanner.nextBigInteger();

        if (ehFibonacci(numeroEntrada)){
            System.out.println("O numero " + numeroEntrada + " pertence à sequênca Fibonacci.");
        }else {
            System.out.println("O numero " + numeroEntrada + " está fora da sequência.");
        }

        scanner.close();
        
    }

    public static boolean ehFibonacci(BigInteger  numero){
        if (numero.equals(BigInteger.ZERO) || numero.equals(BigInteger.ONE)) {
            return true;
        }

        BigInteger var1 = BigInteger.ZERO;
        BigInteger var2 = BigInteger.ONE;
        BigInteger sequencia = var1.add(var2); // começa com 0 + 1

        while (sequencia.compareTo(numero) <= 0){
            if (sequencia.equals(numero)){
                return true; // validção para a obra de arte abaixo
            }

            var1 = var2; //zero vira 1
            var2 = sequencia; // 1 vira (0 + 1) ou melhor, (N + (N-1))
            sequencia = var1.add(var2); //fecha na soma e procura a validação acima.
        }

        return false;


    }
    
}
