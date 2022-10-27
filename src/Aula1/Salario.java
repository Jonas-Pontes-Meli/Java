package Aula1;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        double salario;
        double novoSalario;
        double abono;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite seu Salário : ");
        salario = leia.nextDouble();
        System.out.println("Digite o Valor do Abono : ");
        abono = leia.nextDouble();
        novoSalario = salario + abono;
        System.out.println("O seu novo Salário é : "+ novoSalario);


    }
}
