package Poo_Exercicios_Encapsulamento.Exercicios001;

public class Termostato {
    private double temperatura = 24;

    public String getTemperatura() {
        return temperatura + "°C";
    }

    public double setTemperatura(double temperatura) {
        if (temperatura < 10) {
            this.temperatura = 10;
        } else if (temperatura > 30) {
            this.temperatura = 30;
        } else {
            if ((temperatura * 2) % 1 != 0)  {
                System.out.println("Temperatura inválida. A temperatura deve ser um número inteiro ou meio inteiro.");
            } else {
                this.temperatura = temperatura;
            }
        }
        return this.temperatura;
    }
}
