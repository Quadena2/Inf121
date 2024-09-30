public class CCircular extends Cola{
  public CCircular(int capacidad){
    super(capacidad);
  }
  public int nElem(){
    return ((fin-ini+max)%max);
  }
  public boolean esLlena(){
    return (nElem()==max-1);
  }
  public boolean esVacia(){
    return (ini == fin);
  }
  public void adicionar(Object objX){
    if(esLlena())
      System.out.println("Imposible adicionar, Cola Circular llena");
    else{
      fin = (fin+1)%max;
      v[fin] = objX;
    }
  }
  public Object eliminar(){
    Object objAux = null;
    if(esVacia())
      System.out.println("Cola Circular Vacia");
    else{
      ini = (ini+1)%max;
      objAux = v[ini];
    }
    return objAux;
  }
  public void mostrar(){
    for(int i=1; i<= nElem(); i++){
      Object objAux;
      objAux = eliminar();
      // salida del objeto -> objAux.mostrar();
      adicionar(objAux);
    }
  }
}