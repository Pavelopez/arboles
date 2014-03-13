/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arbolbinario;

/**
 *
 * @author Alumnos
 */
public class PilaArreglo {
    Integer [] pila= new Integer[2];
    int tope = 0;
    
    void push( Integer dato){
        if(tope< pila.length){
            pila[tope]= dato;
            tope++;
        }else{
            System.out.println("la pila está llena");
        }
    }
    
    public Integer pop(){
        Integer resultado=0;
        if(tope>0){
            resultado= pila[tope-1];
            tope--;
        }else{
            System.out.println("La pila está vacía");
        }
        return resultado;
    }
}
