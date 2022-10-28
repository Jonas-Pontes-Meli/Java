package Aula2;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero ;
        System.out.println("Digite um Número Qualquer :");
        numero = leia.nextInt();

        if(numero%2 == 0)
        {
            double raiz = Math.sqrt(numero);
            System.out.println("O numero é Par e sua Raíz Quadrada é = "+raiz);
        }
        else
        {
            double potencia = Math.pow(numero,2);
            System.out.println("O numero é Ímpar e a elevação ao Quadrado  é = "+potencia);
        }

    }
}
