public class Persona {
    // Atributos privados
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos públicos para acceder a los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad debe ser un número positivo.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona persona = new Persona("Juan", 30);

        // Acceder a los atributos a través de los métodos públicos
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());

        // Modificar la edad
        persona.setEdad(35);
        System.out.println("Nueva Edad: " + persona.getEdad());

        // Intentar establecer una edad negativa (no se permitirá)
        persona.setEdad(-5); // Esto mostrará un mensaje de error en la consola
    }
}
