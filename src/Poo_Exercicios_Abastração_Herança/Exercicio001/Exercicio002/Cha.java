package Poo_Exercicios_Abastração_Herança.Exercicio001.Exercicio002;

public class Cha extends BebidaQuente {

    @Override
    public void misturar() {
        System.out.println("2. Mergulhando o sachê de ervas na água.");
    }

    @Override
    public void servir() {
        System.out.println("3. Servindo na caneca de porcelana com limão.");
    }
}
