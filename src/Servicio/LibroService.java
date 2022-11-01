/*
 Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas.
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Byte Shop
 */
public class LibroService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro cargarDatos() {
        Libro libroCompleto = new Libro();
        
        System.out.println("Ingrese el ISBN del libro");
        libroCompleto.setISBN(leer.nextInt());
        System.out.println("Ingrese el autor del libro");
        libroCompleto.setAutor(leer.next());
        System.out.println("Ingrese el título del libro");
        libroCompleto.setTítulo(leer.next());
        System.out.println("Ingrese el número de páginas del libro");
        libroCompleto.setNumPaginas(leer.nextInt());
        
        
        return libroCompleto;
        
    }
    
    public void mostrar (Libro libroCompleto){
        
        System.out.println(libroCompleto.toString());
        
    }

}
