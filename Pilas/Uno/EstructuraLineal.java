package PracGeneral2024.Pilas.Uno;

//import PracGeneral.PILAS.Uno.Pila;

public abstract class EstructuraLineal {
    protected int max;
    protected Object v[];

    public EstructuraLineal(int capacidad) {
        max = capacidad;
        v = new Object[max];
    }

    abstract boolean esVacia();

    abstract boolean esLlena();

    abstract void adicionar(Object objeto);

    abstract Object eliminar();

    abstract void mostrar();

    //abstract void vaciar(Pila pilaAux);

    abstract int nroElementos();
}
