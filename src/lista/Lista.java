/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

import nodo.NodoLista;

/**
 *
 * @author andre
 */
public class Lista {

    NodoLista cabeza;

    public Lista() {
        this.cabeza = null;
    }

    public void añadir(NodoLista nodo) {
        if (this.cabeza == null) {
            this.cabeza = nodo;
        } else {
            añadirRecursivo(this.cabeza, nodo);

        }
    }

    public void añadirRecursivo(NodoLista puntero, NodoLista nodo) {
        if (puntero.getNext() == null) {
            puntero.setNext(nodo);
        } else {
            añadirRecursivo(puntero.getNext(), nodo);
        }
    }
    
}
