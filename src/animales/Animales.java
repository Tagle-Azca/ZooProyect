package animales;

import java.util.Random;
import java.util.UUID; // nota para que ni se me olvide UUID significa
//identificador único universal
enum EstadoAnimal {
    HAMBRIENTO, COMIENDO, ALIMENTADO, ENFERMO, SALUDABLE, TRATADO;
}

public class Animales {
    private String id;
    private String nombre;
    private String tipo;
    private String habitat;
    private String edad;
    private String alimentacion;
    private String salud;
    private String paisOrigen;
    private String especie;
    private EstadoAnimal estado;

    // Constructor
    public Animales(String nombre, String tipo, String habitat,
                    String edad, String alimentacion, String salud,
                    String paisOrigen, String especie) {
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.tipo = tipo;
        this.habitat = habitat;
        this.edad = edad;
        this.alimentacion = alimentacion;
        this.salud = salud;
        this.paisOrigen = paisOrigen;
        this.especie = especie;
        this.estado = generarEstadoAleatorio();  
    }

    private EstadoAnimal generarEstadoAleatorio() {
        Random random = new Random();
        int randomEstado = random.nextInt(5); 
        switch (randomEstado) {
            case 0:
                return EstadoAnimal.HAMBRIENTO;
            case 1:
                return EstadoAnimal.COMIENDO;
            case 2:
                return EstadoAnimal.ENFERMO;
            case 3:
                return EstadoAnimal.SALUDABLE;
            default:
                return EstadoAnimal.TRATADO;
        }
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getEdad() {
        return edad;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public String getSalud() {
        return salud;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public String getEspecie() {
        return especie;
    }

    public EstadoAnimal getEstado() {
        return estado;
    }

    public void setEstado(EstadoAnimal estado) {
        this.estado = estado;
    }

    public void alimentar() {
        if (estado == EstadoAnimal.HAMBRIENTO) {
            System.out.println(nombre + " está comiendo.");
            estado = EstadoAnimal.COMIENDO;
        } else {
            System.out.println(nombre + " no necesita alimento.");
        }
    }

    public void terminarAlimentacion() {
        if (estado == EstadoAnimal.COMIENDO) {
            estado = EstadoAnimal.ALIMENTADO;
            System.out.println(nombre + " ha sido alimentado.");
        }
    }

    public void tratarSalud() {
        if (estado == EstadoAnimal.ENFERMO) {
            estado = EstadoAnimal.TRATADO;
            System.out.println(nombre + " está siendo tratado.");
        } else {
            System.out.println(nombre + " no necesita tratamiento.");
        }
    }

    public void restablecerSalud() {
        if (estado == EstadoAnimal.TRATADO) {
            estado = EstadoAnimal.SALUDABLE;
            System.out.println(nombre + " ha recuperado la salud.");
        }
    }

    public void mostrarInfoAnimales() {
        System.out.println("ID: " + id);
        System.out.println("Nombre propio: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        System.out.println("Habitat: " + habitat);
        System.out.println("País de Origen: " + paisOrigen);
        System.out.println("Dieta específica: " + alimentacion);
        System.out.println("Salud del animal: " + salud);
        System.out.println("Estado del animal: " + estado);
    }
}