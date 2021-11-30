package aula19;

// Design Pattern Singleton
// - Atributo privado estático da instância da classe;
// - Construtor privado
// - Método público estático para acesso da instância (get)

public class ProdutoFactory {
    private static ProdutoFactory instance;

    private ProdutoFactory() {}

    public static ProdutoFactory getInstance() {
        if(instance == null){
            instance = new ProdutoFactory();
        }

        return instance;
    }

    public Produto criarProduto(String tipo){
        if(tipo.equals("CAIXA10X10")){
            return new Caixa(10, 10, 10, 1);
        } else if(tipo.equals("FUTEBOL")){
            return new Bola(11, 1);
        } else if(tipo.equals("BOLATENIS")){
            return new Bola(0.32, 1);
        } else {
            return null;
        }
    }
}