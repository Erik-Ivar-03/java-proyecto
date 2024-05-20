import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
}

public class ProductoJugueteria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Producto> inventario = new HashMap<>();

        // Agregar productos al inventario
        inventario.put("Peluches de perrito", new Producto("Peluches de perrito", 29.30, 61));
        inventario.put("Perrito armable", new Producto("Perrito armable", 29.30, 20));
        inventario.put("Lego Batman", new Producto("Lego Batman", 19.90, 15));
        inventario.put("Monopolio", new Producto("Monopolio", 12.99, 10));
        inventario.put("Marvel legends", new Producto("Marvel legends", 120, 30));

        inventario.put("Muñeca Barbie", new Producto("Muñeca Barbie", 15.50, 20));
        inventario.put("Lego Ninjago", new Producto("Lego Ninjago", 50, 20));
        inventario.put("Uno", new Producto("Uno", 15, 50));
        inventario.put("Hot Wheels", new Producto("Hot Wheels", 13, 30));
        inventario.put("Juego de aros", new Producto("Juego de aros", 14, 31));
        inventario.put("Maracas de Animalitos", new Producto("Maracas de Animalitos", 10, 27));
        inventario.put("Llavero de actividades", new Producto("Llavero de actividades", 23, 24));
        inventario.put("Cubo de Actividades", new Producto("Cubo de Actividades", 44.90, 23));
        inventario.put("Play-Doh", new Producto("Play-Doh", 15, 27));
        inventario.put("Lego Star Wars", new Producto("Lego Star Wars", 80, 43));

        double totalAPagar = 0;

        System.out.println("Bienvenido a la juguetería");

        while (true) {
            // Mostrar opciones de productos
            System.out.println("\nOpciones de productos:");
            int i = 1;
            for (Map.Entry<String, Producto> entry : inventario.entrySet()) {
                System.out.println(i + " - " + entry.getKey() + " - Precio: $" + entry.getValue().precio + " - Stock: " + entry.getValue().stock);
                i++;
            }
            System.out.println("0 - Salir");

            System.out.println("\nSeleccione un producto:");
            int opcion = scanner.nextInt();

            if (opcion == 0) {
                break;
            }

            switch (opcion) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    String productoSeleccionado = (String)inventario.keySet().toArray()[opcion - 1];
                    Producto producto = inventario.get(productoSeleccionado);

                    System.out.println("¿Cuántas unidades desea comprar?");
                    int cantidad = scanner.nextInt();

                    if (cantidad > producto.stock) {
                        System.out.println("No hay suficiente stock disponible.");
                        break;
                    }

                    totalAPagar += producto.precio * cantidad;
                    producto.stock -= cantidad;
                    System.out.println("Producto agregado al carrito.");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }

            scanner.nextLine(); // Limpiar el buffer del scanner
        }

        System.out.println("El monto total a pagar es: $" + totalAPagar);
        scanner.close();
    }
}
