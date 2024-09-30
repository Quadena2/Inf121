public abstract class Cola {
  protected int ini, fin, max;
  protected Object v[];

  public Cola(int capacidad) {
    this.max = capacidad;
    this.v = new Object[capacidad + 1];
    this.ini = 0;
    this.fin = 0;
  }

  abstract boolean esLlena();

  abstract boolean esVacia();

  abstract void adicionar(Object objX);

  abstract void mostrar();

  abstract Object eliminar();

  abstract int nElem();
}