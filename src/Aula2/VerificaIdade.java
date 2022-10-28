package Aula2;

import java.util.Scanner;

public class VerificaIdade {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade ;
        System.out.println("Digite sua Idade : ");
        idade = leia.nextInt();
        if (idade > 10)
        {
            if (idade >= 10 && idade <= 14) {
                System.out.println("Sua categoria é Infantil ");
            } else if (idade >= 15 && idade <= 17) {
                System.out.println("Sua categoria é Juvenil ");
            } else if (idade >= 18 && idade <= 25) {
                System.out.println("Sua categoria é Adulto ");
            } else {
                System.out.println("Você está indo para a meia Idade! ");
            }
        }
        else
        {
            System.out.println("Idade digitada não pode ser abaixo de 10 anos!");
        }
    }
}
