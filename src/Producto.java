abstract public class Producto implements IProducto{
    private int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        // TODO Auto-generated method stub
        return precio;
    }
    
}
