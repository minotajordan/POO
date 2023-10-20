/*
    La agregación es un tipo de relación entre clases en programación orientada a objetos donde una clase
    (contenedor) tiene una relación con otra clase (contenido),
    pero la segunda clase no es completamente dependiente de la primera.
    En otras palabras, la segunda clase puede existir de manera independiente.
    Aquí hay un ejemplo sencillo de agregación en Java con las clases Departamento y Empleado:
*/

/*
    En este ejemplo, la clase Departamento tiene una lista de empleados como atributo
    y puede agregar empleados mediante el método agregarEmpleado. Sin embargo,
    los empleados pueden existir independientemente de un departamento.
    Esto refleja una relación de agregación, donde un departamento "contiene" empleados,
    pero los empleados pueden pertenecer a diferentes departamentos o ninguno.
*/


import java.util.ArrayList;
import java.util.List;

// Clase Empleado
class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase Departamento
class Departamento {
    private String nombre;
    private List<Empleado> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
}

// Clase principal para probar la agregación
public class Main {
    public static void main(String[] args) {
        // Crear empleados
        Empleado empleado1 = new Empleado("Juan");
        Empleado empleado2 = new Empleado("María");

        // Crear departamento
        Departamento departamento = new Departamento("Recursos Humanos");

        // Agregar empleados al departamento
        departamento.agregarEmpleado(empleado1);
        departamento.agregarEmpleado(empleado2);

        // Mostrar información
        System.out.println("Departamento: " + departamento.getNombre());
        System.out.println("Empleados:");
        for (Empleado empleado : departamento.getEmpleados()) {
            System.out.println("- " + empleado.getNombre());
        }
    }
}
