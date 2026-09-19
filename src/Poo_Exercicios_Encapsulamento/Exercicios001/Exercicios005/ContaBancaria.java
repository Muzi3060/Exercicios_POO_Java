package Poo_Exercicios_Encapsulamento.Exercicios001.Exercicios005;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ContaBancaria {
    protected int id;
    protected String titular;
    private double saldo;
    private String hash;

    public ContaBancaria(int id, String nome, double saldo, String senhaInicial) {
        this.id = id;
        this.titular = nome;
        this.saldo = saldo;
        this.hash = gerarHash(senhaInicial);

    }

    public String getTitular() {
        return this.titular;
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

    public boolean validarSenha(String chave) {
        String hashChave = gerarHash(chave); // Senha digitada novamente armazenada em hash
        return this.hash.equals(hashChave);
    }

    public boolean sacar(double valor, String senhaInformada) {
        if (!validarSenha(senhaInformada)) {
            return false;
        }
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso. Na conta " + this.id + " Saldo atual de R$" + this.saldo);
            return true;
        }
        return false;
    }

    public double depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso. Na conta " + this.id + " Saldo atual de R$" + this.saldo);
        } else {
            System.out.println("ERRO! Digite novamente o valor. Saldo atual de R$" + this.saldo);
        }
        return this.saldo;
    }

}
