import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalHabitantes = 0;
        int totalMulheresCastanhasCastanhas = 0;

        while (true) {
            System.out.println("Digite os dados do habitante (ou -1 para encerrar):");
            System.out.print("Sexo (m/f): ");
            char sexo = sc.next().charAt(0);
            if (sexo == 'm' || sexo == 'f') {
                System.out.print("Cor dos olhos (a/v/c/p): ");
                char corOlhos = sc.next().charAt(0);
                if (corOlhos == 'a' || corOlhos == 'v' || corOlhos == 'c' || corOlhos == 'p') {
                    System.out.print("Cor dos cabelos (l/c/p/r): ");
                    char corCabelos = sc.next().charAt(0);
                    if (corCabelos == 'l' || corCabelos == 'c' || corCabelos == 'p' || corCabelos == 'r') {
                        System.out.print("Idade em anos: ");
                        int idade = sc.nextInt();
                        if (idade >= 10 && idade <= 100) {
                            System.out.print("Valor do salário: ");
                            double salario = sc.nextDouble();
                            if (salario >= 0) {
                                totalHabitantes++;
                                if (sexo == 'f' && idade >= 18 && idade <= 35 && corOlhos == 'c' && corCabelos == 'c') {
                                    totalMulheresCastanhasCastanhas++;
                                }
                            } else {
                                System.out.println("Valor do salário inválido!");
                            }
                        } else {
                            System.out.println("Idade inválida!");
                        }
                    } else {
                        System.out.println("Cor dos cabelos inválida!");
                    }
                } else {
                    System.out.println("Cor dos olhos inválida!");
                }
            } else if (sexo == '-' && sc.nextInt() == 1) {
                break;
            } else {
                System.out.println("Sexo inválido!");
            }
        }

        double porcentagem = (double) totalMulheresCastanhasCastanhas / totalHabitantes * 100;

        System.out.printf("Porcentagem de mulheres com olhos e cabelos castanhos e idade entre 18 e 35 anos: %.2f%%\n", porcentagem);

        sc.close();

    }

}
