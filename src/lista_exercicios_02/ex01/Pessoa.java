package lista_exercicios_02.ex01;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String nomePessoa;
    private int idade;
    private LocalDate dt_nascimento;

    public Pessoa(String nomePessoa, int day, int month, int year) {
        this.nomePessoa = nomePessoa;
        this.dt_nascimento = LocalDate.of(year, month, day);
        this.calculaIdade();
    }

    public void calculaIdade() {
        int diferencaEmAnos = (int)ChronoUnit.YEARS.between(dt_nascimento, LocalDate.now());
        this.idade = diferencaEmAnos;
    }

    public int informaIdade() {
        this.calculaIdade();
        return this.idade;
    }

    public String informaNome() {
        return this.nomePessoa;
    }

    public void ajustaDataDeNascimento(int day, int month, int year) {
        this.dt_nascimento = LocalDate.of(year, month, day);
    }
}