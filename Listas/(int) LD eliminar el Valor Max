public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LDNormal l1 = new LDNormal();
        
        l1.leer();
        l1.mostrar();
        
        ejercicio(l1);
    }
    public static void ejercicio(LDNormal l1){
        int nroElem = l1.nElem();
        boolean sw = true;
        int j=0;
        Object max = l1.dltBegin();
        l1.addEnd(max);
        Object ele;
        for(int i=2; i<= nroElem; i++){
            ele = l1.dltBegin();
            if((int)ele > (int)max)
                max = ele;
            l1.addEnd(ele);
        } // Encontrando el valor Maximo
        while(sw){
            ele = l1.dltBegin();
            j++; // <--- Valor de J=2
            if((int)ele != (int)max) // Comp. cada Dato con el Valor Maximo
                l1.addEnd(ele); // Distinto
            else 
                sw = false; // Igual
        }
        while(j < nroElem){
            l1.addEnd(l1.dltBegin());
            j++;
        }
        l1.mostrar();
    }
    
}
