package productojugueteria1;

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

public class ProductoJugueteria1 {

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

        System.out.println("Bienvenido al sistema de gestión de inventario");

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1 - Vender producto");
            System.out.println("2 - Reabastecer producto");
            System.out.println("3 - Ver stock de productos");
            System.out.println("4 - Salir");

            System.out.println("Seleccione una opción:");
            try {
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer del scanner

                switch (opcion) {
                    case 1:
                        venderProducto(scanner, inventario);
                        break;
                    case 2:
                        reabastecerProducto(scanner, inventario);
                        break;
                    case 3:
                        verStockProductos(inventario);
                        break;
                    case 4:
                        System.out.println("Gracias por usar el sistema.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opción inválida. Inténtelo de nuevo.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: Entrada inválida. Inténtelo de nuevo.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }
    }

    public static void venderProducto(Scanner scanner, Map<String, Producto> inventario) {
        System.out.println("Seleccione el producto que desea vender:");
        int i = 1;
        for (Map.Entry<String, Producto> entry : inventario.entrySet()) {
            System.out.println(i + " - " + entry.getKey());
            i++;
        }
        System.out.println("0 - Volver al menú principal");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        if (opcion == 0) {
            return;
        }

        String productoSeleccionado = (String)inventario.keySet().toArray()[opcion - 1];
        Producto producto = inventario.get(productoSeleccionado);

        System.out.println("¿Cuántas unidades desea vender?");
        int cantidad = scanner.nextInt();

        if (cantidad > producto.stock) {
            System.out.println("No hay suficiente stock disponible.");
            return;
        }

        producto.stock -= cantidad;
        System.out.println("Venta realizada con éxito.");
    }

    public static void reabastecerProducto(Scanner scanner, Map<String, Producto> inventario) {
        System.out.println("Seleccione el producto que desea reabastecer:");
        int i = 1;
        for (Map.Entry<String, Producto> entry : inventario.entrySet()) {
            System.out.println(i + " - " + entry.getKey());
            i++;
        }
        System.out.println("0 - Volver al menú principal");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        if (opcion == 0) {
            return;
        }
        
        //
        String productoSeleccionado = (String)inventario.keySet().toArray()[opcion - 1];
        Producto producto = inventario.get(productoSeleccionado);

        System.out.println("¿Cuántas unidades desea añadir?");
        int cantidad = scanner.nextInt();

        producto.stock += cantidad;
        System.out.println("Reabastecimiento realizado con éxito.");
    }

    public static void verStockProductos(Map<String, Producto> inventario) {
        System.out.println("Stock de productos:");
        for (Producto producto : inventario.values()) {
            System.out.println(producto.nombre + " - Stock: " + producto.stock);
        }
    }
}