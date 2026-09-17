package Poo_Exercicios_Abastração_Herança.Exercicio001.Exercicio002;

public class Leite extends BebidaQuente {

    @Override
    public void misturar() {
        System.out.println("2. Passando vapor pressurizado pelo bico do leite.");
    }

    @Override
    public void servir() {
        System.out.println("3. Servindo na caneca grande, já com café.");
    }
}
