/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop8;

/**
 * Clase principal que ejecuta el programa POOP8.
 * <p>
 * Esta clase contiene el método main que realiza varias operaciones con 
 * objetos de las clases Poligono, Triangulo, Cuadrilatero y Flauta, y 
 * también muestra el uso de una enumeración.
 * </p>
 * 
 * @author jazm6
 */
public class POOP8 {

    /**
     * Método principal que ejecuta el programa.
     * <p>
     * Este método crea instancias de diferentes clases y llama a sus métodos 
     * para demostrar su funcionalidad.
     * </p>
     * 
     * @param args los argumentos de línea de comandos
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        //Poligono poligono1 = new Poligono();
        Poligono poligono1 = new Triangulo();
        System.out.println(poligono1);
    
        Triangulo triangulo1 = new Triangulo(50, 70, 40, 20, 46, 49, 40, 20); 
        System.out.println(triangulo1);
        System.out.println("Area= "+ triangulo1.area());
        System.out.println("Permimetro= "+ triangulo1.perimetro());
        
        Cuadrilatero cuadrilatero1 = new Cuadrilatero(90, 90, 5, 10, 5, 10, 5, 10);
        System.out.println(cuadrilatero1);
        System.out.println("Area= "+ cuadrilatero1.area());
        System.out.println("Permimetro= "+ cuadrilatero1.perimetro());
        
        Poligono poligono2 = new Triangulo(); 
        System.out.println( poligono2);
        
        Triangulo triangulo2 = new Triangulo(); 
        System.out.println( triangulo2);
        poligono2 = triangulo2;
        System.out.println( poligono2);
        Cuadrilatero cuadrilatero2 = new Cuadrilatero();
        System.out.println( cuadrilatero2);
        Object object1 = new Object(); 
        System.out.println( object1);
        object1 = cuadrilatero2;
        System.out.println( object1);
        
        System.out.println(object1);
        object1 = cuadrilatero2;
        System.out.println(object1);
        Poligono poligono3 = new Cuadrilatero();
        System.out.println(poligono3);

        System.out.println("");
        System.out.println("###### IDENTIFICAR ######");
        identificarFiguras(poligono1);
        identificarFiguras(poligono2);
        identificarFiguras(poligono3);
        
        System.out.println("############## Instrumento musical #############");
        
        Flauta flauta = new Flauta();
        flauta.afinar();
        flauta.tipoDeInstrumento();
        flauta.tocar();
        
        System.out.println("############# Meses ##############");
        
        System.out.println(Meses.CUATRO);
        System.out.println(Meses.MESES[Meses.CUATRO]);
    }

    /**
     * Método que identifica el tipo de polígono.
     * <p>
     * Este método imprime en la consola si el polígono es una instancia de 
     * Triangulo o Cuadrilatero.
     * </p>
     * 
     * @param poligono el polígono a identificar
     */
    public static void identificarFiguras(Poligono poligono){
        if (poligono instanceof Triangulo) {
            System.out.println("Instancia de triangulo");
        } else if (poligono instanceof Cuadrilatero) {
            System.out.println("Instancia de cuadrilatero");
        } else {}
    }
}
