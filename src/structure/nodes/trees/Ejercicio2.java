package structure.nodes.trees;

import structure.nodes.Node;

public class Ejercicio2 {
    public void inverTree(Node<Integer> root){
        invertirRecursivo(root);
    


    }
    private void invertirRecursivo(Node<Integer> arbol) {

        if(arbol== null){
            return;
        }
        Node<Integer> aux = arbol.getLeft();
        arbol.setLeft(arbol.getRight());
        arbol.setRight(aux);

        invertirRecursivo(arbol.getLeft());
        invertirRecursivo(arbol.getRight());

    }
      
    public void printTree( Node<Integer> root){
        inverTree(root, 0);

    }
    private void inverTree(Node<Integer> actual, int nivel) {
        if(actual == null){
            return;
        }
        inverTree(actual.getRight(), nivel +1);
        for( int i= 0; i < nivel; i++){
            System.out.print("  \t   ");
        }

        System.out.println(actual.getValue());
        inverTree(actual.getLeft(), nivel+1);

    }
}

    


