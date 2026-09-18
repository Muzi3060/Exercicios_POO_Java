package Poo_Exercicios_Encapsulamento.Exercicios001.Exercicios003;

public class Main {

    public static void main(String[] args) {
        Credencial credencial1 = new Credencial();

        System.out.println("Senha válida: " + credencial1.validar("teste")); // true
        System.out.println("Senha inválida: " + credencial1.validar("senhaErrada")); // false
    }
}
