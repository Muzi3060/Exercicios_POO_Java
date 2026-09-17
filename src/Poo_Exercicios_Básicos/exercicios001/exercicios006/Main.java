package Poo_Exercicios_Básicos.exercicios001.exercicios006;

public class Main {

    public static void main (String[] args) {
        Caneta caneta1 = new Caneta("azul");

        System.out.println(caneta1.escrever("Olá, tudo bem? ")); // tampada

        caneta1.destampar();
        System.out.println(caneta1.escrever("Olá, tudo bem?")); // destampada

        caneta1.tampar();
        System.out.println(caneta1.escrever("Não posso escrever agora. ")); // tampada
    }
}
