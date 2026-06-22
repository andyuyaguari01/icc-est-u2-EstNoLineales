import structure.models.Persona;
import structure.nodes.trees.BinaryTree;
import structure.nodes.trees.Ejercicio1;
import structure.nodes.trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
        runBinaryTree();
        runEjercicios();
    }
    private static void runEjercicios(){
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] numeros = new int[] {5, 3, 7, 2, 4, 5, 8};
        ejercicio1.insert(numeros);
    } 


    private static void runBinaryTree(){
        BinaryTree<String> arbolStrings = new BinaryTree<>();
        BinaryTree<Persona> arbolPersonas = new BinaryTree<>();
        arbolPersonas.add(new Persona("Pablo", 30));
        arbolPersonas.add(new Persona("Ana", 25));
        arbolPersonas.add(new Persona("Luis", 35));
        arbolPersonas.add(new Persona("Maria", 28));
        arbolPersonas.add(new Persona("Carlos", 28));
    }
       private static void runIntTree() {
        
            // en la prueba solo va a ver estas lineas de codigo y preguntar cual es el pre orden, pos-orden, in-orden
        IntTree arbolNumeros = new IntTree();

        arbolNumeros.add(50);
        arbolNumeros.add(10);
        arbolNumeros.add(30);
        arbolNumeros.add(60);
        arbolNumeros.add(75);
        arbolNumeros.add(55);

          



        System.out.println("Esta en Pre-Order");
        arbolNumeros.preOrder();
        System.out.println("Esta en Pos-Orden");
        arbolNumeros.posOrden();

        System.out.println("Esta en InOrden");
        arbolNumeros.inOrden();
        System.out.println("Altura:" + arbolNumeros.getHeight());
        
        System.out.println("El peso del arbol es:" + arbolNumeros.getPeso());




        /*Node<Integer> node1 = new Node(50);
        Node<Integer> node2 = new Node(10);
        Node<Integer> node3 = new Node(30);*/



        /*arbolNumeros.setRoot(node1);
        node1.setRight(node2);
        node2.setLeft(node3);
        System.out.println(arbolNumeros.getRoot());
        System.out.println(arbolNumeros.getRoot().getLeft().getRight());*/




        
    }
}
    

