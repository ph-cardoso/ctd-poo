package aula23;

public class Curso implements CursoInterface {
    private String nome;
    private String descricao;
    private int horasMensais;
    private int duracao;
    private double valorHora;

    public Curso(String nome, String descricao, int horasMensais, int duracao, double valorHora) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.valorHora = valorHora;
        this.horasMensais = horasMensais;
    }

    public double calcularPreco() {
        return this.duracao * this.horasMensais * this.valorHora;
    }

    public String getNome() {
        return this.nome;
    }

    public int getHorasMensais() {
        return this.horasMensais;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public double getValorHora() {
        return this.valorHora;
    }

    public String getDescricao() {
        return this.descricao;
    }
}