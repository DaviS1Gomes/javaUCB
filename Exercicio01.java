import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de carros vendidos: ");
        int numCarros = sc.nextInt();

        System.out.print("Digite o valor total das vendas: ");
        double valorVendas = sc.nextDouble();

        System.out.print("Digite o salário fixo: ");
        double salarioFixo = sc.nextDouble();

        System.out.print("Digite o valor por carro vendido: ");
        double valorCarro = sc.nextDouble();

        double comissaoFixa = numCarros * valorCarro;
        double comissaoVariavel = valorVendas * 0.05;
        double salarioFinal = salarioFixo + comissaoFixa + comissaoVariavel;

        System.out.printf("O salário final do vendedor é: R$ %.2f\n", salarioFinal);

        sc.close();

    }

}
