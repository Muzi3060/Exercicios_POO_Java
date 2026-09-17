package Poo_Exercicios_Abastração_Herança.Exercicio001.Exercicio003;

public class Moto extends Transporte {
    private final double fator = 0.50;


    public Moto(int distancia) {
        super(distancia);
        this.calcularFrete();
    }

    @Override
    public void calcularFrete() {
         this.frete = this.distancia * this.fator;
    }

    public double getFrete() {
        return this.frete;
    }
}
