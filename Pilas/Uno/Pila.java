
public class Pila{
    protected int tope, max;
    protected Object v[];

    public Pila(int capacidad) {
        max = capacidad;
        tope = 0;
        v = new Object[max+1];
    }

    public boolean esVacia() {
        return tope == 0;
    }

    public boolean esLlena() {
        return tope == max;
    }

    public void adicionar(Object objeto) {
        if (esLlena())
            System.out.println("Pila llena");
        else {
            tope++;
            v[tope] = objeto;
        }
    }

    public Object eliminar() {
        Object objAux = null;
        if (esVacia())
            System.out.println("Pila vacia");
        else {
            objAux = v[tope];
            tope--;
        }
        return objAux;
    }

    public int nroElementos() {
        return tope;
    }

    public void mostrar() {
        Object objAux = null;
        Pila pilaAux = new Pila(max);
        while (!esVacia()) {
            objAux = new Object();
            objAux = (Object) eliminar();
            objAux.mostrar();
            pilaAux.adicionar(objAux);
        }
        vaciar(pilaAux);
    }

    public void vaciar(Pila pilaConDatos) {
        while (!pilaConDatos.esVacia())
            adicionar(pilaConDatos.eliminar());
    }

    public void llenar(int nroRegistro){
        for(int i=1; i<=nroRegistro; i++){
            Object c1 = new Object();
            c1.leer();
            adicionar(c1);
        }
    }

}
