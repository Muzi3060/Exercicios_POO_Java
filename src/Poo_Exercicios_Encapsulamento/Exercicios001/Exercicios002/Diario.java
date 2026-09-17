package Poo_Exercicios_Encapsulamento.Exercicios001.Exercicios002;

import java.util.ArrayList;

public class Diario {
    private ArrayList<String> segredos;
    private String senha;

    public Diario(String senha) {
        this.senha = senha;
        this.segredos = new ArrayList<String>();
    }

    public void escrever(String msg) {
        segredos.add(msg);
        System.out.println("Segredo adicionado com sucesso!");
    }

    public void ler(String senha) {
        if (this.senha.equals(senha)) {
            for (String segredo : segredos) {
                System.out.println(segredo);
            }
        } else {
            System.out.println("Senha incorreta. Acesso negado.");
        }
    }
}
