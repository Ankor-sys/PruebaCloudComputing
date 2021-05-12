/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasonar;

/**
 *
 * @author SEBAS
 */
public class PruebaSonar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int variable;
        variable = retornoVariables(1,2);
        System.out.println("La suma de esos 2 numeros es: " + variable);*/
        
        anidamientoCiclos();
        
        usandoMetodos(8,2);
    }
    
    
    public static int retornoVariables(int x, int y){
    int suma;
    suma = x +y;
    return suma;
    }
    /*
    public static int retornoVariables(int x, int y){
    int suma;
    suma = x +y;
    return sum;
    }  
    */
    
    public static void anidamientoCiclos(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Posicion: [" + i + "] ["+ j + "]");
            }
        }
        
    }    
    /* EL CODIGO CON ERROR
           
    public static void anidamientoCiclos(){
        for (int k = 0; q < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Posicion: [" + i + "] ["+ j + "]");
            }
        }
        
    }
    
    */

    public static void usandoFunciones(){
        System.out.println("Ésta funcion puede mandarse a llamar desde cualquier otra funcion");
    }
    /*
    public void usandoFunciones(){
        System.out.println("Ésta funcion puede mandarse a llamar desde cualquier otra funcion");
    }   
       */
    public static void usandoMetodos(double x, double y){
        double potencia;
        potencia = Math.pow(x,y);

        System.out.println("Usando el metodo POW de la librería Math tenemos que la potencia es igual a: " + potencia);
    }
    
    /*
    public static void usandoMetodos(double x, double y){
        double potencia;
        potencia = math.pow(x,y);

        System.out.println("Usando el metodo POW de la librería Math tenemos que la potencia es igual a: " + potencia);
    }
    */
}


