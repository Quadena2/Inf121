public class CNormal extends Cola {
  public CNormal(int capacidad) {
    super(capacidad);
  }

  public boolean esLlena() {
    return (fin == max);
  }

  public boolean esVacia() {
    return (ini == 0 && fin == 0);
  }

  public void adicionar(Object objX) {
    if (!esLlena()) {
      if (esVacia())
        ini = 1;
      fin++;
      v[fin] = objX;
    } else
      System.out.println("Imposible adicionar, cola llena");
  }

  public Object eliminar() {
    Object objAux = null;
    if (!esVacia()) {
      objAux = v[ini];
      ini++;
      if (ini > fin) {
        ini = 0;
        fin = 0;
      }
    } else
      System.out.println("Cola Vacia");
    return objAux;
  }

  public void mostrar() {
    CNormal colaAux = new CNormal(max);
    while (!esVacia()) {
      Object objAux = eliminar();
      // (Salida de datos del objeto) -> objAux.mostrar();
      colaAux.adicionar(objAux);
    }
    vaciar(colaAux);
  }

  public int nElem() {
    return (fin - ini + 1);
  }

  private void vaciar(CNormal CNconDatos) {
    while (!CNconDatos.esVacia()) {
      adicionar(CNconDatos.eliminar());
    }
  }
}