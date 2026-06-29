import java.util.List;
import java.util.Set;

import colletions.set.Sets;
import structure.models.Contacto;
import structure.models.Persona;
import structure.nodes.Node;
import structure.nodes.trees.BinaryTree;
import structure.nodes.trees.Ejercicio1;
import structure.nodes.trees.Ejercicio2;
import structure.nodes.trees.Ejercicio3;
import structure.nodes.trees.Ejercicio4;
import structure.nodes.trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        //runIntTree();
        //runBinaryTree();
       // runEjercicios();
        //runEjercicios2();
        //runEjercicios3();
        //runEjercicios4();
        runSets();
    }

    private static void runSets(){
        Sets sets = new Sets();
// metodo hasha Code 
        System.out.println("* hashCode:");
        Set<String> hashSet = sets.construirHashSet();
        System.out.println(hashSet);
        System.out.println("Size ="+ hashSet.size());
        System.out.println(hashSet.contains("F"));


 //Metodo linkedhashSet
         System.out.println("*  linkedHashSet:");
        Set<String> lSet = sets.construirLinkedHashSet();
        System.out.println(lSet);
        System.out.println("Size ="+ lSet.size());
        System.out.println(lSet.contains("F"));

// Metodo treeSet
        System.out.println("*  TreeSet");
        Set<String> tSet = sets.construirTreeSet();
        System.out.println(tSet);
        System.out.println("Size ="+ tSet.size());
        System.out.println(tSet.contains("F"));

// Hash de Contactos

        System.out.println("* Hash Contacto Set:");
        Set<Contacto> hCSet = sets.contruirHashSetContacto();
        System.out.println(hCSet);
        System.out.println("Size ="+ hCSet.size());
        System.out.println(hCSet.contains("F"));

// Tree Contacto set HashCode
        System.out.println("* Tree hash Code");
        Set<Contacto> tCSet = sets.construirTreeSetContacto();
        System.out.println(tCSet);
        System.out.println("Size ="+ tCSet.size());
        System.out.println(tCSet.contains("F"));



    }





    private static void runEjercicios(){
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] numeros = new int[] {5, 3, 7, 2, 4, 6, 8};
        ejercicio1.insert(numeros);
    } 
    private static void runEjercicios2(){

    
    Ejercicio2 ejercicio2 = new Ejercicio2();
    int[] numeros2 = new int[]{5, 3, 7, 2, 4, 6, 8};
    BinaryTree<Integer> tree = new BinaryTree<>();
    for(int numero : numeros2)
        tree.add(numero);
    Node<Integer> root = tree.getRoot();
    ejercicio2.inverTree(root);
    System.out.println("Arbol Invertido:");
    ejercicio2.printTree(root);
    
    }

    private static void runEjercicios3() {

    Ejercicio3 ejercicio3 = new Ejercicio3();

    int[] numeros = new int[]{5, 3, 7, 2, 4, 6, 8};

    BinaryTree<Integer> tree = new BinaryTree<>();

    for (int numero : numeros) {
        tree.add(numero);
    }

    Node<Integer> root = tree.getRoot();

    List<List<Node>> niveles = ejercicio3.listLevels(root);

    System.out.println("Niveles del árbol:");

    for (int i = 0; i < niveles.size(); i++) {
        System.out.print("Nivel " + i + ": ");

        for (Node nodo : niveles.get(i)) {
            System.out.print(nodo.getValue() + " ");
        }

        System.out.println();
    }
}
private static void runEjercicios4() {

    Ejercicio4 ejercicio4 = new Ejercicio4();

    int[] numeros = new int[]{5, 3, 7, 2, 4, 6, 8};

    BinaryTree<Integer> tree = new BinaryTree<>();

    for (int numero : numeros) {
        tree.add(numero);
    }

    Node<Integer> root = tree.getRoot();

    int profundidad = ejercicio4.maximoDepth(root);

    System.out.println("La profundidad máxima del árbol es: " + profundidad);
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
    

