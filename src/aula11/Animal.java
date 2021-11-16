package aula11;

public abstract class Animal {
    private String name;
    private int idade;

    public Animal(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    public void emitirSom(){
        System.out.println("Som padrão");
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}