/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Clase abstracta que representa un polígono.
 * <p>
 * Esta clase define la estructura básica y los métodos que deben implementar
 * las clases derivadas para calcular el área y el perímetro de un polígono.
 * </p>
 * 
 * @author jazm6
 */
public abstract class Poligono {
    
    /**
     * Constructor de la clase Poligono.
     */
    public Poligono(){
        
    }
    
    /*
    public float area(){
        return 0.0f; 
    }
    public float perimetro(){
        return 0.0f; 
    }
    */
    
    /**
     * Método abstracto que calcula el área del polígono.
     * 
     * @return el área del polígono
     */
    public abstract float area ();
    
    /**
     * Método abstracto que calcula el perímetro del polígono.
     * 
     * @return el perímetro del polígono
     */
    public abstract float perimetro();
    
    /**
     * Método que devuelve una representación en forma de cadena del polígono.
     * 
     * @return una cadena que representa al polígono
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
}
