package PracGeneral2024.Pilas.Uno;

import java.util.Scanner;

public class Libro {
    Scanner sc = new Scanner(System.in);
    private String titulo, autor;
    private int nroPaginas, anoPublicacion;

    public void leer(){
        System.out.println("--- LECTURA DE DATOS DEL LIBRO ----");
        System.out.print("Ingrese el titulo: ");
        titulo = sc.nextLine();
        System.out.print("Ingrese el autor: ");
        autor = sc.nextLine();
        System.out.print("Ingrese el Numero de Paginas: ");
        nroPaginas = sc.nextInt();
        System.out.print("Ingrese el año de Publicacion: ");
        anoPublicacion = sc.nextInt();
    }
    public void mostrar(){
        System.out.println("--- DATOS DEL LIBRO ---");
        System.out.println("Titulo: "+titulo+"\nAutor: "+autor+"\nNro de Paginas: "+nroPaginas+"\nAño de Publicacion: "+anoPublicacion);
    }

    public String getAutor() {
        return autor;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }
}
