/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas.
 */
package Entidad;

/**
 *
 * @author Byte Shop
 */
public class Libro {
    
    private int ISBN;
    private String autor;
    private String título;
    private int numPaginas;

    public Libro() {
    }

    public Libro(int ISBN, String autor, String título, int numPaginas) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.título = título;
        this.numPaginas = numPaginas;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    

    public int getISBN() {
        return ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public String getTítulo() {
        return título;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", autor=" + autor + ", t\u00edtulo=" + título + ", numPaginas=" + numPaginas + '}';
    }
    
    
    
}
