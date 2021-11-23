package aula14;

public class Container implements Comparable<Container> {
    private int id;
    private String descricao;
    private String pais;
    private boolean isDangerous;

    // Constructor
    public Container(int id, String descricao, String pais, boolean isDangerous) {
        this.id = id;
        this.descricao = descricao;
        this.pais = pais;
        this.isDangerous = isDangerous;
    }

    @Override
    public int compareTo(Container ct) {
        if(this.id == ct.id){
            return 0;
        } else if(this.id < ct.id){
            return -1;
        } else {
            return 1;
        }
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isDangerous() {
        return isDangerous;
    }

    public void setDangerous(boolean isDangerous) {
        this.isDangerous = isDangerous;
    }
}