/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author crist
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Nodo {
     int data;
    Nodo left, right;

    public Nodo(int item) {
        data = item;
        left = right = null;
    }
}
class arbolBinario {
    Nodo root;

    public arbolBinario() {
        root = null;
    }

 public void preOrder(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.data + " ");
            preOrder(nodo.left);
            preOrder(nodo.right);
        }
    }
public void inOrder(Nodo nodo) {
        if (nodo != null) {
            inOrder(nodo.left);
            System.out.print(nodo.data + " ");
            inOrder(nodo.right);
        }
    }
public void postOrder(Nodo node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
}
}
        


    

    

