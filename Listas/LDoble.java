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
public abstract class LDoble {
    protected NodoD p;
    
    public LDoble(){
        p = null;
    }
    public boolean esVacia(){
        return (p == null);
    }
    abstract void addBegin(Object dato);
    abstract void addEnd(Object dato);
    abstract Object dltBegin();
    abstract Object dltEnd();
    abstract void mostrar();
    abstract int nElem();
}
