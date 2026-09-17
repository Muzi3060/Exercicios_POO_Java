package Poo_Exercicios_Básicos.exercicios001.exercicios006;

public class Caneta {
    private String cor;
    private boolean tampada = true;

    public Caneta(String cor) {
        this.cor = cor;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void tampar() {
        this.tampada = true;
    }

    public String escrever(String msg) {
        if (this.tampada) {
            return "\u001b[31m" + "A caneta está tampada. Não é possível escrever." + "\u001b[0m";
        }

        String codigoCor = switch (this.cor.toLowerCase()) {
            case "azul" -> "\u001B[34m";
            case "vermelho" -> "\u001B[31m";
            case "verde" -> "\u001B[32m";
            default -> "\u001B[0m";
        };
        String finalizar = "\u001B[0m";

        return codigoCor + msg + finalizar; // Em python seria o mesmo que f"[blue]{msg}[\blue]"
        }
    }


