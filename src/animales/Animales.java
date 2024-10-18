package animales;
class Animales {
    String nombrepropio;
    String Tipo;
    String habitatNatural;
    String edad;
    String alimentacion;
    String salud;
    String paisOrigen;
    String especie;

    public Animales(String nombrepropio, String Tipo, String habitat, String edad, String alimentacion, String salud, String paisOrigen, String especie) {
        this.nombrepropio = nombrepropio;
        this.Tipo = Tipo; 
        this.habitatNatural = habitat;
        this.edad = edad;
        this.alimentacion = alimentacion;
        this.salud = salud;
        this.paisOrigen = paisOrigen;
        this.especie = especie;
    }

    public void mostrarInfoAnimales() {
        System.out.println("Nombre propio: " + nombrepropio);
        System.out.println("Tipo : " + Tipo);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        System.out.println("Habitat: " + habitatNatural);
        System.out.println("País de Origen: " + paisOrigen);
        System.out.println("Dieta específica: " + alimentacion);
        System.out.println("Salud del animal: " + salud);
    }
}