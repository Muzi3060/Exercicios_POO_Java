package Poo_Exercicios_Polimorfismo.Exercicios001.Exercicios006;

public class Email extends Validador {

    public Email(String email) {
        super(email);
        validar(email);
    }

    //* deve conter uma única @
    // Usuário pode conter letras, números e alguns simbolos
    // Os domínios contém pontos
    // o TLD encerra com ponto e pelo menos 2 letras.

    @Override
    public void validar(String valor) {
        if (!valor.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) { // Regex para validar email com uma única @, domínios com pontos e TLD com pelo menos 2 letras
            throw new IllegalArgumentException("Email inválido, deve conter uma única @, domínios com pontos e TLD com pelo menos 2 letras.");
        }
        System.out.println("Email válido.");
    }

}
