package Listas;

public class NodoE {
    private Object dato;
    private NodoE sig;

    public NodoE() {
        sig = null;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoE getSig() {
        return sig;
    }

    public void setSig(NodoE sig) {
        this.sig = sig;
    }

}