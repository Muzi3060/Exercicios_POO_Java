package Poo_Exercicios_Polimorfismo.Exercicios001.Exercicios006;

public class Usuario extends Validador {

    public Usuario(String usuario) {
        super(usuario);
        validar(usuario);
    }

    //* de 5 a 20 caracteres
    // Letras minusculas
    // Números
    //* pode ter simbolo de sublinhado

    @Override
    public void validar(String valor) {
        if (!valor.matches("^[a-z0-9_]{5,20}$")) {
            throw new IllegalArgumentException("Usuário deve conter apenas letras minúsculas, números e sublinhado, com 5 a 20 caracteres.");
        }
        System.out.println("Usuário válido.");
    }

}
