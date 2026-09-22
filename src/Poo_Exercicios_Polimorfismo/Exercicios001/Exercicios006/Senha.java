package Poo_Exercicios_Polimorfismo.Exercicios001.Exercicios006;

public class Senha extends Validador{

    public Senha(String senha) {
        super(senha);
        validar(senha);
    }

    //* pelo menos 8 caracteres
    //* pelo menos uma letra maiuscula
    //* pelo menos um simbolo

    @Override
    public void validar(String valor) {
        if (!valor.matches("^(?=.*[A-Z])(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?]).{8,}$")) {
            throw new IllegalArgumentException("Senha deve conter pelo menos um símbolo, pelo menos uma letra maiúscula e pelo menos 8 caracteres.");
        }
        System.out.println("Senha válida.");

    }

}
