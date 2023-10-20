/*
/*  La composición es un tipo de relación más fuerte que la agregación.
/*  En la composición, un objeto (parte) está compuesto por otros objetos (componentes),
/*  y la vida de los componentes está vinculada a la vida del objeto contenedor.
/*  Si el objeto contenedor se destruye, también lo hacen sus componentes.
/*  Aquí tienes un ejemplo simple de composición en Java con las clases Motor y Coche:
*/

/*
    En este ejemplo, la clase Coche contiene un objeto de la clase Motor.
    La relación entre Coche y Motor es una relación de composición porque un coche está compuesto por un motor.
    Cuando se crea un objeto de la clase Coche, también se crea automáticamente un objeto de la clase Motor.
    La vida del motor está vinculada a la vida del coche.
    En este caso, cuando el coche se apaga, el motor también se apaga.

    Es importante destacar que la composición implica una relación más fuerte entre las clases en comparación con la agregación,
    donde los componentes pueden existir de manera independiente. En la composición,
    la existencia de los componentes está directamente ligada a la existencia del objeto contenedor.
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
