package PracGeneral2024.Pilas.Uno;


public class PilaLibro extends EstructuraLineal {
    protected int tope;

    public PilaLibro(int capacidad) {
        super(capacidad);
        tope = 0;
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
        //Cuaderno c1;
        PilaLibro p1 = new PilaLibro(max);
        while (!esVacia()) {
            Libro l1 = new Libro();
            l1 = (Libro) eliminar();
            l1.mostrar();
            p1.adicionar(l1);
        }
        vaciar(p1);
    }

    public void vaciar(PilaLibro pilaConDatos) {
        while (!pilaConDatos.esVacia())
            adicionar(pilaConDatos.eliminar());
    }

    public void llenar(int nroRegistro){
        for(int i=1; i<=nroRegistro; i++){
            Libro c1 = new Libro();
            c1.leer();
            adicionar(c1);
        }
    }

}
