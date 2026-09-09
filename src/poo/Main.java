// Define o pacote (pasta organizacional) ao qual essa classe pertence
package poo;

// Classe Main - classe responsável por executar o programa
// Toda aplicação Java precisa de uma classe com o método main()
public class Main {

    // Método main: é o ponto de ENTRADA do programa
    // Quando você executa o programa, a JVM (Java Virtual Machine) procura por esse método
    // "public" = pode ser chamado de qualquer lugar
    // "static" = pertence à classe, não a objetos específicos
    // "void" = não retorna nada
    // "String[] args" = pode receber argumentos da linha de comando
    public static void main(String[] args) {

        // ===== CRIANDO OBJETOS (INSTÂNCIAS) =====

        // Cria o primeiro objeto do tipo Pessoa
        // "new Pessoa(...)" chama o construtor, criando um novo objeto
        // Os 3 valores passados são: nome, idade, email
        Pessoa pessoa1 = new Pessoa("Carlos", 25, "carlos@gmail.com");

        // Cria o segundo objeto do tipo Pessoa
        // pessoa2 é INDEPENDENTE de pessoa1 - mudanças em uma não afetam a outra
        Pessoa pessoa2 = new Pessoa("Maria", 30, "maria@gmail.com");

        // ===== MODIFICANDO ATRIBUTOS COM SETTERS =====

        // Muda a idade de pessoa1 de 25 para 19
        // O setter valida: se idade >= 0, muda; senão, não muda
        pessoa1.setIdade(27);

        // Muda o nome de pessoa1 de "Carlos" para "João"
        // O setter valida: se nome não é nulo e não está vazio, muda
        pessoa1.setNome("João");

        // Muda o email de pessoa1 para um novo email
        // O setter valida: se email não é nulo e não está vazio, muda
        pessoa1.setEmail("joao@gmail.com");

        // ===== IMPRIMINDO INFORMAÇÕES COM GETTERS E MÉTODOS =====

        // Chama o método apresentar() de pessoa1
        // Esse método retorna uma String formatada com TODOS os dados
        // Depois imprime no console
        // Saída esperada: "João tem 19 anos e seu email é joao@gmail.com"
        System.out.println(pessoa1.apresentar());

        // Chama o método apresentar() de pessoa2
        // Saída esperada: "Maria tem 30 anos e seu email é maria@gmail.com"
        System.out.println(pessoa2.apresentar());

    }
}