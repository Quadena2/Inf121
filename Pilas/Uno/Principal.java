package PracGeneral2024.Pilas.Uno;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PilaLibro p1 = new PilaLibro(100);
        int nroRegistro;
        do {
            System.out.print("Ingrese el nro de Libros que desea registrar (Max 99): ");
            nroRegistro = sc.nextInt();
        } while (nroRegistro > 100 || nroRegistro < 1);

        p1.llenar(nroRegistro);
        p1.mostrar();

        // a) Determinar Cuantos libros tiene mas de 500 hojas
        //System.out.println("---------- Inciso A ----------");
        //incisoA(p1, 500);

        // b) Mover los libros de un autor en especifico al final de la pila
        sc.nextLine();
        System.out.println("---------- Inciso B ----------");
        System.out.print("Ingrese el nombre del autor: ");
        String autorX = sc.nextLine();
        incisoB(p1,autorX);
        p1.mostrar();

        // c) Ordenar la pila de Libros por el año de publicacion en orden ascendente


    }
    public static void incisoA(PilaLibro pLibro, int nroHojas){
        PilaLibro pilaAux = new PilaLibro(100);
        int sum = 0;
        while (!pLibro.esVacia()){
            Libro l1 = new Libro();
            l1 = (Libro) pLibro.eliminar();
            if(l1.getNroPaginas() >= nroHojas)
                sum++;
            pilaAux.adicionar(l1);
        }
        System.out.println("Existen "+sum+ " Libros con mas de "+nroHojas);
        pLibro.vaciar(pilaAux);
    }
    public static void incisoB(PilaLibro pLibro, String autorX){
        PilaLibro pilaAux1 = new PilaLibro(100); // pila con el mismo autorX
        PilaLibro pilaAux2 = new PilaLibro(100);
        while (!pLibro.esVacia()){
            Libro l1 = (Libro) pLibro.eliminar();
            String libroAutor = l1.getAutor();
            if (libroAutor.equals(autorX))
                pilaAux1.adicionar(l1);
            else
                pilaAux2.adicionar(l1);
        }
        pLibro.vaciar(pilaAux2);
        pLibro.vaciar(pilaAux1);
    }
    public static void incisoC(PilaLibro pLibro){
        PilaLibro pilaAux = new PilaLibro(100);
        //pilaAux.adicionar(pLibro.eliminar());
        //int sw = 0;
        while (!pLibro.esVacia()){
            Libro libro1 = new Libro();
            libro1 = (Libro) pLibro.eliminar();
            int anoLibro1 = libro1.getAnoPublicacion();

                while (!pilaAux.esVacia()){
                    Libro libro2 = new Libro();
                    libro2 = (Libro) pilaAux.eliminar();
                    int anoLibro2 = libro2.getAnoPublicacion();

                    if(anoLibro1 < anoLibro2){
                        pilaAux.adicionar(libro2);
                        pilaAux.adicionar(libro1);
                    }
                    else {
                        pLibro.adicionar(libro2);
                    }
                }

            if(pilaAux.esVacia())
                pilaAux.adicionar(libro1);
        }
        pLibro.vaciar(pilaAux);
    }
}
