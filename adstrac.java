// Clase abstracta que define una forma geométrica genérica
abstract class FormaGeometrica {
    // Método abstracto para calcular el área
    public abstract double calcularArea();
}

// Clase concreta que extiende la clase FormaGeometrica
class Circulo extends FormaGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

public class EjemploAbstraccion {
    public static void main(String[] args) {
        // Crear un objeto Circulo
        Circulo circulo = new Circulo(5.0);

        // Calcular y mostrar el área del círculo
        double area = circulo.calcularArea();
        System.out.println("Área del círculo: " + area);
    }
}
