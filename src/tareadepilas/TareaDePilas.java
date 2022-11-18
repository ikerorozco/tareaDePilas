/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareadepilas;

/**
 *
 * @author ikero
 */
public class TareaDePilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Nodo<Integer> numero1 =new Nodo(10, null);
        Nodo<Integer> numero2 =new Nodo(20, null);
        Nodo<Integer> numero3 =new Nodo(14, null);
        Nodo<Integer> numero4 =new Nodo(17, null);
        Nodo<Integer> numero5 =new Nodo(43, null);
        Nodo<Integer> numero6 =new Nodo(76, null);
        
        Pila<Integer> pilaInicial=new Pila();
        
        System.out.println("La pila esta vacia? "+pilaInicial.isEmpty());
        System.out.println("El tamaño de la pila es: "+pilaInicial.length());
        
        pilaInicial.push(numero1);
        pilaInicial.push(numero2);
        pilaInicial.push(numero3);
        pilaInicial.push(numero4);
        pilaInicial.push(numero5);
        pilaInicial.push(numero6);
        
        System.out.println("El tamaño de la pila es: "+pilaInicial.length());
        
        System.out.println("El ultimo valor ingresado fue: "+pilaInicial.peek());
        
        pilaInicial.pop();
        
        System.out.println("El ultimo valor ingresado fue: "+pilaInicial.peek());
        
        System.out.println("La pila quedo de la siguiente forma: "+pilaInicial.toString());

        
        
        /*           
  
    toString() */
    }
    
}
