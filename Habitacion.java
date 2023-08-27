// Encapsulation: Properties are encapsulated within classes using private access modifiers.
// Inheritance: SuiteRoom and FamilyRoom derive from Room.
// Polymorphism: The showInformation() method is overridden in derived classes.

public class Habitacion {
    private int numero;
    private double precioPorNoche;

    public Habitacion(int numero, double precioPorNoche) {
        this.numero = numero;
        this.precioPorNoche = precioPorNoche;
    }

    public int getNumero() {
        return numero;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void mostrarInformacion() {
        System.out.println("Room number: " + numero);
        System.out.println("Price per night: " + precioPorNoche);
    }
}

// Derived class: SingleRoom (Encapsulation, Inheritance, Polymorphism)
class HabitacionIndividual extends Habitacion {
    private boolean tieneVistaAlMar;

    public HabitacionIndividual(int numero, double precioPorNoche, boolean tieneVistaAlMar) {
        super(numero, precioPorNoche);
        this.tieneVistaAlMar = tieneVistaAlMar;
    }

    public boolean tieneVistaAlMar() {
        return tieneVistaAlMar;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("It has views of the sea: " + (tieneVistaAlMar ? "Yes " : "No "));
    }
}

// Derived class: DoubleRoom (Encapsulation, Inheritance, Polymorphism)
class HabitacionDoble extends Habitacion {
    private int numeroDecamas;

    public HabitacionDoble(int numero, double precioPorNoche, int numeroDecamas) {
        super(numero, precioPorNoche);
        this.numeroDecamas = numeroDecamas;
    }

    public int getNumeroDeCamas() {
        return numeroDecamas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Number of beds: " + numeroDecamas);
    }
}

// Adding more derived classes (Suites and Family Rooms)

// Encapsulation: Properties are encapsulated within classes using private access modifiers.
// Inheritance: SuiteRoom and FamilyRoom derive from Room.
// Polymorphism: The showInformation() method is overridden in derived classes.
class Suite extends Habitacion {
    private boolean tieneJacuzzi;

    public Suite(int numero, double precioPorNoche, boolean tieneJacuzzi) {
        super(numero, precioPorNoche);
        this.tieneJacuzzi = tieneJacuzzi;
    }

    public boolean tieneJacuzzi() {
        return tieneJacuzzi;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("It has a jacuzzi: " + (tieneJacuzzi ? "Yes" : "No"));
    }
}

class HabitacionFamiliar extends Habitacion {
    private int numeroDeCamasExtras;

    public HabitacionFamiliar(int numero, double precioPorNoche, int numeroDeCamasExtras) {
        super(numero, precioPorNoche);
        this.numeroDeCamasExtras = numeroDeCamasExtras;
    }

    public int getNumeroDeCamasExtras() {
        return numeroDeCamasExtras;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Number of extra beds: " + numeroDeCamasExtras);
    }



// Method to calculate the total cost of stay (Encapsulation)
public double calcularCostoTotal(int numNoches, Habitacion habitacion) {
    return numNoches * habitacion.getPrecioPorNoche();
  }
}

