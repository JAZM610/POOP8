/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Clase que representa un instrumento de viento, implementando la interfaz InstrumentoMusical.
 * 
 * @author jazm6
 */
public class InstrumentoDeViento extends Object implements IntrumentoMusical {

    /**
     * Constructor por defecto.
     */
    public InstrumentoDeViento() {
    }

    /**
     * Método para tocar el instrumento de viento.
     * 
     * @throws UnsupportedOperationException si el método no está soportado.
     */
    @Override
    public void tocar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Método para obtener el tipo de instrumento.
     * 
     * @return una cadena que describe el tipo de instrumento.
     * @throws UnsupportedOperationException si el método no está soportado.
     */
    @Override
    public String tipoDeInstrumento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Método para afinar el instrumento de viento.
     * 
     * @throws UnsupportedOperationException si el método no está soportado.
     */
    @Override
    public void afinar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Método que retorna una representación en cadena del instrumento de viento.
     * 
     * @return una cadena que describe el instrumento de viento.
     */
    @Override
    public String toString() {
        return "InstrumentoDeViento{" + '}';
    }
}
