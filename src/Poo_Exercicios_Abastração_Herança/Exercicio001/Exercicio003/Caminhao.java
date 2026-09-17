package Poo_Exercicios_Abastração_Herança.Exercicio001.Exercicio003;

public class Caminhao extends Transporte {
    private final double fator = 1.20;


    public Caminhao(int distancia) {
        super(distancia);
        this.calcularFrete();
    }

    @Override
    public void calcularFrete() {
        if (distancia >= 50) {
             this.frete = distancia * fator;
        } else {
            System.out.println("Distância mínima para frete de caminhão é de 50 km.");
        }
    }

    public double getFrete() {
        return frete;
    }
}
