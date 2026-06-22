package structure.nodes.trees;

import structure.nodes.Node;

public class IntTree {
    private Node<Integer> root;

    //constructor
    
    public IntTree() {
        this.root = null;
    }

    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> root) {
        this.root = root;
    } 
// crea el nodo y el ingresa al arbol
//dos metodos setters para el mismo atributo
    public void setRoot(Integer value){
        Node<Integer> node = new Node<Integer>(value);
        this.root = node;

    }
    // el metodo add primero crea el nodo con el valor
    //valida o pregunta si la raiz tiene valor y si no tiene raiz es igual al retorno
    // 88 este metodo es importante porque es en el se basa casi todo

    public void add(int value ){
        
        Node<Integer> node = new Node<Integer>(value);// esta linea crea el nodo
        root = addRecursivo(root, node);// llama el metodo recursivo
        

    }
    // deber debuguiar el codigo
    private Node<Integer> addRecursivo(Node<Integer> actual, Node<Integer> nodeInsertar) {
        if (actual == null) //Caso Base
            return nodeInsertar;

        if(actual.getValue() > nodeInsertar.getValue()){
            //izquierda
            actual.setLeft(addRecursivo(actual.getLeft(), nodeInsertar));

        }else{
            actual.setRight(addRecursivo(actual.getRight(), nodeInsertar));
        }
        return actual;
        
    }

    //metodo para ordenar en preOrden
    public void preOrder() {
        preOrderRecursivo(root);
    }

    private void preOrderRecursivo(Node<Integer> actual) {
        if (actual == null)
            return;
        System.out.println(actual);
        //System.out.print(actual.getValue() + " ");
        preOrderRecursivo(actual.getLeft());
        preOrderRecursivo(actual.getRight());
    }
    //Metodo para ordenar en PosOrden 
     public void posOrden() {
        posOrderRecursivo(root);
    }

    private void posOrderRecursivo(Node<Integer> actual) {
        if (actual == null)
            return;
        //System.out.print(actual.getValue() + " ");
        posOrderRecursivo(actual.getLeft());
        posOrderRecursivo(actual.getRight());
        System.out.println(actual);

    }
    //Metodo para ordenar en InOrden
    public void inOrden(){
        inOrderRecursivo(root);
    }
    private void inOrderRecursivo(Node<Integer> actual){
        if(actual == null)
            return;
        inOrderRecursivo(actual.getLeft());
        System.out.println(actual);
        inOrderRecursivo(actual.getRight());
        
    }
    public int getHeight(){
        return getHeightRecursivo(root);
    }

    private int getHeightRecursivo( Node<Integer> actual) {
        if(actual == null)
            return 0;
        int heightLeft = getHeightRecursivo(actual.getLeft());
        int heightRight = getHeightRecursivo(actual.getRight());

        int masAlto = Math.max(heightLeft,heightRight);
        return masAlto + 1 ;

       
    }
    //Peso del arbol
    public int getPeso(){
        return getPesoRecursivo(root);
    }
    private int getPesoRecursivo(Node<Integer> actual){
         if(actual == null)
            return 0;
        int heightLeft = getHeightRecursivo(actual.getLeft());
        int heightRight = getHeightRecursivo(actual.getRight());
        return heightLeft + heightRight + 1 ;
    
    }

    

}


