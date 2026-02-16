package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentaComputadorasApp {
    public static void main(String[] args) {
            System.out.println("Bienvenido a la venta de computadoras!");
        Raton raton = new Raton("Bluetooth", "Logitech");
        Teclado teclado = new Teclado("Bluetooth", "Logitech");
        Monitor monitor = new Monitor("LG", 27.0);
        Computadora pc = new Computadora("Gamer", monitor, teclado, raton);
        //System.out.println(pc);

        Raton raton1 = new Raton("Bluetooth", "Dell");
        Teclado teclado1 = new Teclado("Bluetooth", "Dell");
        Monitor monitor1 = new Monitor("LG", 27.0);
        Computadora pc1 = new Computadora("Gamer", monitor, teclado, raton);
        //System.out.println(pc1);

        Orden orden = new Orden();
        orden.agregarComputadora(pc);
        orden.agregarComputadora(pc1);
        Orden orden1 = new Orden();
        orden1.agregarComputadora(pc);
        orden.mostrarOrden();
    }
}
