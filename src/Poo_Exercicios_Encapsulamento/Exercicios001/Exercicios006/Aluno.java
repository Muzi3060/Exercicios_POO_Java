package Poo_Exercicios_Encapsulamento.Exercicios001.Exercicios006;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{
    private ArrayList<String> cursosOficiais;
    protected String curso;

    public Aluno(String nome, int nascimento, String curso) {
        super(nome, nascimento);
        cursosOficiais = new ArrayList<>(List.of("ADS", "CC", "ADM"));

        if (cursosOficiais.contains(curso)) {
            this.curso = curso;
        } else {
            throw new IllegalArgumentException("Curso inválido: " + curso);
        }
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if (cursosOficiais.contains(curso)) {
            this.curso = curso;
        } else {
            throw new IllegalArgumentException("Curso inválido: " + curso);
        }
    }

    public void addCurso(String curso) {
        cursosOficiais.add(curso.toUpperCase());
    }
}
