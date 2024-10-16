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
public class LDNormal extends LDoble{
    public LDNormal(){
        super();
    }
    public boolean esVacia(){
        return super.esVacia();
    }
    public void addBegin(Object dato){
        NodoD ndAux = new NodoD();
        ndAux.setDato(dato);
        if(!esVacia()){
            ndAux.setAfter(p);
            p.setBefore(ndAux);
        }
        p = ndAux;
    }
    public void addEnd(Object dato){
        NodoD ndAux1 = new NodoD();
        NodoD ndAux2;
        ndAux1.setDato(dato);
        if(esVacia())
            p = ndAux1;
        else{
            ndAux2 = p;
            while(ndAux2.getAfter() != null){
                ndAux2 = ndAux2.getAfter();
            }
            ndAux1.setBefore(ndAux2);
            ndAux2.setAfter(ndAux1);
        }
    }
    public Object dltBegin(){
        Object dato = null;
        NodoD ndAux;
        if(esVacia())
            System.out.println("Lista Vacia");
        else{
            dato = p.getDato();
            if(p.getAfter() == null)
                p = null;
            else{
                ndAux = p;
                p = p.getAfter();
                p.setBefore(null);
            }
        }
        return dato;
    }
    public Object dltEnd(){
        NodoD ndAux;
        Object dato = null;
        if(esVacia())
            System.out.println("Lista Vacia");
        else{
            ndAux = p;
            while (ndAux.getAfter() != null) {
                ndAux = ndAux.getAfter();
            }
            dato = ndAux.getDato();
            if(ndAux == p)
                p = null;
            else{
                (ndAux.getBefore()).setAfter(null);
            }
        }
        return dato;
    }
    public int nElem(){
        int nroElem = 0;
        NodoD ndAux;
        if(!esVacia()){
            ndAux = p;
            nroElem = 1;
            while (ndAux.getAfter() != null){
                ndAux = ndAux.getAfter();
                nroElem++;
            }
        }
        return nroElem;
    }
    public void mostrar(){
        int nroElem = nElem();
        Object dato;
        for (int i = 1; i <= nroElem; i++){
            dato = dltBegin();
            System.out.println("\t"+dato);
            addEnd(dato);
        }
    }
}
