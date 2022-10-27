package Aula1;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a Primeira Nota : ");
        nota1 = leia.nextDouble();
        System.out.println("Digite a Segunda Nota : ");
        nota2 = leia.nextDouble();
        System.out.println("Digite a Terceira Nota : ");
        nota3 = leia.nextDouble();
        System.out.println("Digite a Quarta Nota : ");
        nota4 = leia.nextDouble();
        media = (nota1+nota2+nota3+nota4)/4;
        System.out.println("Médial Final é = " + media );
    }
}
