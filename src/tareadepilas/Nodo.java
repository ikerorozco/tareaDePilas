/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareadepilas;

/**
 *
 * @author ikero
 */
public class Nodo <T>{
    
    T dato;
    Nodo<T> Siguiente;

    public Nodo(T valor) {
        
        dato=valor;
        Nodo siguiente = null;
        
        
    }

    public Nodo(T dato, Nodo<T> Siguiente) {
        this.dato = dato;
        this.Siguiente = Siguiente;
    }
    
    
}
