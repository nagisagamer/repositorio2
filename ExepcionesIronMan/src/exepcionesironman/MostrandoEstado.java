import exepcionesironman.Armadura;
import exepcionesironman.Dispositivo;
import exepcionesironman.Generador;
import exepcionesironman.Consola;
import java.util.Random;

public class MostrandoEstado extends Armadura {

    private float cargaReactorMaxima;
    private Consola consola;

    public MostrandoEstado(String colorPrimario, String colorSecundario, int resistencia) {
        super(colorPrimario, colorSecundario, resistencia);
        this.cargaReactorMaxima = 100.0f;
        this.consola = new Consola();
    }

    public void mostrarEstado() {
        System.out.println("Estado de la Armadura:");
        System.out.println("Color Primario: " + colorPrimario);
        System.out.println("Color Secundario: " + colorSecundario);
        System.out.println("Resistencia: " + resistencia);
        System.out.println("Salud: " + salud);
        System.out.println("Estado del generador: " + (generador.estaDanado() ? "Dañado" : "Sano"));
        System.out.println("Estado de la consola: " + (consola.estaDanado() ? "Dañado" : "Sano"));
        System.out.println("Estado del sintetizador: " + (sintetizador.estaDanado() ? "Dañado" : "Sano"));
    }

    public void informarEstadoBateria() {
        float porcentaje = (cargaReactor / cargaReactorMaxima) * 100;
        System.out.println("Estado de la Batería: " + porcentaje + "%");
    }

    public void informarEstadoReactor() {
        double cargaReactorPorcentaje = (cargaReactor / cargaMaximaReactor) * 100;
        double cargaReactorLitros = cargaReactor * 1000;
        double cargaReactorKilogramos = cargaReactor * 2.2;

        System.out.println("Estado del Reactor:");
        System.out.println("Carga en porcentaje: " + cargaReactorPorcentaje + "%");
        System.out.println("Carga en litros: " + cargaReactorLitros + " litros");
        System.out.println("Carga en kilogramos: " + cargaReactorKilogramos + " kg");
    }

    public void realizarAccion() {
        Random random = new Random();
        if (!generador.estaDanado() && random.nextDouble() <= 0.3) {
            generador.setDanado(true);
            System.out.println("¡El generador se ha dañado!");
        }

        if (!consola.estaDanado() && random.nextDouble() <= 0.3) {
            consola.setDanado(true);
            System.out.println("¡La consola se ha dañado!");
        }

        if (!sintetizador.estaDanado() && random.nextDouble() <= 0.3) {
            sintetizador.setDanado(true);
            System.out.println("¡El sintetizador se ha dañado!");
        }
    }

    public void repararDanios() {
        Random random = new Random();
        if (generador.estaDanado() && random.nextDouble() <= 0.4) {
            generador.setDanado(false);
            System.out.println("¡El generador ha sido reparado!");
        }

        if (consola.estaDanado() && random.nextDouble() <= 0.4) {
            consola.setDanado(false);
            System.out.println("¡La consola ha sido reparada!");
        }

        if (sintetizador.estaDanado() && random.nextDouble() <= 0.4) {
            sintetizador.setDanado(false);
            System.out.println("¡El sintetizador ha sido reparado!");
        }
    }

    public boolean estaDanado() {
        return generador.getNivelDanio() > 0 || consola.getNivelDanio() > 0 || sintetizador.getNivelDanio() > 0;
    }

    public float getCargaReactorMaxima() {
        return cargaReactorMaxima;
    }

    public void setCargaReactorMaxima(float cargaReactorMaxima) {
        this.cargaReactorMaxima = cargaReactorMaxima;
    }

    public Consola getConsola() {
        return consola;
    }

    public void setConsola(Consola consola) {
        this.consola = consola;
    }
}
