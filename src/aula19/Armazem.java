package aula19;

import java.util.ArrayList;

public class Armazem {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public double calcularEspacoNecessario(){
        double total = 0.0;
        // For tradicional
        // for(int i = 0; i < this.produtos.size(); i++){
        //     total += this.produtos.get(i).calcularEspaco();
        // }

        // For each
        for(Produto produto : this.produtos){
            total += produto.calcularEspaco();
        }

        return total;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
}