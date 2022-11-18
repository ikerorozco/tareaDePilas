/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareadepilas;

import javax.swing.JOptionPane;

/**
 *
 * @author ikero
 */
public class Pila <T>{
    
    Nodo<T> UltimoValor;
    int tamanio;
    String Lista = "";

    public Pila() {
        UltimoValor = null;
        tamanio=0;
    }

    
    public boolean isEmpty(){
    
        return UltimoValor==null;
    
    }
    
    public int length(){
    
        return tamanio;
    
    } 
    
    public T pop() {
    
        T aux = (T) UltimoValor;
        UltimoValor=UltimoValor.Siguiente;
        tamanio--;
        return aux;
    
    }
    
    public T peek(){
    
        return (T) UltimoValor.dato;
    
    } 
    
    public void push( Nodo<T> nodo ){
    
        Nodo<T> nuevoNodo = new Nodo(nodo);
        nuevoNodo.Siguiente = UltimoValor;
        UltimoValor=nuevoNodo;
        tamanio++;
    
    } 

    @Override
    public String toString() {
        Nodo recorrido=UltimoValor;
        while(recorrido !=null){
        
            Lista+=recorrido.dato+"\n";
            recorrido=recorrido.Siguiente;
        
        }
        JOptionPane.showMessageDialog(null, Lista);
    
        return Lista;
    }


    
    
    
}
