// Definición de la interfaz Forma

/*
  contexto de un sistema que maneja diferentes formas geométricas. Imagina que tienes una interfaz
  Forma con métodos para calcular el área y el perímetro de la forma. Luego, tienes clases que implementan esta interfaz para formas específicas,
  como un cuadrado y un círculo.
*/

interface Forma {
    double calcularArea();
    double calcularPerimetro();
}

// Implementación para un cuadrado
class Cuadrado implements Forma {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}

// Implementación para un círculo
class Circulo implements Forma {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

/*
  En este ejemplo:
  
  La interfaz Forma define métodos calcularArea() y calcularPerimetro() que deben ser implementados por las clases que la utilicen.
  Las clases Cuadrado y Circulo implementan la interfaz Forma proporcionando implementaciones específicas para los métodos de cálculo.
  En la función main, se crean instancias de Cuadrado y Circulo, y se calculan y muestran sus áreas y perímetros.
*/

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las formas
        Cuadrado miCuadrado = new Cuadrado(5);
        Circulo miCirculo = new Circulo(3);

        // Calcular y mostrar áreas y perímetros
        System.out.println("Área del cuadrado: " + miCuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + miCuadrado.calcularPerimetro());

        System.out.println("Área del círculo: " + miCirculo.calcularArea());
        System.out.println("Perímetro del círculo: " + miCirculo.calcularPerimetro());
    }
}

/*
  Este ejemplo ilustra cómo las interfaces en Java pueden ser utilizadas para definir un contrato común
  (en este caso, métodos para calcular área y perímetro) que varias clases pueden implementar de manera específica.
  Este enfoque facilita la extensión del sistema para incluir nuevas formas geométricas sin modificar el código existente.
*/

