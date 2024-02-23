/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg1.filas.colas.y.pilas;
//Realice el árbol de expresión y el árbol binario del laboratorio en hojas a mano y suba escaneado. 
//(Verifique la fecha de entrega para su tranquilidad). De la misma manera cree un repositorio en Github 
//que incluya la implementación de listas, pilas y colas (usando listas) y árbol binario. Indique solo la URL de dicho repositorio.

//Cristian Alejandro Melgar Ordoñez 7690 21 8342

import java.util.Scanner;import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


/**
 *
 * @author crist
 */
public class Tarea1FilasColasYPilas {
        static Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int choice;
        LinkedList<Integer> linkedList = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        arbolBinario arbolBinarioo = new arbolBinario();

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Lista ");
            System.out.println("2. Pila ");
            System.out.println("3. Cola ");
            System.out.println("4. Árbol Binario");
            System.out.println("0. Salir");
            System.out.print("Ingrese su elección: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    operacion(linkedList);
                    break;
                case 2:
                    operateStack(stack);
                    break;
                case 3:
                    operateQueue(queue);
                    break;
                case 4:
                    operacionArbolBinario(arbolBinarioo);
                    break;
                case 0:
                    System.out.println("¡Adios!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (choice != 0);
    }

    private static void operacion(LinkedList<Integer> list) {
        int option;
        do {
            System.out.println("\nOperaciones en Lista :");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Mostrar lista");
            System.out.println("0. Volver al menú principal");
            System.out.print("Ingrese su elección: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Ingrese el elemento a agregar: ");
                    int elementToAdd = scanner.nextInt();
                    list.add(elementToAdd);
                    System.out.println("Elemento agregado correctamente.");
                    break;
                case 2:
                    if (!list.isEmpty()) {
                        System.out.println("Elemento eliminado: " + list.remove());
                    } else {
                        System.out.println("La lista está vacía.");
                    }
                    break;
                case 3:
                    System.out.println("Lista: " + list);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (option != 0);
    }

    private static void operateStack(Stack<Integer> stack) {
        int option;
        do {
            System.out.println("\nOperaciones en Pila (Stack):");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Mostrar pila");
            System.out.println("0. Volver al menú principal");
            System.out.print("Ingrese su elección: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Ingrese el elemento a agregar: ");
                    int elementToAdd = scanner.nextInt();
                    stack.push(elementToAdd);
                    System.out.println("Elemento agregado correctamente.");
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        System.out.println("Elemento eliminado: " + stack.pop());
                    } else {
                        System.out.println("La pila está vacía.");
                    }
                    break;
                case 3:
                    System.out.println("Pila: " + stack);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (option != 0);
    }

    private static void operateQueue(Queue<Integer> queue) {
        int option;
        do {
            System.out.println("\nOperaciones en Cola (Queue):");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Mostrar cola");
            System.out.println("0. Volver al menú principal");
            System.out.print("Ingrese su elección: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Ingrese el elemento a agregar: ");
                    int elementToAdd = scanner.nextInt();
                    queue.add(elementToAdd);
                    System.out.println("Elemento agregado correctamente.");
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        System.out.println("Elemento eliminado: " + queue.poll());
                    } else {
                        System.out.println("La cola está vacía.");
                    }
                    break;
                case 3:
                    System.out.println("Cola: " + queue);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (option != 0);
    }

    private static void operacionArbolBinario (arbolBinario tree) {
        int option;
        do {
            System.out.println("\nOperaciones en Árbol Binario:");
            System.out.println("1. Insertar nodo");
            System.out.println("2. Recorrido preorden");
            System.out.println("3. Recorrido inorden");
            System.out.println("4. Recorrido postorden");
            System.out.println("0. Volver al menú principal");
            System.out.print("Ingrese su elección: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Ingrese el valor del nodo a insertar: ");
                    int evaluar = scanner.nextInt();
                    tree.root = insertNodo(tree.root, evaluar);
                    System.out.println("Nodo insertado correctamente.");
                    break;
                case 2:
                    System.out.print("Recorrido preorden: ");
                    tree.preOrder(tree.root);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Recorrido inorden: ");
                    tree.inOrder(tree.root);
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Recorrido postorden: ");
                    tree.postOrder(tree.root);
                    System.out.println();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (option != 0);
    }

    private static Nodo insertNode(Nodo root, int evaluar) {
        if (root == null) {
            return new Nodo(evaluar);
        }

        if (evaluar < root.data) {
            root.left = insertNode(root.left, evaluar);
        } else if (evaluar > root.data) {
            root.right = insertNode(root.right, evaluar);
        }
        return root;
    }
}
        
    

