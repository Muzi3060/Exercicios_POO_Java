package Poo_Exercicios_Abastração_Herança.Exercicio001.Exercicio004;

public class Main {

    public static void main (String[] args) {
        Horista horista = new Horista("Paulo", 12, 200);
        Mensalista mensalista = new Mensalista("Amanda", 9500);

        horista.analisarSalario();
        mensalista.analisarSalario();
    }
}
