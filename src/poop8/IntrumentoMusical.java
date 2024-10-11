/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poop8;

/**
 * Interfaz que define las operaciones básicas para un instrumento musical.
 * 
 * @author jazm6
 */
public interface IntrumentoMusical {
    /**
     * Método para tocar el instrumento.
     */
    void tocar();

    /**
     * Método para obtener el tipo de instrumento.
     * 
     * @return una cadena que describe el tipo de instrumento.
     */
    String tipoDeInstrumento();

    /**
     * Método para afinar el instrumento.
     */
    void afinar();
}
