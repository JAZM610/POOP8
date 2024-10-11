/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Clase que representa un triángulo y extiende de la clase Poligono.
 * <p>
 * Esta clase proporciona métodos para calcular el área y el perímetro de un
 * triángulo, así como para obtener y establecer sus propiedades.
 * </p>
 * 
 * @author jazm6
 */
public class Triangulo extends Poligono{
    private int alfa;
    private int beta;
    private int gama;
    private float a; 
    private float b; 
    private float c;
    private float base; 
    private float altura;
    
    /**
     * Constructor por defecto de la clase Triangulo.
     */
    public Triangulo(){
        
    }
    
    /**
     * Constructor con parámetros para inicializar un triángulo con valores específicos.
     * 
     * @param alfa el ángulo alfa del triángulo
     * @param beta el ángulo beta del triángulo
     * @param gama el ángulo gama del triángulo
     * @param a la longitud del lado a del triángulo
     * @param b la longitud del lado b del triángulo
     * @param c la longitud del lado c del triángulo
     * @param base la base del triángulo
     * @param altura la altura del triángulo
     */
    public Triangulo(int alfa, int beta, int gama, float a, float b, float c, float base, float altura){
        this.alfa = alfa;
        this.beta = beta; 
        this.gama = gama; 
        this.a = a;
        this.b = b; 
        this.c = c;
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
     * Obtiene el valor del ángulo gama.
     * 
     * @return el ángulo gama
     */
    public int getGama() {
        return gama;
    }

    /**
     * Establece el valor del ángulo gama.
     * 
     * @param gama el nuevo valor del ángulo gama
     */
    public void setGama(int gama) {
        this.gama = gama;
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
     * Obtiene la base del triángulo.
     * 
     * @return la base del triángulo
     */
    public float getBase() {
        return base;
    }

    /**
     * Establece la base del triángulo.
     * 
     * @param base la nueva base del triángulo
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * Obtiene la altura del triángulo.
     * 
     * @return la altura del triángulo
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Establece la altura del triángulo.
     * 
     * @param altura la nueva altura del triángulo
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    /**
     * Calcula el área del triángulo.
     * 
     * @return el área del triángulo
     */
    @Override
    public float area(){
        return (base * altura) / 2;
    }
    
    /**
     * Calcula el perímetro del triángulo.
     * 
     * @return el perímetro del triángulo
     */
    @Override
    public float perimetro(){
        return base + altura; 
    }

    /**
     * Devuelve una representación en forma de cadena del triángulo.
     * 
     * @return una cadena que representa al triángulo
     */
    @Override
    public String toString() {
        return "Triangulo{" + "alfa=" + alfa + ", beta=" + beta + ", gama=" + gama + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    }
}
