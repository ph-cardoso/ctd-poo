package aula14;

import java.util.ArrayList;
import java.util.Collections;

public class Porto {
    private ArrayList<Container> listaContainers = new ArrayList<Container>();

    public void addContainer(Container ct){
        listaContainers.add(ct);
    }

    public void showSortedList(){
        Collections.sort(listaContainers);

        listaContainers.forEach(container->
        System.out.printf("\n Id: %d\n Desc: %s\n País: %s\n sePerigoso: %s\n",container.getId(),
        container.getDescricao(), container.getPais(), container.isDangerous() ? "Sim" : "Não"));
    }

    public int countUnknowDangerousContainers(){
        int contador = 0;

        // for(int i = 0; i < listaContainers.size(); i++){
        //     // System.out.println(listaContainers.get(i).getPais().equals("Desconhecido"));
        //     if(listaContainers.get(i).isDangerous() && listaContainers.get(i).getPais().equals("Desconhecido")){
        //         contador++;
        //     }
        // }

        for (Container container : listaContainers){
            if(container.isDangerous() && container.getPais().equals("Desconhecido")){
                contador++;
            }
        }

        return contador;
    }
}