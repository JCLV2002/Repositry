import java.util.List;

public class main {
    public static void main(String[] args) {
        LibroRepository libroRepository = new LibroRepository();

        // Agregar libros
        Libro libro1 = new Libro(1, "Libro 1", "Autor 1");
        Libro libro2 = new Libro(2, "Libro 2", "Autor 2");
        libroRepository.agregarLibro(libro1);
        libroRepository.agregarLibro(libro2);

        // Recuperar un libro por ISBN
        int isbnBuscado = 1;
        Libro libroEncontrado = libroRepository.obtenerLibroPorISBN(isbnBuscado);
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado: " + libroEncontrado);
        } else {
            System.out.println("Libro no encontrado.");
        }

        // Listar todos los libros
        List<Libro> libros = libroRepository.listarLibros();
        System.out.println("Lista de libros:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }

        // Eliminar un libro por ISBN
        int isbnEliminar = 2;
        libroRepository.eliminarLibro(isbnEliminar);
        System.out.println("Libro con ISBN " + isbnEliminar + " eliminado.");

        // Listar los libros después de la eliminación
        libros = libroRepository.listarLibros();
        System.out.println("libros después de la eliminación:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}
