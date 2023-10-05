import java.util.Date;

public class Comic extends Libro{
    protected String Personaje;

    

    public Comic(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.Personaje = personaje;
    }

    public String getPersonaje() {
        return Personaje;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio() *0.85;
    }

    
}
