package Poo_Exercicios_Polimorfismo.Exercicios001.Exercicios006;

public class Main {

    public static void main(String[] args) {
        System.out.println("Validando email, usuário e senha:");

        Validador email = new Email("murilup07@gmail.com");

        Validador usuario = new Usuario("joao_123");

        Validador senha = new Senha("Murilo@123");
    }
}