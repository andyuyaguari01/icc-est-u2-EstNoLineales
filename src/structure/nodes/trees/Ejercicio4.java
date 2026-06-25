package structure.nodes.trees;
import structure.nodes.Node;


public class Ejercicio4 {

    public int maximoDepth(Node<Integer> root) {

        if (root == null) {
            return 0;
        }

        int profundidadIzq = maximoDepth(root.getLeft());
        int profundidadDer = maximoDepth(root.getRight());

        return Math.max(profundidadIzq, profundidadDer) + 1;
    }

}
