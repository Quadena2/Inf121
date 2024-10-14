package Listas;

public class LSCircular extends LSimple{

    public LSCircular(){
        super();
    }
    public boolean esVacia(){
        return super.esVacia();
    }
    public void addPrimero(Object dato){
        NodoS nododAux = new NodoS();
        NodoS nodoAux2;
        nododAux.setDato(dato);
        if (esVacia())
            nododAux.setSig(nododAux);
        else{
            nodoAux2 = p;
            while (nodoAux2.getSig() != p){
                nodoAux2 = nodoAux2.getSig();
            }
            nodoAux2.setSig(nododAux);
            nododAux.setSig(p);
        }
        p = nododAux;
    }
    public void addFin(Object dato){
        NodoS nodAux1 = new NodoS();
        NodoS nodAux2;
        nodAux1.setDato(dato);
        if(esVacia()){
            nodAux1.setSig(nodAux1);
            p = nodAux1;
        }
        else{
            nodAux2 = p;
            while (nodAux2.getSig() != p){
                nodAux2 = nodAux2.getSig();
            }
            nodAux2.setSig(nodAux1);
            nodAux1.setSig(p);
        }
    }
    public Object dltPrimero(){
        Object dato = null;
        NodoS nodAux1;
        if(esVacia())
            System.out.println("Lista Vacia");
        else{
            dato = p.getDato();
            nodAux1 = p;
            while (nodAux1.getSig() != p){
                nodAux1 = nodAux1.getSig();
            }
            if (p != nodAux1){
                nodAux1.setSig(p.getSig());
                p = p.getSig();
            }
            else
                p = null;
        }
        return dato;
    }
    public Object dltFin(){
        NodoS nodAux;
        NodoS nodAux2 = new NodoS();
        Object dato = null;
        if (esVacia())
            System.out.println("Lista Vacia");
        else{
            nodAux = p;
            while (nodAux.getSig() != p){
                nodAux2 = nodAux;
                nodAux = nodAux.getSig();
            }
            dato = nodAux.getDato();
            if(nodAux == p)
                p = null;
            else
                nodAux2.setSig(p);
        }
        return dato;
    }
    public int nElem(){
        int nroElem = 0;
        NodoS nodAux;
        if(!esVacia()){
            nodAux = p;
            nroElem = 1;
            while (nodAux.getSig() != p){
                nodAux = nodAux.getSig();
                nroElem++;
            }
        }
        return nroElem;
    }
    public void mostrar(){

        if (esVacia())
            System.out.println("Lista Vacia");
        else{
            int n = nElem();
            Object dato;
            for(int i=1; i<= n; i++){
                dato = dltPrimero();
                System.out.print("\t"+dato);
                addFin((Object) dato);
            }
        }
    }
}
