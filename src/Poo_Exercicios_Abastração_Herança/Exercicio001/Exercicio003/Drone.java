package Poo_Exercicios_Abastração_Herança.Exercicio001.Exercicio003;

public class Drone extends Transporte {
    private final double fator = 9.50;


    public Drone(int distancia) {
        super(distancia);
        this.calcularFrete();
    }

    @Override
    public void calcularFrete() {
        if (distancia <= 10) {
            this.frete = distancia * fator;
        } else {
            System.out.println("Distância máxima para frete de drone é de 10 km.");
        }
    }

    public double getFrete() {
        return frete;
    }
}
