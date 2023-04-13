import java.util.Scanner;

public class CadastroPessoa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Digite o nome completo: ");
        String nome = sc.nextLine();

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite o CEP: ");
        String cep = sc.nextLine();
        cep = sc.nextLine(); // Para consumir o buffer do Scanner

        System.out.print("Digite o RG: ");
        String rg = sc.nextLine();

        System.out.print("Digite a matrícula: ");
        String matricula = sc.nextLine();

        System.out.print("É estudante? (s/n): ");
        char estudante = sc.next().charAt(0);

        System.out.println("\nCadastro realizado com sucesso!");
        System.out.println("CPF: " + cpf);
        System.out.println("Nome completo: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CEP: " + cep);
        System.out.println("RG: " + rg);
        System.out.println("Matrícula: " + matricula);
        System.out.println("É estudante? " + (estudante == 's' ? "Sim" : "Não"));

        sc.close();
    }

}
