package empleados;
class Empleado {
    String id;
    String Nombre;
    String Edad;
    String Genero;
    String Puesto;
    String Experiencia;

    public Empleado (String id, String Nombre, String Edad, String Genero, String Puesto, String Experiencia){
        this.id = id;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this. Genero = Genero;
        this.Puesto = Puesto;
        this.Experiencia = Experiencia;
    }

    public void mostartInfoEmpleados(){
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + Edad);
        System.out.println("Genero: " + Genero);
        System.err.println("Puesto: " + Puesto);
        System.err.println("Experiencia: " + Experiencia);
    }
}
