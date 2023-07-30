
 import entidad.Ahorcado;
import java.util.Scanner;
import service.AhorcadoService;


public class EJEX06Bpoo {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        AhorcadoService service = new AhorcadoService();
        Ahorcado juego = service.crearJuego();

        while (juego.intentos(service) > 0 && !juego.juegoTerminado()) {
            System.out.println("Ingrese una letra:");
            String letra = sc.next();
            boolean letraEncontrada = juego.buscar(service, letra);
            if (letraEncontrada) {
                System.out.println("Mensaje: La letra pertenece a la palabra");
            } else {
                System.out.println("Mensaje: La letra no pertenece a la palabra");
            }
            System.out.println("Letra ingresada: " + letra);
            service.encontradas(juego, letra);
            service.intentos(juego);
            System.out.println("----------------------------------------------");
        }
} }
