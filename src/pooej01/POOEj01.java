/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Libro;
import Servicio.LibroService;

/**
 *
 * @author Byte Shop
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        LibroService cargar = new LibroService();
        Libro primerLibro = cargar.cargarDatos();
       
        cargar.mostrar(primerLibro);                //Acá muestro por pantalla
        
    }
    
}
