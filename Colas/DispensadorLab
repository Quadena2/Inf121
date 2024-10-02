/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class Dispensador {
    protected String nomProducto;
    protected CSCircular ccv;
    
    public String getNomProducto(){
        return nomProducto;
    }
    public CSCircular getCCVehiculos(){
        return ccv;
    }
    public void leer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("---- LECTURA DEL DISPESADOR -----");
        System.out.print("Ingrese el nombre del Producto a registrar: ");
        nomProducto = sc.next();
        System.out.print("Ingrese la maxima capacidad de registro del Producto"+nomProducto+": ");
        int capCCircular = sc.nextInt();
        ccv = new CSCircular(capCCircular);
        System.out.print("Cuantos vehiculos que consuman"+nomProducto+" desea registrar?: ");
        int nroVehiculos = sc.nextInt();
        for(int i=1; i<=nroVehiculos;i++){
            Vehiculo objVehiculo = new Vehiculo();
            objVehiculo.leer();
            ccv.adicionar(objVehiculo);
        }
    }
   
}
