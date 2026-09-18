package Poo_Exercicios_Encapsulamento.Exercicios001.Exercicios005;

import java.util.Scanner;

// Quem controla o fluxo (ex: Main) cuida da interação e do ciclo de vida do Scanner:
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senha = leitor.nextLine();

        ContaBancaria conta = new ContaBancaria(1, "Fabio", 1000.0, senha);

        System.out.print("Digite a senha para sacar: ");
        String senhaSaque = leitor.nextLine();

        conta.sacar(100.0, senhaSaque);

        leitor.close(); // Fechado apenas quando a aplicação encerra
    }
}
