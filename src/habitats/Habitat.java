package habitats;

enum EstadoHabitat {
    LIMPIO, SUCIO, SINCOMIDA, CONCOMIDA, DAÑADO, MANTENIDO, MANTENIMIENTO;
}

public class Habitat {
    private EstadoHabitat estado;

    public Habitat(EstadoHabitat estado) {
        this.estado = estado;
    }

    public EstadoHabitat getEstado() {
        return estado;
    }

    public void alimentar() {
        if (estado == EstadoHabitat.SINCOMIDA) {
            estado = EstadoHabitat.CONCOMIDA;
            System.out.println("El hábitat ha sido reabastecido.");
        } else {
            System.out.println("El hábitat ya tiene comida.");
        }
    }

    public void reparar() {
        if (estado == EstadoHabitat.DAÑADO) {
            estado = EstadoHabitat.MANTENIDO;
            System.out.println("El hábitat ha sido reparado.");
        } else {
            System.out.println("El hábitat no necesita reparaciones.");
        }
    }

    public void limpiar() {
        if (estado == EstadoHabitat.SUCIO) {
            estado = EstadoHabitat.LIMPIO;
            System.out.println("El hábitat ha sido limpiado.");
        } else {
            System.out.println("El hábitat ya está limpio.");
        }
    }

    public void revisarEstado() {
        System.out.println("El estado actual del hábitat es: " + estado);
    }
}