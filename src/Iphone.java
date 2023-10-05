public class Iphone extends Electronico {
    private String Modelo;
    private String Color;
    public Iphone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.Modelo = modelo;
        this.Color = color;
    }
    
    @Override
    public double getPrecioVenta() {
        return (getPrecio() *0.9);
    }
    public String getModelo() {
        return Modelo;
    }
    public String getColor() {
        return Color;
    }
    
}
