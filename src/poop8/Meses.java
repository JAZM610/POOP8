/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poop8;

/**
 * Interfaz que define constantes relacionadas con los meses del año.
 *
 * @author jazm6
 */
public interface Meses {
    /**
     * Constantes que representan cada mes del año como un número entero.
     */
    int UNO = 1, DOS = 2, TRES = 3, CUATRO = 4, CINCO = 5, SEIS = 6, SIETE = 7, OCHO = 8, NUEVE = 9, DIEZ = 10, ONCE = 11, DOCE = 12;

    /**
     * Arreglo de cadenas que contiene los nombres de los meses del año.
     * El primer elemento es una cadena vacía para que los meses vayan del índice 1 al 12.
     */
    String[] MESES = {
        "", "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
    };
}
