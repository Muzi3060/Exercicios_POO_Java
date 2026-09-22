package Poo_Exercicios_Polimorfismo.Exercicios001.Exercicios007;

public class Main {

    public static void main(String args[]) {
        Aluno aluno = new Aluno("João", "Engenharia", "3º");
        Usuario usuario = new Usuario("Maria", "murilup@gmail.com");

        Json json = new Json();

        System.out.println(json.exportar(aluno));
        System.out.println(json.exportar(usuario));

        Xml xml = new Xml();

        System.out.println(xml.exportar(aluno));
        System.out.println(xml.exportar(usuario));
    }
}
