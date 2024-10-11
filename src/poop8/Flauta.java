/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Clase que representa una flauta, un tipo de instrumento de viento.
 *
 * @author jazm6
 */
public class Flauta extends InstrumentoDeViento{

    /**
     * Constructor por defecto.
     */
    public Flauta() {
    }

    /**
     * Método para afinar la flauta.
     */
    @Override
    public void afinar() {
        System.out.println("Afinando flauta");
    }

    /**
     * Método para obtener el tipo de instrumento.
     * 
     * @return una cadena que describe el tipo de instrumento: "Flauta".
     */
    @Override
    public String tipoDeInstrumento() {
        System.out.println("Flauta");
        return "Flauta";
    }

    /**
     * Método para tocar la flauta.
     */
    @Override
    public void tocar() {
        System.out.println("Tocando flauta");
    }

    /**
     * Método que retorna una representación en cadena de la flauta.
     * 
     * @return una cadena que describe la flauta.
     */
    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
}
