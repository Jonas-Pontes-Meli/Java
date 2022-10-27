import java.util.Scanner;

public class DiferencaProdutoSoma {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int dif1;
        int dif2;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        numero1 = leia.nextInt();
        System.out.println("Digite o Segundo número");
        numero2 = leia.nextInt();
        System.out.println("Digite o Terceiro número");
        numero3 = leia.nextInt();
        System.out.println("Digite o Quarto número");
        numero4 = leia.nextInt();
        dif1 = numero1 * numero2;
        dif2 = numero3 * numero4 ;
        System.out.println("A diferença do produto de ("+ numero1 +" X "+numero2+") - ("+ numero3+" X "+numero4+")5 = "+(dif1-dif2));
    }
}
