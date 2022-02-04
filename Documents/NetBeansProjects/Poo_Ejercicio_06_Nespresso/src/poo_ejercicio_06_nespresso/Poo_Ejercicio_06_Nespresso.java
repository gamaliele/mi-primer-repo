/*
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package poo_ejercicio_06_nespresso;

import Atributos.Cafetera;
import Servicios.Metodos;
import java.awt.BorderLayout;


public class Poo_Ejercicio_06_Nespresso {

    public static void main(String[] args) {
        
        Metodos S1=new Metodos();
        Cafetera C1= new Cafetera();
        System.out.println(C1);
        S1.llenarCafetera(C1);
        System.out.println(C1);
        S1.servirTaza(C1);
        System.out.println(C1);
        S1.vaciarCafetera(C1);
        System.out.println(C1);
        S1.agregarCafe(C1);
        System.out.println(C1);
    
    
    
    }
    
}
