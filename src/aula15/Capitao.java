package aula15;

public class Capitao {
    private String nome;
    private String apelido;
    private int registro;

    public Capitao(String nome, String apelido, int registro) {
        this.nome = nome;
        this.apelido = apelido;
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }


}