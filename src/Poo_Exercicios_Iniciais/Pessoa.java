// Define o pacote (pasta organizacional) ao qual essa classe pertence
package Poo_Exercicios_Iniciais;

// Declara a classe Pessoa
// Uma classe é como um molde/blueprint que descreve como uma Pessoa deve ser
public class Pessoa {

    // ===== ATRIBUTOS PRIVADOS (características da Pessoa) =====
    // "private" significa que esses dados só podem ser acessados dentro dessa classe
    // Para acessar de fora, precisamos usar getters e setters

    private String nome;    // vai guardar o nome da pessoa (exemplo: "Carlos")
    private int idade;      // vai guardar a idade da pessoa (exemplo: 25)
    private String email;   // vai guardar o email da pessoa (exemplo: "carlos@gmail.com")

    // ===== CONSTRUTOR =====
    // Um construtor é um método especial que é chamado quando criamos um novo objeto
    // Ele "constrói" o objeto, inicializando os atributos com os valores que recebe
    // Tem o mesmo nome da classe: public Pessoa(...)

    public Pessoa(String nome, int idade, String email) {
        // "this" significa "esse objeto específico que está sendo criado"
        // Exemplo: se estamos criando pessoa1, "this" = pessoa1

        this.nome = nome;           // pega o valor "nome" recebido e coloca no atributo nome
        this.idade = idade;         // pega o valor "idade" recebido e coloca no atributo idade
        this.email = email;         // pega o valor "email" recebido e coloca no atributo email
    }

    // ===== MÉTODOS (comportamentos/ações que uma Pessoa pode fazer) =====

    // Método apresentar: retorna uma descrição completa da pessoa em uma frase
    public String apresentar() {
        // Junta os dados do objeto em uma frase legível
        // Exemplo: "João tem 30 anos e seu email é joao@gmail.com"
        return this.nome + " tem " + this.idade + " anos e seu email é " + this.email;
    }

    // ===== GETTERS (métodos para LER os atributos privados de forma segura) =====

    // Getter de Nome: permite ler o nome da pessoa
    public String getNome() {
        return this.nome;  // retorna o nome armazenado
    }

    // ===== SETTERS (métodos para MODIFICAR os atributos privados com validação) =====

    // Setter de Nome: permite mudar o nome, mas com validação
    public void setNome(String nome) {
        // Valida: "nome != null" = o nome não pode ser vazio/nulo
        //         "!nome.isEmpty()" = o nome não pode ser uma string vazia ""
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;  // só muda o nome se a validação passar
        }
        // Se falhar a validação, o nome não muda (fica como estava)
    }

    // Getter de Idade: permite ler a idade da pessoa
    public int getIdade() {
        return this.idade;  // retorna a idade armazenada
    }

    // Setter de Idade: permite mudar a idade, mas com validação
    public void setIdade(int idade) {
        // Valida: idade >= 0 = a idade não pode ser negativa (não pode ser -5, por exemplo)
        if (idade >= 0) {
            this.idade = idade;  // só muda a idade se for válida
        }
    }

    // Getter de Email: permite ler o email da pessoa
    public String getEmail() {
        return this.email;  // retorna o email armazenado
    }

    // Setter de Email: permite mudar o email, mas com validação
    public void setEmail(String email) {
        // Valida: "email != null" = o email não pode ser vazio/nulo
        //         "!email.isEmpty()" = o email não pode ser uma string vazia ""
        if (email != null && !email.isEmpty()) {
            this.email = email;  // só muda o email se a validação passar
        }
    }
}