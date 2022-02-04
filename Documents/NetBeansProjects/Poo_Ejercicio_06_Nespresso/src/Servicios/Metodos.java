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
package Servicios;

import Atributos.Cafetera;
import java.util.Scanner;

public class Metodos {
    
    Scanner leer = new Scanner(System.in);
    
    public void llenarCafetera(Cafetera Cafeteracualquiera) {
        System.out.println("Ingrese la capacidad maxima");
        int cantidad = leer.nextInt();
        Cafeteracualquiera.setCapacidadActual(cantidad);
        Cafeteracualquiera.setCapacidadMaxima(cantidad);
    }

    public void vaciarCafetera(Cafetera Cafeteracualquiera) {
        Cafeteracualquiera.setCapacidadActual(0);
        System.out.println("Se vacio la cafetera");
    }
    
    public void agregarCafe(Cafetera Cafeteracualquiera){
        System.out.println("La cantidad actual de cafe es: "+Cafeteracualquiera.getCapacidadActual());
        System.out.println("La capacidad max es "+ Cafeteracualquiera.getCapacidadMaxima());
        System.out.println("Cuanto cafe desea agrega?");
        int cantidad=leer.nextInt();
        if (Cafeteracualquiera.getCapacidadActual()+cantidad <= Cafeteracualquiera.getCapacidadMaxima()){
            Cafeteracualquiera.setCapacidadActual(Cafeteracualquiera.getCapacidadActual()+cantidad);
            System.out.println("Se lleno la cafetera, la cafetera actual es "+Cafeteracualquiera.getCapacidadActual());
        }else{
            System.out.println("No se puede llenar ");
        } 
    }
    
    public void servirTaza(Cafetera Cafeteracualquiera) {
        System.out.println("La capacidad actual es de "+Cafeteracualquiera.getCapacidadActual());
        System.out.println("De que tamaño es la taza a llenar? ");
        int taza=leer.nextInt();
        if (taza<= Cafeteracualquiera.getCapacidadActual()){
            System.out.println("Se sirvio el cafe");
            Cafeteracualquiera.setCapacidadActual(Cafeteracualquiera.getCapacidadActual()-taza);
        }else if (taza>= Cafeteracualquiera.getCapacidadActual()){
            System.out.println("No alcanzo para llenar la taza, se sirvio lo que quedaba");
             Cafeteracualquiera.setCapacidadActual(0);
        }else {
            System.out.println("No se pudo servir el cafe");
        }
        
    }
    
 //la cantidad que quiero servir es igual o menor a la cantidad de cafe que hay (se puede servir el cafe)
// quiero servir mas cafe de lo que hay en la cafetera (se puede servir cafe),no se llena la taza
//cuando la cafetera este vacia (no hay cafe)     
}
