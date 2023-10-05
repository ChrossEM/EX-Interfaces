import java.util.Date;

public class Libro extends Producto implements ILibro{
    protected Date fechaPublicacion;
    protected String autor;
    protected String titulo;
    protected String editorial;

    public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }
    @Override
    public String getAutor() {
        return autor;
    }



    @Override
    public String getEditorial() {
        return editorial;
    }



    @Override
    public Date getFechaDePublicacion() {
        return fechaPublicacion;
    }



    @Override
    public String getTitulo() {
        return titulo;
    }



    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.95;
    }

    
}
