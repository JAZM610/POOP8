/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Clase que representa un cuadrilátero y extiende de la clase Poligono.
 * <p>
 * Esta clase proporciona métodos para calcular el área y el perímetro de un
 * cuadrilátero, así como para obtener y establecer sus propiedades.
 * </p>
 * 
 * @author jazm6
 */
public class Cuadrilatero extends Poligono{
    private int alfa;
    private int beta;
    private float a;
    private float b;
    private float c;
    private float d;
    private float base;
    private float altura;

    /**
     * Constructor por defecto de la clase Cuadrilatero.
     */
    public Cuadrilatero() {
        this.alfa = 0;
        this.beta = 0;
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.base = 0.0f;
        this.altura = 0.0f;
    }
    
    /**
     * Constructor con parámetros para inicializar un cuadrilátero con valores específicos.
     * 
     * @param alfa el ángulo alfa del cuadrilátero
     * @param beta el ángulo beta del cuadrilátero
     * @param a la longitud del lado a del cuadrilátero
     * @param b la longitud del lado b del cuadrilátero
     * @param c la longitud del lado c del cuadrilátero
     * @param d la longitud del lado d del cuadrilátero
     * @param base la base del cuadrilátero
     * @param altura la altura del cuadrilátero
     */
    public Cuadrilatero(int alfa, int beta, float a, float b, float c, float d, float base, float altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.base = base;
        this.altura = altura;
    }

    /**
     * Obtiene el valor del ángulo alfa.
     * 
     * @return el ángulo alfa
     */
    public int getAlfa() {
        return alfa;
    }

    /**
     * Establece el valor del ángulo alfa.
     * 
     * @param alfa el nuevo valor del ángulo alfa
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    /**
     * Obtiene el valor del ángulo beta.
     * 
     * @return el ángulo beta
     */
    public int getBeta() {
        return beta;
    }

    /**
     * Establece el valor del ángulo beta.
     * 
     * @param beta el nuevo valor del ángulo beta
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }

    /**
     * Obtiene la longitud del lado a.
     * 
     * @return la longitud del lado a
     */
    public float getA() {
        return a;
    }

    /**
     * Establece la longitud del lado a.
     * 
     * @param a la nueva longitud del lado a
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * Obtiene la longitud del lado b.
     * 
     * @return la longitud del lado b
     */
    public float getB() {
        return b;
    }

    /**
     * Establece la longitud del lado b.
     * 
     * @param b la nueva longitud del lado b
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * Obtiene la longitud del lado c.
     * 
     * @return la longitud del lado c
     */
    public float getC() {
        return c;
    }

    /**
     * Establece la longitud del lado c.
     * 
     * @param c la nueva longitud del lado c
     */
    public void setC(float c) {
        this.c = c;
    }

    /**
     * Obtiene la longitud del lado d.
     * 
     * @return la longitud del lado d
     */
    public float getD() {
        return d;
    }

    /**
     * Establece la longitud del lado d.
     * 
     * @param d la nueva longitud del lado d
     */
    public void setD(float d) {
        this.d = d;
    }

    /**
     * Obtiene la base del cuadrilátero.
     * 
     * @return la base del cuadrilátero
     */
    public float getBase() {
        return base;
    }

    /**
     * Establece la base del cuadrilátero.
     * 
     * @param base la nueva base del cuadrilátero
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * Obtiene la altura del cuadrilátero.
     * 
     * @return la altura del cuadrilátero
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Establece la altura del cuadrilátero.
     * 
     * @param altura la nueva altura del cuadrilátero
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Calcula el perímetro del cuadrilátero.
     * 
     * @return el perímetro del cuadrilátero
     */
    @Override
    public float perimetro() {
        return a + b + c + d;
    }

    /**
     * Calcula el área del cuadrilátero.
     * 
     * @return el área del cuadrilátero
     */
    @Override
    public float area() {
        return base * altura;
    }
    
    /**
     * Devuelve una representación en forma de cadena del cuadrilátero.
     * 
     * @return una cadena que representa al cuadrilátero
     */
    @Override
    public String toString() {
        return "Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", base=" + base + ", altura=" + altura + '}';
    }
    
}
