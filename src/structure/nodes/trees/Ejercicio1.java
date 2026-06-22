package structure.nodes.trees;

import structure.nodes.Node;

public class Ejercicio1 {
    public  void insert(int[] numeros ){
        // CREAR EL ARBOL DE ENTEROS 
        BinaryTree<Integer> tree = new BinaryTree<>();

        //INSERTAR CADA NUMERO 
        for (int numero : numeros) {
            tree.add(numero);
        }

        // IMPRIMIR EL ARBOL
        tree.inOrden();
        printTree(tree.getRoot());
        
        
    }
    // METODO 

        public void printTree(Node<Integer> root){
            System.out.println("Imprimiedo el arbol");
            printTreeRecursivo(root, 0);
        }

        private void printTreeRecursivo(Node<Integer> root, int espacio) {
            if (root == null) {
           return;
         }

        espacio += 5;
        printTreeRecursivo(root.getRight(), espacio);
        System.out.println();

       for (int i = 0; i < espacio; i++) {
        System.out.print(" ");
        }

       System.out.println(root.getValue());

       printTreeRecursivo(root.getLeft(), espacio);
           
        }

}
