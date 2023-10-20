/*
/*  La composición es un tipo de relación más fuerte que la agregación.
/*  En la composición, un objeto (parte) está compuesto por otros objetos (componentes),
/*  y la vida de los componentes está vinculada a la vida del objeto contenedor.
/*  Si el objeto contenedor se destruye, también lo hacen sus componentes.
/*  Aquí tienes un ejemplo simple de composición en Java con las clases Motor y Coche:
*/

// Clase Motor (componente)
class Motor {
    public void encender() {
        System.out.println("Motor encendido");
    }

    public void apagar() {
        System.out.println("Motor apagado");
    }
}

// Clase Coche (contenedor)
class Coche {
    private Motor motor;  // Composición: un coche tiene un motor

    public Coche() {
        this.motor = new Motor();  // Crear un motor al instanciar un coche
    }

    public void arrancar() {
        motor.encender();
        System.out.println("Coche arrancado");
    }

    public void apagar() {
        motor.apagar();
        System.out.println("Coche apagado");
    }
}

// Clase principal para probar la composición
public class Main {
    public static void main(String[] args) {
        // Crear un coche
        Coche miCoche = new Coche();

        // Arrancar y apagar el coche
        miCoche.arrancar();
        miCoche.apagar();
    }
}
