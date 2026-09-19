package Poo_Exercicios_Encapsulamento.Exercicios001.Exercicios006;

public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", 2000, "ADS");

        System.out.println("Nome: " + aluno.getNome()); // Pega o nome do aluno

        aluno.setNascimento(2000); // Altera o ano de nascimento do aluno

        System.out.println(aluno.getIdade()); // Pega a idade do aluno (ano atual - ano de nascimento)

        aluno.addCurso("moda"); // Adiciona um novo curso à lista de cursos oficiais do aluno (Podendo ser escrito em minusculo)

        aluno.setCurso("CC"); // Altera o curso do aluno para o novo curso adicionado (Contanto que esteja na lista de cursos oficiais)

        System.out.println("Curso: " + aluno.getCurso()); // Pega o curso do aluno
    }

}
