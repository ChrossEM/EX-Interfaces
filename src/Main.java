// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       System.out.println("shits working");
       IProducto[] productos = new Producto[6];

       productos[0] = new Iphone(29, "Apple", "3G", "Negro");
       productos[1] = new Iphone(39, "Apple", "4G", "Blanco");
       productos[2] = new TvLcd(34, "Sony", 40);
       productos[3] = new Libro(18, null, "Eric Gamma", "Elementos reusables POO", "Alguna...");
       productos[4] = new Libro(14, null, "Martin Fowler", "UML Gota a Gota", "Alguna...");
       productos[5] = new Comic(5, null, "Pepo", "Condorito", "Alguna...", "Condorito");
        for (IProducto producto : productos) {

            System.out.print("Tipo de: " + producto.getClass().getName());
            System.out.print(" - ");
            System.out.print("Precio: " + producto.getPrecio());
            System.out.print(" - ");
            System.out.print("Precio final: " + producto.getPrecioVenta());

            // Para los Electronicos  ============
            if (producto instanceof IElectronico) {
                System.out.print(" - ");
                System.out.print("Fabricante: " + ((IElectronico) producto).getFabricante());

                // Para los IPhone ============
                if (producto instanceof Iphone) {
                    System.out.print(" - ");
                    System.out.print("Modelo: " + ((Iphone) producto).getModelo());
                    System.out.print(" - ");
                    System.out.print("Color: " + ((Iphone) producto).getColor());
                }

                // Para los LCD  ============
                if (producto instanceof TvLcd) {
                    System.out.print(" - ");
                    System.out.print("Pulgadas: " + ((TvLcd) producto).getPulgada());
                }
            }

            // Para los Libros  ============
            if (producto instanceof ILibro) {
                System.out.print(" - ");
                System.out.print("Titulo: " + ((ILibro) producto).getTitulo());
                System.out.print(" - ");
                System.out.print("Autor: " + ((ILibro) producto).getAutor());

                // Para los Comics  ============
                if (producto instanceof Comic) {
                    System.out.print(" - ");
                    System.out.print("Personaje: " + ((Comic) producto).getPersonaje());
                }

            }

            System.out.println();
        }
    }
}
