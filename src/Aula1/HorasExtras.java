package Aula1;

import java.util.Scanner;

public class HorasExtras {
    public static void main(String[] args) {
        double salarioBruto;
        double adicionalNoturno;
        double horasExtras;
        double desconto;
        double salarioLiquido;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o Salário : ");
        salarioBruto = leia.nextDouble();
        System.out.println("Digite o Adicional Noturno : ");
        adicionalNoturno = leia.nextDouble();
        System.out.println("Digite as Horas Extras : ");
        horasExtras = leia.nextDouble();
        System.out.println("Digite o Desconto : ");
        desconto = leia.nextDouble();
        salarioLiquido = salarioBruto+adicionalNoturno+(horasExtras*5)-desconto;
        System.out.println("O Salário Liquido é  = " + salarioLiquido );
    }
}
