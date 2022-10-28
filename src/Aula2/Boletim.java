package Aula2;

import java.util.Scanner;

public class Boletim {
    public static void main(String[] args) {
        float nota1,nota2,media;
        boolean resposta;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite sua primeira nota ");
        nota1 = leia.nextFloat();
        System.out.println("Digite sua segunda nota ");
        nota2 = leia.nextFloat();
        media = (nota1+nota2)/2;
        resposta = media >=7;
        System.out.println("O valor da média é maior ou igual a 7 "+resposta);

    }
}
