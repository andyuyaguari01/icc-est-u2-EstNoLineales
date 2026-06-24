package structure.nodes.trees;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import structure.nodes.Node;

public class Ejercicio3 {

    public List<List<Node>> listLevels(Node root) {

        List<List<Node>> niveles = new LinkedList<>();
        if(root == null)
            return niveles;
        Queue<Node> cola = new LinkedList<>();
        cola.add(root);
        while(!cola.isEmpty()){

            int cantidad = cola.size();

            List<Node> nivelActual = new LinkedList<>();


            for(int i = 0; i < cantidad; i++){

                Node actual = cola.poll();
                nivelActual.add(actual);
                if(actual.getLeft() != null)
                    cola.add(actual.getLeft());
                if(actual.getRight() != null)
                    cola.add(actual.getRight());
            }
            niveles.add(nivelActual);
        }


        return niveles;
    }
}

