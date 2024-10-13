package Listas;


public abstract class LSimple {
    protected NodoE p;
    public LSimple(){
        p = null;
    }
    public boolean esVacia(){
        return (p == null);
    }
    public abstract void addPrimero(Object dato);
    public abstract void addFin(Object dato);
    public abstract Object dltPrimero();
    public abstract Object dltFin();
    public abstract int nElem();
}