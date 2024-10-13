package Listas;

public class LSNormal extends LSimple{
    public LSNormal(){
        super();
    }
    public boolean esVacia(){
        return (super.esVacia());
    }
    public void addPrimero(Object dato){
        NodoE nodoAux = new NodoE();
        nodoAux.setDato(dato);
        nodoAux.setSig(p);
        p = nodoAux;
    }

    public void addFin(Object dato){
        NodoE nodoAux1 = new NodoE();
        NodoE nodoAux2 = new NodoE();

        nodoAux1.setDato(dato);
        if(esVacia())
            p = nodoAux1;
        else{
            nodoAux2 = p;
            while (nodoAux2.getSig() != null){
                nodoAux2 = nodoAux2.getSig();
            }
            nodoAux2.setSig(nodoAux1);
        }
    }

    public Object dltPrimero(){
        Object datoAux = null;
        if (esVacia())
            System.out.println("Lista Vacia");
        else{
            datoAux = p.getDato();
            p = p.getSig();
        }
        return datoAux;
    }

    public Object dltFin(){
        NodoE nodoAux1 = new NodoE();
        NodoE nodoAux2 = new NodoE();
        Object datoAux = null;
        if(esVacia())
            System.out.println("Lista Vacia");
        else{
            nodoAux1 = p;
            while (nodoAux1.getSig() != null){
                nodoAux2 = nodoAux1;
                nodoAux1 = nodoAux1.getSig();
            }
            datoAux = nodoAux1.getDato();
            if(p == nodoAux1)
                p = null;
            else
                nodoAux2.setSig(null);
        }
        return datoAux;
    }

    public int nElem(){
        int num = 0;
        NodoE nodoAux = new NodoE();
        if (!esVacia()){
            nodoAux = p;
            num = 1;
            while (nodoAux.getSig() != null){
                nodoAux = nodoAux.getSig();
                num++;
            }
        }
        return num;
    }

    public void mostrar(){
        NodoE nodoAux;
        System.out.println("***** DATOS DE LA LISTA *****");
        if(esVacia())
            System.out.println("Lista Vacia");
        else{
             nodoAux = p;
             while (nodoAux != null){
                 System.out.println("\t"+nodoAux.getDato());
                 nodoAux = nodoAux.getSig();
             }
        }
    }
}
