import java.util.ArrayList;
import java.util.List;

public class LibroRepository {
    private List<Libro> libros;

    public LibroRepository() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public Libro obtenerLibroPorISBN(int isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn() == isbn) {
                return libro;
            }
        }
        return null; // Libro no encontrado
    }

    public List<Libro> listarLibros() {
        return libros;
    }

    public void eliminarLibro(int isbn) {
        libros.removeIf(libro -> libro.getIsbn() == isbn);
    }
}
