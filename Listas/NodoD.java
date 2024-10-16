/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author estudiante
 */
public class NodoD {
    private Object dato;
    private NodoD before, after;
    
    public NodoD(){
        before = null;
        after = null;
    }

    public Object getDato() {
        return dato;
    }

    public NodoD getBefore() {
        return before;
    }

    public NodoD getAfter() {
        return after;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public void setBefore(NodoD before) {
        this.before = before;
    }

    public void setAfter(NodoD after) {
        this.after = after;
    }
    
}
