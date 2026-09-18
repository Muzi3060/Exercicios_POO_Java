package Poo_Exercicios_Encapsulamento.Exercicios001.Exercicios003;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Credencial {
    private String senha;
    private String hash;

    public Credencial() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a senha: ");

        this.senha = leitor.nextLine();
        leitor.close();
        this.hash = gerarHash(senha);
    }

    private String gerarHash(String senha) {
        try {
            MessageDigest criptografar = MessageDigest.getInstance("SHA-256"); // Escolha do algoritmo de hash
            byte[] hashBytes = criptografar.digest(senha.getBytes()); // Gera o hash da senha

            StringBuilder sb = new StringBuilder(); // StringBuilder para construir a representação hexadecimal do hash
            for (byte b : hashBytes) { // Itera sobre cada byte do hash
                sb.append(String.format("%02x", b)); // Converte o byte em hexadecimal e adiciona ao StringBuilder
            }
            return sb.toString(); // Retorna a representação hexadecimal do hash

        } catch (NoSuchAlgorithmException e) { // Captura a exceção caso o algoritmo de hash não seja encontrado
            throw new RuntimeException("Erro ao gerar hash", e); // Lança uma exceção em tempo de execução com a mensagem de erro
        }
    }

    public boolean validar(String senha) {
        String hashChave = gerarHash(senha);
        return this.hash.equals(hashChave);
    }
}
