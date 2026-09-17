package Poo_Exercicios_Abastração_Herança.Exercicio001.Exercicio002;

public class Cafe extends BebidaQuente {

    @Override
    public void misturar() {
        System.out.println("2. Passando água pressurizada pelo pó de café moído.");
    }

    @Override
    public void servir() {
        System.out.println("3. Servindo em xícara pequena.");
    }
}

