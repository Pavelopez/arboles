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
public class Arbol<T> {
    
    private Nodo<T> raiz;

    /**
     * @return the raiz
     */
    public Nodo<T> getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(Nodo<T> raiz) {
        this.raiz = raiz;
    }
    
    
    public void recorrerPreorden(Nodo<T> nodo){
        if(nodo != null){
            System.out.println(nodo.getDato());
            recorrerPreorden(nodo.getIzquierda());
            recorrerPreorden(nodo.getDerecha());
        }
    }
    
    public void recorrerInorden(Nodo<T> nodo){
        if(nodo != null){
            recorrerPreorden(nodo.getIzquierda());
            System.out.println(nodo.getDato());
            recorrerPreorden(nodo.getDerecha());
        }
    }
    
    public void recorrerPosorden(Nodo<T> nodo){
        if(nodo != null){
            recorrerPreorden(nodo.getIzquierda());
            recorrerPreorden(nodo.getDerecha());
            System.out.println(nodo.getDato());
        }
    }
    
    
}
