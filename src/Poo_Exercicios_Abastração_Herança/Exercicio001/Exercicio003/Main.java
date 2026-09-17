package Poo_Exercicios_Abastração_Herança.Exercicio001.Exercicio003;

public class Main {

    public static void main (String[] args) {
        Moto moto = new Moto(20);
        System.out.println("Frete da Moto =  R$"+ moto.getFrete());

        Drone drone = new Drone(8);
        System.out.println("Frete do Drone =  R$"+ drone.getFrete());



        Caminhao caminhao = new Caminhao(80);
        System.out.println("Frete do Caminhão =  R$"+ caminhao.getFrete());
    }
}
