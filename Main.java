import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cuenta jesus = new Cuenta("1", "Debito", 1000.0);

        print("Ingresa la descripcion de la compra");
        String descripcion = leerString();

        print("Ingresa el costo de la compra");
        Double costo = leerDouble();

        print("Ingresa la descripcion de la compra 2");
        String descripcion2 = leerString();

        print("Ingresa el costo de la compra 2");
        Double costo2 = leerDouble();

        print("Ingresa la descripcion de la compra 3");
        String descripcion3 = leerString();

        print("Ingresa el costo de la compra 3");
        Double costo3 = leerDouble();

        Compra jabon = new Compra(new Date(), descripcion, costo);
        Compra cereal = new Compra(new Date(), descripcion2, costo2);
        Compra croquetas = new Compra(new Date(), descripcion3, costo3);

        jesus.agregarCompra(jabon);
        jesus.agregarCompra(cereal);
        jesus.agregarCompra(croquetas);

        for (Compra c : jesus.getCompras()) {
            print(c.getResumen());
        }
    }

    public static void print(String s) {
        System.out.println(s);
    }

    public static String leerString() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static double leerDouble() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

}