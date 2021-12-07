package aula23;

import java.util.ArrayList;

public class ProgramaComposite implements CursoInterface {
    private String nome;
    private String descricao;
    private double desconto;

    private ArrayList<Curso> cursos;

    public ProgramaComposite(String nome, String descricao, double desconto) {
        this.nome = nome;
        this.descricao = descricao;
        this.desconto = desconto;
        this.cursos = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public double getDesconto() {
        return this.desconto;
    }

    public void addCurso(Curso curso) {
        this.cursos.add(curso);
    }

    public void removeCurso(Curso curso) {
        this.cursos.remove(curso);
    }

    public double calcularPreco(){
        double preco = 0;
        for (Curso curso : cursos) {
            preco += curso.calcularPreco();
        }
        return preco * (1 - this.desconto);
    }
}