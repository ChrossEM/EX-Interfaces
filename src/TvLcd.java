public class TvLcd extends Electronico {
    protected int Pulgada;

    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.Pulgada = pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio()*0.8;
    }

    public int getPulgada() {
        return Pulgada;
    }
    
    
}
