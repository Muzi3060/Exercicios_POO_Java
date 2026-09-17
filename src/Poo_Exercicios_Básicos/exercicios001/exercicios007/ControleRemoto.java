package Poo_Exercicios_Básicos.exercicios001.exercicios007;
import java.util.Scanner;

public class ControleRemoto {
    private boolean ligado;
    private int canal;
    private int volume;

    public ControleRemoto() {
        this.ligado = false;
        this.canal = 1;
        this.volume = 2;
    }

    public void menu() {
        Scanner leitor = new Scanner(System.in);

        while (true) {

            if (!this.ligado) {
                System.out.println("\u001b[31m" + "A TV está desligada" + "\u001b[0m");
                System.out.println("< CH1 > - VOL2 + ");
            } else {
                System.out.println("CANAL = " + this.canal);
                System.out.println("VOLUME = " + this.volume);
                System.out.println("< CH1 > - VOL2 + ");
            }

            String opcao = leitor.next();

            switch (opcao) {
                case "@" -> this.ligado = !this.ligado;

                case "<" -> {
                    if (this.ligado) {
                        if (this.canal <= 1) {
                            this.canal = 5;
                        } else {
                            this.canal--;
                        }
                    }
                }

                case ">" -> {
                    if (this.ligado) {
                        if (this.canal >= 5) {
                            this.canal = 1;
                        } else {
                            this.canal++;
                        }
                    }
                }

                case "-" -> {
                    if (this.ligado) {
                        if (this.volume > 0) {
                            this.volume--;
                        }
                    }
                }

                case "+" -> {
                    if (this.ligado) {
                        if (this.volume < 5) {
                            this.volume++;
                        }
                    }
                }
            }
        }
    }
}
