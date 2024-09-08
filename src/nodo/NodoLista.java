/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodo;

/**
 *
 * @author andre
 */
public class NodoLista {

    NodoLista next;
    NodoLista back;
    String dialogo;

    public NodoLista(String dialogo) {
        this.dialogo = dialogo;
        this.next = null;
        this.back = null;
    }

    public NodoLista getNext() {
        return next;
    }

    public NodoLista getBack() {
        return back;
    }

    public void setNext(NodoLista next) {
        this.next = next;
    }

    public void setBack(NodoLista back) {
        this.back = back;
    }

}
